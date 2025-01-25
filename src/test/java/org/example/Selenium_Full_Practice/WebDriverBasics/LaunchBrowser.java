package org.example.Selenium_Full_Practice.WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {


    @Test
    public static void launch() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://netflix.com");
        driver.quit();


    }

}
