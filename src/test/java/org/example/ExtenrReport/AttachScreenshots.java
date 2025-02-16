package org.example.ExtenrReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class AttachScreenshots {

    ExtentReports extent;
    ExtentSparkReporter spark;
    WebDriver driver;

    @BeforeSuite
    public void setup()
    {
        extent = new ExtentReports();
        spark = new ExtentSparkReporter("index2.html");
        spark.config().setReportName("Extent Report Practise");
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("AutomationReport");
        extent.attachReporter(spark);
    }

    @AfterSuite
    public void teardown() throws IOException {
        extent.flush();
        Desktop.getDesktop().browse(new File("index2.html").toURI());
    }

    @Test
    public void addScreenshots()
    {
        ExtentTest test = extent.createTest("LoginTest");
        driver = new ChromeDriver();
        test.pass("Browser Opened");
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Automation testing", Keys.ENTER);
        test.pass("Value Entered", MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
    }

    public String getBase64() {
      return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);

    }


}
