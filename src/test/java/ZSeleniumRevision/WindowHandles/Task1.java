package ZSeleniumRevision.WindowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Task1 {

    @Test
    public static void method1() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 300);");

        WebElement tabSearchBox = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
        tabSearchBox.sendKeys("Selenium");

        WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit']"));
        searchButton.click();

        List<WebElement> allLinks = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                By.xpath("//div[@class='wikipedia-search-results']/child::div/a")));

        Actions actions = new Actions(driver);

        // Clicking each search result link
        for (WebElement eachLink : allLinks) {
            System.out.println("Link Text: " + eachLink.getText());
            actions.moveToElement(eachLink).click().perform();
        }

        Set<String> IDs = driver.getWindowHandles();
        for(String id : IDs){
            System.out.println(id);
            driver.switchTo().window(id);
            String Title = driver.getTitle();
            System.out.println("Title is "+Title);
            driver.close();
        }

        // Add a small wait if needed to see the result
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
