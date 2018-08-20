//package com.dreamtale.instant.message.web.utils;
//
//import org.apache.commons.io.IOUtils;
//import org.csource.common.NameValuePair;
//import org.csource.fastdfs.*;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//
///**
// * <p>Description: FastDFS文件上传下载工具类 </p>
// * <p>Copyright: Copyright (c) 2016</p>
// *
// * @author yangxin
// * @version 1.0
// * @date 2016/10/19
// */
//public class FastDFSClientUtils {
//
//    private static final String CONFIG_FILENAME = "src/main/resources/fdfs/fdfs_client.conf";
//
//    private static StorageClient1 storageClient1 = null;
//
//    // 初始化FastDFS Client
//    static {
//        try {
//            ClientGlobal.init(CONFIG_FILENAME);
//            TrackerClient trackerClient = new TrackerClient(ClientGlobal.g_tracker_group);
//            TrackerServer trackerServer = trackerClient.getConnection();
//            if (trackerServer == null) {
//                throw new IllegalStateException("getConnection return null");
//            }
//
//            StorageServer storageServer = trackerClient.getStoreStorage(trackerServer);
//            if (storageServer == null) {
//                throw new IllegalStateException("getStoreStorage return null");
//            }
//
//            storageClient1 = new StorageClient1(trackerServer,storageServer);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * 上传文件
//     * @param file 文件对象
//     * @param fileName 文件名
//     * @return
//     */
//    public static String uploadFile(File file, String fileName) {
//        return uploadFile(file,fileName,null);
//    }
//
//    /**
//     * 上传文件
//     * @param file 文件对象
//     * @param fileName 文件名
//     * @param metaList 文件元数据
//     * @return
//     */
//    public static String uploadFile(File file, String fileName, Map<String,String> metaList) {
//        try {
//            byte[] buff = IOUtils.toByteArray(new FileInputStream(file));
//            NameValuePair[] nameValuePairs = null;
//            if (metaList != null) {
//                nameValuePairs = new NameValuePair[metaList.size()];
//                int index = 0;
//                for (Iterator<Map.Entry<String,String>> iterator = metaList.entrySet().iterator(); iterator.hasNext();) {
//                    Map.Entry<String,String> entry = iterator.next();
//                    String name = entry.getKey();
//                    String value = entry.getValue();
//                    nameValuePairs[index++] = new NameValuePair(name,value);
//                }
//            }
//            return storageClient1.upload_file1(buff,null,nameValuePairs);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    /**
//     * 获取文件元数据
//     * @param fileId 文件ID
//     * @return
//     */
//    public static Map<String,String> getFileMetadata(String fileId) {
//        try {
//            NameValuePair[] metaList = storageClient1.get_metadata1(fileId);
//            if (metaList != null) {
//                HashMap<String,String> map = new HashMap<String, String>();
//                for (NameValuePair metaItem : metaList) {
//                    map.put(metaItem.getName(),metaItem.getValue());
//                }
//                return map;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    /**
//     * 删除文件
//     * @param fileId 文件ID
//     * @return 删除失败返回-1，否则返回0
//     */
//    public static int deleteFile(String fileId) {
//        try {
//            return storageClient1.delete_file1(fileId);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return -1;
//    }
//
//}