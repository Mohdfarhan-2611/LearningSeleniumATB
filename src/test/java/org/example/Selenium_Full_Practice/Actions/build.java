package org.example.Selenium_Full_Practice.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class build {

    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.ebay.com");
        driver.manage().window().maximize();
        WebElement myeBayelement = driver.findElement(By.xpath("//span[normalize-space(text())='My eBay']"));
        WebElement myGarageelement = driver.findElement(By.xpath("//ul[@class='gh-my-ebay__list']/li[11]/a[normalize-space(text())='My Garage']"));

        //Perform mouseHover
        Actions actions = new Actions(driver);
        actions.moveToElement(myeBayelement).click(myGarageelement).build().perform();


        //verify user redirected to mygarage page
        WebElement pagetitleElement = driver.findElement(By.xpath("//div[@class='page-title']/h1"));
        String title = pagetitleElement.getText();
        Assert.assertEquals(title, "My Garage");

        //quit
        driver.quit();
    }
}
