package org.example.Selenium_Full_Practice.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextClick {


    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.ebay.com");
        driver.manage().window().maximize();
        WebElement myeBayelement = driver.findElement(By.xpath("//span[normalize-space(text())='My eBay']"));

        Actions actions = new Actions(driver);

        actions.moveToElement(myeBayelement).perform();
        actions.contextClick(myeBayelement).perform();

        driver.quit();

    }
}
