package org.example.DataProviderTest;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderwithExcel {


    @Test(dataProvider = "getData")
    public void test01(String username, String password, String fname, String lname)
    {
        System.out.println(username+","+ password+","+fname+","+lname);
    }
    //Object[][4]

    @DataProvider
    public Object[][] getData() throws IOException {

        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/org/example/DataProviderTest/getData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int rownum = sheet.getLastRowNum();
        int colnum = sheet.getRow(0).getLastCellNum();
        Object[][] data = new Object[rownum][colnum];

        for(int i=1; i<=rownum; i++)
        {
            for(int j=0; j<colnum; j++)
            {
                data[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
            }
        }

        return data;

    }
}
