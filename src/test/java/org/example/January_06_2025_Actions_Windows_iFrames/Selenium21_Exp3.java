package org.example.January_06_2025_Actions_Windows_iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Selenium21_Exp3 {

    @Test
    public static void testmethod2() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.get("https://www.makemytrip.com/");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy= 'closeModal']")));
        WebElement close = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        close.click();

        Actions actions = new Actions(driver);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='fromCity']")));
        WebElement fromSource = driver.findElement(By.xpath("//input[@id='fromCity']"));
        actions.moveToElement(fromSource).click().build().perform();
        actions.moveToElement(fromSource).sendKeys("DEL").perform();
        Thread.sleep(5000);
        actions.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();
        Thread.sleep(5000);


        driver.quit();
    }

}
