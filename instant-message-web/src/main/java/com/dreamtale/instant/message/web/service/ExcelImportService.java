package com.dreamtale.instant.message.web.service;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;

@Service
public class ExcelImportService {

    public void importChinaArea(){
        File file = new File("E:/code.xlsx");
        try {
            FileInputStream in = new FileInputStream(file);
            Workbook workbook = new XSSFWorkbook(in);
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet){
                String code = String.valueOf(row.getCell(0)).substring(0,6);
                String name = String.valueOf(row.getCell(1));

                System.out.println(code+"|"+ name);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
