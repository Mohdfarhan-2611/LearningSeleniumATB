package org.example.December_23_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.List;

public class Selenium012 {


    @Test
    public void testmethod01() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        WebElement link_Start_a_free_trail = driver.findElement(By.linkText("Start a free trial"));
        link_Start_a_free_trail.click();

        Thread.sleep(3000);

        WebElement businessemailinputbox = driver.findElement(By.id("page-v1-step1-email"));
        businessemailinputbox.sendKeys("Farhan");

        WebElement Agreecheckbox = driver.findElement(By.name("gdpr_consent_checkbox"));
        Agreecheckbox.click();

        List<WebElement> button_List = driver.findElements(By.tagName("button"));
        button_List.get(0).click();

        WebElement error_message = driver.findElement(By.className("invalid-reason"));

        //AssetJ
        assertThat(error_message.getText()).isNotBlank().isNotEmpty().isEqualTo("The email address you entered is incorrect.");


        driver.quit();








    }

}
