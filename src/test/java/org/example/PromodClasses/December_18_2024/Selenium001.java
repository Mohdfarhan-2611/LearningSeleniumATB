package org.example.PromodClasses.December_18_2024;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium001 {

    @Test
    public void test_selenium001()
    {
        //Selenium 3
        //System.setProperty("webDriver.gecko.driver", "path to the driver`")

        //Selenium 4
        //FirefoxDriver driver = new FirefoxDriver();
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
    }

}
