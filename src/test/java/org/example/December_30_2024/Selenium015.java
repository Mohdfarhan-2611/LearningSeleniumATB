package org.example.December_30_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Selenium015 {

    @Test
    public void testmethod() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");

        WebElement serachtext = driver.findElement(By.xpath("//input[@placeholder='Search for anything']"));
        serachtext.sendKeys("macmini");

        Thread.sleep(2000);

        WebElement searchbutton = driver.findElement(By.xpath("//input[@value='Search']"));
        searchbutton.click();

        List<WebElement> titleList = driver.findElements(By.xpath("(//div[@class='s-item__title'])[position() >=3]"));
        List<WebElement> pricelist = driver.findElements(By.xpath("(//span[@class='s-item__price'])[position()>=3]"));

        int size = Math.min(titleList.size(),pricelist.size());

        for(int i = 0; i<size; i++)
        {
            System.out.println(i + ":" + titleList.get(i).getText() + " || " + pricelist.get(i).getText() );
        }

        driver.quit();

    }
}
