package org.example.Selenium.HandleDropdown;

import io.qameta.allure.testng.TestInstanceParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Singleselectdropdown {


    //we can select only one option from the dropdown

    //1. The Select class is a WebDriver class which provides the implementation of the HTML
    //2. Select is an ordinary class as any other class ,
    // so its object is created by passing the WebElement to its constructor.


    //3. It will throw error as asking to add arguments to the command:

    //   Syntax : Select select = new Select();
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        driver.manage().window().maximize();
        WebElement dropdown = driver.findElement(By.tagName("select"));
        Select select = new Select(dropdown);

        select.selectByVisibleText("Albania");

        List<WebElement> ListAllCities = select.getOptions();
        for(WebElement cities : ListAllCities){
            System.out.println(cities.getText());}


        System.out.println("===========================");


        System.out.println(ListAllCities.size());
        System.out.println(select.getWrappedElement().getSize());




        Thread.sleep(3000);

        driver.quit();





        


    }




}
