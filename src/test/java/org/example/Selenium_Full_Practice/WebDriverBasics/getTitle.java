package org.example.Selenium_Full_Practice.WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getTitle {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}
