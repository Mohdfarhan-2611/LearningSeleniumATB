package org.example.Selenium_Full_Practice.DropDown;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeID {

    // Method to get all attributes of a WebElement using JavaScript
    public static Map<String, String> getAllAttributes(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, String> attributes = new HashMap<>();

        String script =
                "var items = {}; " +
                        "for (var i = 0; i < arguments[0].attributes.length; i++) { " +
                        "   items[arguments[0].attributes[i].name] = arguments[0].attributes[i].value; " +
                        "} return items;";

        attributes = (Map<String, String>) js.executeScript(script, element);
        return attributes;
    }

    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Login
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@name='password' and @type='password']"));
        password.sendKeys("Hacker@4321", Keys.ENTER);

        // Wait for Employment Status dropdown
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Employment Status']/parent::div/following-sibling::div/div/div")));

        // Retrieve and print all attributes of the dropdown
        Map<String, String> dropdownAttributes = getAllAttributes(dropdown, driver);
        System.out.println("Employment Status Dropdown Attributes:");
        for (Map.Entry<String, String> entry : dropdownAttributes.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Open the dropdown
        Actions actions = new Actions(driver);
        actions.moveToElement(dropdown).click().perform();

        // Wait for dropdown options to be visible
        WebElement dropdownContainer = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@role='listbox']")));

        boolean isSelected = false;
        int attempts = 0;

        while (attempts < 2 && !isSelected) {  // Retry mechanism to handle stale elements
            try {
                // Re-fetch dropdown options each time to avoid stale element exception
                List<WebElement> dropdownOptions = driver.findElements(By.xpath("//div[@role='listbox' and contains(@class, 'oxd-select-dropdown')]//div"));

                for (WebElement option : dropdownOptions) {
                    if (option.getText().trim().equals("Terminated")) {
                        option.click();
                        isSelected = true;
                        break;
                    }
                }
            } catch (StaleElementReferenceException e) {
                System.out.println("StaleElementReferenceException occurred, retrying...");
            }
            attempts++;
        }

        // Close the browser
        driver.quit();
    }
}
