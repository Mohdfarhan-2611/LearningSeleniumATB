package org.example.Selenium.HandleDropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;


public class Multiselectdropdown {

/*
 *
 * @author Mandeep Kaur
 * @Date 29 April,2020
 */
public static void main(String[] args)
{
    WebDriver driver = new ChromeDriver();
    driver.get("https://testuserautomation.github.io/DropDown/");
    driver.manage().window().maximize();

//inspect over the Drop Down menu
    WebElement selectCitiesObj = driver.findElement(By.xpath("//select[@name='Cities']"));
    Select selectFromDropDownObj = new Select(selectCitiesObj);

//select by index , index will start from 0 for first value
    selectFromDropDownObj.selectByIndex(0);

//select by value, value to be found in HTML DOM
    selectFromDropDownObj.selectByValue("Texas");

//select by Text given in the dropDownList
    selectFromDropDownObj.selectByVisibleText("CA");


//getOptions : to get all the options from the drop-down
    List<WebElement> allOptionsObj = selectFromDropDownObj.getOptions();

    for (WebElement getoption: allOptionsObj)
        System.out.println(getoption.getText());

//isMultiple : is it multi select drop-down if no then it returns false:
    boolean isSuccess = selectFromDropDownObj.isMultiple();
    System.out.println(isSuccess);

//MultiSelect DropDown
    WebElement selectBillsObj = driver.findElement(By.xpath("//select[@id='Bill']"));
    Select selectBillFromDropDownObj = new Select(selectBillsObj);

    selectBillFromDropDownObj.selectByValue("Travel");
    System.out.println(selectBillFromDropDownObj.getFirstSelectedOption().getText());
    selectBillFromDropDownObj.selectByIndex(3);

    boolean isSuccess2 = selectFromDropDownObj.isMultiple();
    System.out.println(isSuccess2);


    driver.close();

        }
    }

