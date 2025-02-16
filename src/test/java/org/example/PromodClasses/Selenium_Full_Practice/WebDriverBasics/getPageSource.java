package org.example.PromodClasses.Selenium_Full_Practice.WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class getPageSource {

    @Test
    public static void getPageSource() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://netflix.com");
        System.out.println(driver.getPageSource());
        String pageSource = driver.getPageSource();

        if (pageSource.contains("Netflix"))
        {
            Assert.assertTrue(true);
        }


        driver.quit();
    }




}
