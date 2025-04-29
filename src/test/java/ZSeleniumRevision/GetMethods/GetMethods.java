package ZSeleniumRevision.GetMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetMethods {

    @Test
    public static void get() throws InterruptedException {

        //get url
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
       // System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle());

        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        System.out.println(driver.getWindowHandles());



        driver.close();

    }


}
