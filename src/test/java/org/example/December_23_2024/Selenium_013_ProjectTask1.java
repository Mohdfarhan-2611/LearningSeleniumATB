package org.example.December_23_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Selenium_013_ProjectTask1 {

    @Test
    public void test_method02() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start maximized");


        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement makeappointbutton = driver.findElement(By.linkText("Make Appointment"));
        makeappointbutton.click();

        Thread.sleep(3000);

        WebElement usernameInput = driver.findElement(By.id("txt-username"));
        usernameInput.sendKeys("John Doe");

        WebElement passwordInput = driver.findElement(By.id("txt-password"));
        passwordInput.sendKeys("ThisIsNotAPassword");

        WebElement Loginbutton = driver.findElement(By.id("btn-login"));
        Loginbutton.click();

//      AssertJ
        assertThat(driver.getCurrentUrl()).isNotEmpty().isNotBlank().isEqualTo("https://katalon-demo-cura.herokuapp.com/#appointment");

        driver.quit();
    }
}
