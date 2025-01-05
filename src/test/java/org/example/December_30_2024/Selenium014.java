package org.example.December_30_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Selenium014 {

    @Test
    public void testmethod() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");

        Thread.sleep(1000);

        WebElement emailTextbox = driver.findElement(By.xpath("//input[@id='username']"));
        emailTextbox.sendKeys("augtest_040823@idrive.com");

        Thread.sleep(1000);

        WebElement passwordTextbox = driver.findElement(By.xpath("//input[@id='password']"));
        passwordTextbox.sendKeys("123456");

        Thread.sleep(1000);

        WebElement signinbutton = driver.findElement(By.xpath("//button[@id='frm-btn']"));
        signinbutton.click();

        Thread.sleep(12000);

        WebElement sessionExpired = driver.findElement(By.xpath("//div[@class='id-card-cont']/child:: h5[@class='id-card-title']"));


        //assertJ
        assertThat(sessionExpired.getText()).isNotBlank().isNotEmpty().isEqualTo("Your free trial has expired");





        driver.quit();


    }
}
