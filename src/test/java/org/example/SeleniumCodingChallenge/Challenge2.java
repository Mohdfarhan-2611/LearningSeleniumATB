package org.example.SeleniumCodingChallenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Challenge2 {
    static  WebDriver driver;
    static  int count = 1;

    private static final By CURRENT_WORLD_POPULATION = By.xpath("//div[@class='maincounter-number']/span");
    private static final By TODAYS_AND_THISYEAR_DATA = By.xpath("//div[@class='col-sm-6 col-counters']/descendant::span[@class='rts-counter']");

    static void getPopulationData(By locator){

        List<WebElement> webElements = driver.findElements(locator);
        for(WebElement element: webElements)
        {
            System.out.println(element.getText());
        }

    }

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.worldometers.info/world-population/");


        while (count<21) {
            System.out.println("sec "+count);
            System.out.println("-----Current World Population-------");
            getPopulationData(CURRENT_WORLD_POPULATION);
            System.out.println("-----Today's and This Year -------");
            getPopulationData(TODAYS_AND_THISYEAR_DATA);
            Thread.sleep(1000);
            count++;
        }
        
        driver.quit();
    }
}
