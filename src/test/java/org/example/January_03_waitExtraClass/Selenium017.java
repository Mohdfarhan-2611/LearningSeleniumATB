package org.example.January_03_waitExtraClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Selenium017 {


    @Test
    public static void testMethod1()
    {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        driver.get("https://the-internet.herokuapp.com/dropdown");
        System.out.println(driver.getTitle());

        WebElement dropdownelement = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdownelement);
        select.selectByVisibleText("Option 1");

        driver.quit();



    }
}
