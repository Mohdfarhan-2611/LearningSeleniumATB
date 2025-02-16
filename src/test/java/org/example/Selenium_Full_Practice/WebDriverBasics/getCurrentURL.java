package org.example.Selenium_Full_Practice.WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getCurrentURL {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        driver.quit();

    }
}
