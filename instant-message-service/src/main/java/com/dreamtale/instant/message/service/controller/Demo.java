package com.dreamtale.instant.message.service.controller;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.math.BigDecimal;

public class Demo {

    private static Logger logger = LoggerFactory.getLogger(Demo.class);

    public static void main(String[] args) {
        File file = new File("/Users/dreamtale/Downloads/OneDrive/发票/2019/北京智麒云互联科技有限责任公司/invalid");
        File[] files = file.listFiles();
        logger.info("文件数量：{}", files.length);
        BigDecimal total = new BigDecimal("0");
        for (File temp : files) {
            String fileName = temp.getName();
            if (StringUtils.equals(".DS_Store", fileName)) continue;
            logger.info("文件名：{}", fileName);
            BigDecimal price = new BigDecimal(fileName.substring( fileName.lastIndexOf("-")+1, fileName.lastIndexOf(".")));
            logger.info("价格 = {}", price);
            total = total.add(price);
        }
        logger.info("总计 = {}", total);

    }
}
