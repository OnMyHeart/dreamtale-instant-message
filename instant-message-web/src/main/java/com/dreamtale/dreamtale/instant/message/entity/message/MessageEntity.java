package com.dreamtale.dreamtale.instant.message.entity.message;

import java.io.Serializable;

public class MessageEntity implements Serializable{

    private String fromUserCode;

    private String toUserCode;

    private String messageStr;

    public String getFromUserCode() {
        return fromUserCode;
    }

    public void setFromUserCode(String fromUserCode) {
        this.fromUserCode = fromUserCode;
    }

    public String getToUserCode() {
        return toUserCode;
    }

    public void setToUserCode(String toUserCode) {
        this.toUserCode = toUserCode;
    }

    public String getMessageStr() {
        return messageStr;
    }

    public void setMessageStr(String messageStr) {
        this.messageStr = messageStr;
    }
}
