package org.example.PromodClasses.January_03_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.List;

public class Selenium016 {

    @Test
    public void testmethod() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://cdpn.io/AbdullahSajjad/fullpage/LYGVRgK?anon=true$view=fullpage");

        Thread.sleep(5000);

        driver.switchTo().frame("result");
//        // Scroll down using the PAGE_DOWN key
//        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
//
//// Or scroll down using the DOWN arrow key
//        driver.findElement(By.tagName("body")).sendKeys(Keys.ARROW_DOWN);


        //JavascriptExecutor js = (JavascriptExecutor) driver;
// Scroll down by 1000 pixels
// js.executeScript("window.scrollBy(0,1000)")
// js.executeScript("window.scrollTo(0, document.body.scrollHeight)");



        WebElement submitbutton = driver.findElement(By.xpath("//button[text()='Submit']"));
        submitbutton.click();

        WebElement usernameErrormessage = driver.findElement(By.xpath("//input[@id='username']/following-sibling::small"));
        System.out.println(usernameErrormessage.getText());

        assertThat(usernameErrormessage.getText()).isNotEmpty().isNotBlank().isEqualTo("Username must be at least 3 characters");

        driver.quit();

    }
}
