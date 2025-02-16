package org.example.Selenium_Full_Practice.WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigate {


    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://google.com");
        driver.navigate().to("https://ebay.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
    }
}
