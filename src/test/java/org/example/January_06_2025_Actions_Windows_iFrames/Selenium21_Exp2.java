package org.example.January_06_2025_Actions_Windows_iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Selenium21_Exp2 {

    @Test
    public static void testmethod2()
    {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get("https://www.spicejet.com/");

        WebElement fromOrigin = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input"));
        //fromOrigin.sendKeys("Kolkata");

        Actions actions = new Actions(driver);
        actions.moveToElement(fromOrigin).click().sendKeys("BLR").build().perform();





        driver.quit();
    }

}
