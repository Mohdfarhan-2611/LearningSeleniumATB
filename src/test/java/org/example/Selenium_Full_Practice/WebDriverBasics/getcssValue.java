package org.example.Selenium_Full_Practice.WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class getcssValue {


    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        WebElement element = driver.findElement(By.xpath("//img[@alt='Google']"));

        //getcssValue
        String height = element.getCssValue("max-height");
        System.out.println(height);










    }
}
