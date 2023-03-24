package com.hybrid.utilities;

import com.hybrid.testCases.BaseClass;
import org.apache.poi.xssf.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelData  {

    //EXCEL > WORKBOOKS > SHEETS > ROWS > CELLS
    //OPEN THE EXCEL FILE IN READ MODE  
//        @DataProvider(name = "excel")
//      public String[][] readData() throws IOException {
    public static void main(String[] args) throws IOException {


        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/customer.xlsx");

        //CREATE A WORKBOOK OBJECT TO INTERACT WITH THE EXCEL FILE
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        //CREATE A SHEET OBJECT AND LOCATE THE SHEET USING THE INDEX VALUE
        XSSFSheet sheet = workbook.getSheetAt(0);

        //COUNT THE NO OF ROWS IN THE SHEET
        int rowcount = sheet.getLastRowNum();
        System.out.println(rowcount);

        //COUNT THE NO OF CELLS PRESENT IN A ROW AND MULTIPLY TO GET TOTAL CELLS PRESENT
        int cellcount = sheet.getRow(1).getLastCellNum();
        System.out.println(cellcount);


        //CREATE A STRING 2D ARRAY WITH SAME SIZE AS EXCEL
        String logindata[][] = new String[rowcount][cellcount];

        //ITERATE THROUGH ALL THE ROWS EXCEPT THE HEADER ROW
        for (int i = 1; i <= rowcount; i++) {

            XSSFRow currentrow = sheet.getRow(i);

            //ITERATE THROUGH ALL THE COLUMNS
            for (int j = 0; j < cellcount; j++) {

                //INSERT VALUES OF EACH CELL IN THE STRING ARRAY
                logindata[i - 1][j] = currentrow.getCell(j).toString();
                System.out.print(" " + logindata[i - 1][j]);
            }
            System.out.println();
        }

//        return logindata;
        }
}
