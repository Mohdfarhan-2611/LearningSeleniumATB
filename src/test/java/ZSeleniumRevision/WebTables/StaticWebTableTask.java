package ZSeleniumRevision.WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticWebTableTask {

    @Test
    public static void method1() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com/");
        driver.manage().window().maximize();

        WebElement fromDropDown = driver.findElement(By.name("fromPort"));
        WebElement toDropDown = driver.findElement(By.name("toPort"));
        WebElement findFlightButton = driver.findElement(By.xpath("//input[@type='submit']"));
        fromDropDown.click();
        Select select1 = new Select(fromDropDown);
        Select select2 = new Select(toDropDown);

        for(WebElement element : select1.getOptions()){
            if (element.getText().equalsIgnoreCase("paris")){
                element.click();
            }
        }

        for (WebElement element : select2.getOptions()){
            if(element.getText().equalsIgnoreCase("london")){
                element.click();
            }
        }

        findFlightButton.click();

        List<WebElement> rowsCount = driver.findElements(By.xpath("//table[@class='table']//tbody/tr"));
        int rowSize=0;
        for(WebElement element: rowsCount){
            rowSize++;
        }
        List<WebElement> colCount = driver.findElements(By.xpath("//table[@class='table']//tbody/tr/td"));
        int colSize = 0;
        for(WebElement element : colCount){
            colSize++;
        }

        List<String> list = new ArrayList<>();
        String[] str = new String[rowSize];
        int minnumber = 0;
        int min=0;
        for(int i=1; i<=rowSize; i++){
            WebElement element = driver.findElement(By.xpath("//table[@class='table']//tbody/tr["+i+"]/td[6]"));
            if(min<Integer.parseInt(element.getText())){
                min=Integer.parseInt(element.getText());
                minnumber++;
            }
        }

        System.out.println(minnumber);














    }


}
