package org.example.December_23_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Selenium011 {


    @Test
    public void testmethod01() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

//        WebElement link_Start_a_free_trail = driver.findElement(By.linkText("Start a free trial"));
//        link_Start_a_free_trail.click();

        WebElement link_Start_a_free_trail = driver.findElement(By.partialLinkText("free trial"));
        link_Start_a_free_trail.click();




        driver.quit();








    }

}
