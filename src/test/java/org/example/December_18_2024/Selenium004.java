package org.example.December_18_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium004 {

    @Test
    public void test_selenium(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
    }
}
