package com.dreamtale.instant.message.service.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

@ServerEndpoint("/demo/{sid}")
@Component
public class WebSocketServer {

    private static Logger logger = LoggerFactory.getLogger(WebSocketServer.class);

    private static int onlineCount = 0;

    private Session session;

    private String sid;

    private static CopyOnWriteArrayList<WebSocketServer> writeArrayList = new CopyOnWriteArrayList<>();

    @OnOpen
    public void onOpen(Session session, @PathParam("sid") String sid){
        this.session = session;
        writeArrayList.add(this);
        addOnlineCount();
        this.sid = sid;
        logger.info("有新窗口开始监听:"+sid+",当前在线人数为:" + getOnlineCount());
        try {
            sendMessage("连接成功");
        } catch (IOException e) {
            logger.error("websocket IO异常");
        }

    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose() {
        writeArrayList.remove(this);  //从set中删除
        subOnlineCount();           //在线数减1
        logger.info("有一连接关闭！当前在线人数为" + getOnlineCount());
    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @param message 客户端发送过来的消息*/
    @OnMessage
    public void onMessage(String message, Session session) {
        logger.info("收到来自窗口"+sid+"的信息:"+message);
        //群发消息
        for (WebSocketServer item : writeArrayList) {
            try {
                item.sendMessage(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     *
     * @param session
     * @param error
     */
    @OnError
    public void onError(Session session, Throwable error) {
        logger.error("发生错误");
        error.printStackTrace();
    }
    /**
     * 实现服务器主动推送
     */
    public void sendMessage(String message) throws IOException {
        this.session.getBasicRemote().sendText(message);
    }


    /**
     * 群发自定义消息
     * */
    public static void sendInfo(String message,@PathParam("sid") String sid) throws IOException {
        logger.info("推送消息到窗口"+sid+"，推送内容:"+message);
        for (WebSocketServer item : writeArrayList) {
            try {
                //这里可以设定只推送给这个sid的，为null则全部推送
                if(sid==null) {
                    item.sendMessage(message);
                }else if(item.sid.equals(sid)){
                    item.sendMessage(message);
                }
            } catch (IOException e) {
                continue;
            }
        }
    }


    private static synchronized int getOnlineCount(){
        return WebSocketServer.onlineCount;
    }

    private static synchronized void addOnlineCount(){
        WebSocketServer.onlineCount++;
    }

    private static synchronized void subOnlineCount(){
        if (getOnlineCount()>0) {
            WebSocketServer.onlineCount--;
        }
    }
}
