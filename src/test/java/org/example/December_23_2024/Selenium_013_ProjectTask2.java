package org.example.December_23_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Selenium_013_ProjectTask2 {

    @Test
    public void test_method02() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start maximized");


        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://awesomeqa.com/practice.html");

        WebElement Firstnametextbox = driver.findElement(By.name("firstname"));
        Firstnametextbox.sendKeys("Mohd");

        WebElement Lastnametextbox = driver.findElement(By.name("lastname"));
        Lastnametextbox.sendKeys("Farhan");

        WebElement genderRadiobutton = driver.findElement(By.id("sex-0"));
        genderRadiobutton.click();

        WebElement expirenceRadiobutton = driver.findElement(By.id("exp-1"));
        expirenceRadiobutton.click();

        WebElement datetextbox = driver.findElement(By.id("datepicker"));
        datetextbox.sendKeys("02-02-2025");

        WebElement professionCheckbox = driver.findElement(By.id("profession-0"));
        professionCheckbox.click();

        WebElement toolCheckbox = driver.findElement(By.id("tool-0"));
        toolCheckbox.click();

        Thread.sleep(5000);

        driver.quit();

    }
}
