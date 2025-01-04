package org.example.December_20_2024;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium007 {


    @Test
    public void testmethod01()
    {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addExtensions(new File("C:/Users/mhdfa/IdeaProjects/LearningSeleniumATB/src/test/java/org/example/December_20_2024/adblocker.crx"));


        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://youtube.com");
    }

}
