package org.example.Selenium_Full_Practice.WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class getCurrentURL {


    @Test
    public static void getCurrentURL() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://netflix.com");
        System.out.println(driver.getCurrentUrl());
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.netflix.com/in/" );

        driver.quit();
    }

}
