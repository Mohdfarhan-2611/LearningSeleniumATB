package org.example.December_20_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Selenium009 {


    @Test
    public void testmethod01() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        //Alternamte way to Maximized.
        //driver.manage().window().maximize();

        String title= driver.getTitle();
        System.out.println(title);

        //TestNG Assertion
        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");

        //assertJ assertion
        assertThat(driver.getTitle()).isNotEmpty().isNotNull().isEqualTo("CURA Healthcare Service");
        assertThat(driver.getCurrentUrl()).isEqualTo("https://katalon-demo-cura.herokuapp.com/");

        if(driver.getPageSource().contains("CURA Healthcare Service")) {
            Assert.assertTrue(true);
        }
        else{
            throw new Exception("Heading not found");
        }





        //""    Empty (No space)
        // "  " Blank (with space)



    }

}
