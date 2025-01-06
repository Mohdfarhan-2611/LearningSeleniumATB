package org.example.December_30_2024;

import org.example.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;


import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static org.assertj.core.api.Assertions.*;
import static org.example.WaitHelper.checkVisibility;

public class Selenium014 {

    @Test
    public void testmethod() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        WebElement emailTextbox = driver.findElement(By.xpath("//input[@id='username']"));
        emailTextbox.sendKeys("augtest_040823@idrive.com");

        WebElement passwordTextbox = driver.findElement(By.xpath("//input[@id='password']"));
        passwordTextbox.sendKeys("123456");

        WebElement signinbutton = driver.findElement(By.xpath("//button[@id='frm-btn']"));
        signinbutton.click();

//       Explicit wait
//       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='id-card-cont']/child:: h5[@class='id-card-title']")));
        checkVisibility(driver, By.xpath("//div[@class='id-card-cont']/child:: h5[@class='id-card-title']") );
        WebElement sessionExpired = driver.findElement(By.xpath("//div[@class='id-card-cont']/child:: h5[@class='id-card-title']"));
        System.out.println(sessionExpired.getText());


        //assertJ
       assertThat(sessionExpired.getText()).isNotBlank().isNotEmpty().isEqualTo("Your free trial has expired");
       driver.quit();

    }
}
