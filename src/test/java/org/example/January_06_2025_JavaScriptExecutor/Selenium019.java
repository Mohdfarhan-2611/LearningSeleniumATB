package org.example.January_06_2025_JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium019 {

    @Test
    public void testmethod19()
    {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        String url = "https://selectorshub.com/xpath-practice-page/";
        driver.get(url);

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0, 500)");

        String url2 = javascriptExecutor.executeScript("return document.URL").toString();
        System.out.println(url2);

        String title = javascriptExecutor.executeScript("return document.title").toString();
        System.out.println(title);
        

        driver.quit();

    }


}
