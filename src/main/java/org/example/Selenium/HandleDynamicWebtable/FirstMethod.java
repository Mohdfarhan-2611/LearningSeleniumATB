package org.example.Selenium.HandleDynamicWebtable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FirstMethod
{

    public static void main(String[] args)
    {


        WebDriver driver = new ChromeDriver();
        driver.get("https://testuserautomation.github.io/WebTable/");
        driver.manage().window().maximize();



// Method 1
        String before_xpath = "//table/tbody/tr[";
        String after_xpath = "]/td[2]";

        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        int rowSize = rows.size();
        System.out.println("Row size: "+rowSize);

        for (int i = 2; i <= rowSize; i++)
        {
            String firstNames = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
            System.out.println("FirstName "+firstNames);
// Now click the checkBox where first Name would be Will
            if (firstNames.contains("Will"))
            {
// click the checkBox
                driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[1]/input")).click();
                System.out.println("candidate has been selected");
                break;
            }
        }

        driver.quit();
    }
}
