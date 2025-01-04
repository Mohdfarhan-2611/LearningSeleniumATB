package org.example.December_20_2024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium008 {


    @Test
    public void testmethod01()
    {
//        Chromium - Paren project
//            - Chrome
//            - Edge
//            - Opera
//            - Brave Browser
//            - TorX Browser
//
//          Firefox - Mozilla
//
//          Safari - Apple

           EdgeDriver driver = new EdgeDriver();
           driver.get("https://sdet.live");

          //Close vs Quit
           //driver.close();
           //driver.quit();



    }

}
