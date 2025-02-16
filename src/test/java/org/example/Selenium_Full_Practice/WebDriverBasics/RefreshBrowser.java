package org.example.Selenium_Full_Practice.WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class RefreshBrowser {


    @Test
    public static void refresh()
    {
        WebDriver driver =  new EdgeDriver();
        driver.get("https://google.com");
        driver.navigate().refresh(); //refresh1
        System.out.println(driver.getCurrentUrl());
        driver.get(driver.getCurrentUrl()); //refresh2
        driver.navigate().to(driver.getCurrentUrl());  //refresh3
        driver.findElement(By.name("q")).sendKeys(Keys.F5); //refresh4


        driver.quit();

    }
}
