package org.example.Selenium_Full_Practice.WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class getTitle {

    @Test
    public static void getTitle() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://netflix.com");
        System.out.println(driver.getTitle());
        String title = driver.getTitle();
        Assert.assertEquals(title, "Netflix India – Watch TV Shows Online, Watch Movies Online");
        driver.quit();





    }

}
