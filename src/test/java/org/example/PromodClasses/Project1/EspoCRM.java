package org.example.PromodClasses.Project1;

import io.qameta.allure.Description;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class EspoCRM {
    static String URL = "https://demo.us.espocrm.com/?l=en_US#";

    @Description("Verify user is able to click on Advance pack link")
    @Test(priority = 1)
    public static void test_advancepack_link()
    {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get(URL);

        WebElement advance_pack_element = driver.findElement(By.linkText("Advanced Pack"));
        advance_pack_element.click();

        driver.quit();

    }


    @Test(priority = 2)
    public static void Sales_pack_link_test()
    {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get(URL);

        WebElement sales_pack_link_element = driver.findElement(By.linkText("Sales Pack"));
        sales_pack_link_element.click();
        driver.quit();

    }



    @Test(priority = 3)
    public static void project_management_link()
    {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get(URL);

        WebElement project_management_link = driver.findElement(By.linkText("Project Management"));
        project_management_link.click();

        driver.quit();
    }






    @Test(priority = 4)
    public static void login_test()
    {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get(URL);

        WebElement login_button = driver.findElement(By.xpath("//button[@id='btn-login']"));
        login_button.click();

        driver.quit();

    }


}
