package org.example.PromodClasses.January_06_2025_Actions_Windows_iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Selenium20_ActionExp1 {



    @Test
    public static void testmethod()
    {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get("https://awesomeqa.com/practice.html");

        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
        //KEYBOARDS EVENTS
        //Keydown -> Shift -> SendKeys -> Keyup

        Actions action = new Actions(driver);
        action.keyDown(Keys.SHIFT).sendKeys(firstname, "the testing academy")
                .keyUp(Keys.SHIFT).build().perform();





    }
}
