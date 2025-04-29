package org.example.SeleniumCodingChallenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Challenge1 {

    private static final By NEXT_BUTTON = By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][3]");
    private static final By MONTH_ELEMENT = By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']/child::div[2]");
    private static final By CALENDER_ICON = By.xpath("//div[@id='onwardCal']");

    static WebDriver driver;

    public static void getMonthHoliday(String targetMonth, WebDriverWait wait) throws InterruptedException {

        WebElement dateCalender = wait.until(ExpectedConditions.visibilityOfElementLocated(CALENDER_ICON));
        dateCalender.click();

        WebElement monthText = wait.until(ExpectedConditions.visibilityOfElementLocated(MONTH_ELEMENT));
        String currentMonthFullText = monthText.getText().trim();
        String targetMonthFullText = targetMonth.trim();
        String[] currentMonthArray = currentMonthFullText.split(" ");
        String[] targetMonthArray = targetMonthFullText.split(" ");

        while (!currentMonthArray[0].equalsIgnoreCase(targetMonthArray[0]) ||
                !currentMonthArray[1].contains(targetMonthArray[1])) {

            System.out.println(currentMonthFullText);
            WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(NEXT_BUTTON));
            nextButton.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(MONTH_ELEMENT));
            currentMonthFullText = monthText.getText().trim();
            currentMonthArray = currentMonthFullText.split(" ");
        }

        System.out.println(currentMonthFullText);
    }


    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Initialize wait here
        getMonthHoliday("Dec 2026", wait);
        driver.quit();

    }
}
