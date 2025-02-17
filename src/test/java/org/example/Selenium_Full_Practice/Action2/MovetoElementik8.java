package org.example.Selenium_Full_Practice.Action2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MovetoElementik8 {
    public static void main(String[] args) {
        // Set up WebDriver for Edge
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        // Open the website
        driver.get("http://automationpractice.pl/index.php");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));


        // Wait for the menu to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement DressesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/descendant::a[@title='Dresses'][2]")));

        // Hover over the 'Dresses' menu using Actions class
        Actions actions = new Actions(driver);
        actions.moveToElement(DressesMenu).perform();

        // Wait for the submenu to appear
        WebElement dressesLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/descendant::a[@title='Evening Dresses'][2]")));
        dressesLink.click();

        System.out.println("Successfully clicked on Evening Dresses");

        // Close the browser
        driver.quit();
    }
}
