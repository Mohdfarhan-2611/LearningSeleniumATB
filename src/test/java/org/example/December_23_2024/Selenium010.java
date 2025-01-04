package org.example.December_23_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Selenium010 {


    @Test
    public void testmethod01() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        //Assertion
        assertThat(driver.getTitle()).isEqualTo("Login - VWO");
        assertThat(driver.getCurrentUrl()).isEqualTo("https://app.vwo.com/#/login");



        WebElement username = driver.findElement(By.id("login-username"));
        username.sendKeys("abc@gmail.com");

        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("pass123@");

        driver.findElement(By.id("js-login-btn")).click();

        Thread.sleep(5000);

        String error = driver.findElement(By.id("js-notification-box-msg")).getText();
        String expectederror = "Your email, password, IP address or location did not match";

        //asserJ
        assertThat(error).isNotEmpty().isNotBlank().isEqualTo(expectederror);

        driver.quit();








    }

}
