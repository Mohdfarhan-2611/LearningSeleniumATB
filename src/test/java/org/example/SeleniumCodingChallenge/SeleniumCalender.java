package org.example.SeleniumCodingChallenge;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SeleniumCalender {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.redbus.in");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // **1. Click Calendar**
        WebElement calendarIcon = wait.until(ExpectedConditions.elementToBeClickable(By.id("onwardCal")));
        calendarIcon.click();

        // **2. Scroll Down to Make Calendar Visible**
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 360);");

        Thread.sleep(2000);
        List<Object> dateRow = new ArrayList<>();
        List<Object> saturdayWeekends = new ArrayList<>();






        // **5. Print Extracted Data**
        System.out.println("All Dates: " + dateRow);
        System.out.println("Saturday Dates: " + saturdayWeekends);

        Thread.sleep(2000);
        driver.quit();
    }
}
