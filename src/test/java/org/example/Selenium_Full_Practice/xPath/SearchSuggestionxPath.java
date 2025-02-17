package org.example.Selenium_Full_Practice.xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchSuggestionxPath {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Automation Testing");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Here I have found the xpath without using index
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']/descendant::div[@id='c7mM1c']"))).click();
        driver.quit();













    }
}
