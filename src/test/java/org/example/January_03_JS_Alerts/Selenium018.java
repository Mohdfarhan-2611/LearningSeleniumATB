package org.example.January_03_JS_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Selenium018 {


    @Test
    public static void testmethod()
    {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");


        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

//        WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
//        jsAlert.click();
//        WebElement jsConfirm = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
//        jsConfirm.click();

        WebElement jsPrompt = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        jsPrompt.click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Farhan");
        alert.accept();

        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertEquals(result.getText(),"You entered: Farhan");

        driver.quit();

    }
}
