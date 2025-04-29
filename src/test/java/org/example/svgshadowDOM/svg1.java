package org.example.svgshadowDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class svg1 {

    @Test
    public void lauch(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://crio-qkart-frontend-qa.vercel.app/login");
        driver.manage().window().maximize();


        WebElement loginlink = driver.findElement(By.xpath("//button[@type='button' and contains(text(),'Login')]"));
        loginlink.click();

        WebElement usernametext = driver.findElement(By.xpath("//input[@id='username']"));
        usernametext.sendKeys("admin");

        WebElement passwordtext = driver.findElement(By.xpath("//input[@id='password']"));
        passwordtext.sendKeys("admin");

        WebElement loginbutton = driver.findElement(By.xpath("//button[@type='button' and contains(text(),'Login to QKart')]"));
        loginbutton.click();

        List<WebElement> usernamesvg = driver.findElements(By.xpath("//*[name()='svg']"));
        for(WebElement element : usernamesvg)
        {
            System.out.println("element "+element.getText().toString());
        }


        driver.quit();


    }

}
