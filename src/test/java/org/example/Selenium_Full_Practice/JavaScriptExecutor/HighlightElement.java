package org.example.Selenium_Full_Practice.JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HighlightElement {


    public static void flash(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String bgcolor = element.getCssValue("background-color");


    }



    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.ebay.com");
//        WebElement search_Btn = driver.findElement(By.xpath("//button[@value='Search']"));
//        String color = search_Btn.getCssValue("background-color");
//        System.out.println(color);



    }
}
