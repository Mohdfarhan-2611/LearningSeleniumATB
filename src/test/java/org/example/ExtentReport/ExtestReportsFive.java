package org.example.ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;

public class ExtestReportsFive {

    @Test
    public void extentTest()
    {
        ExtentReports extent = new ExtentReports(); //creating object for extent report
        ExtentSparkReporter spark = new ExtentSparkReporter("index.html"); //html file will be generated
        extent.attachReporter(spark);

        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("My Automation Report");
        spark.config().setReportName("Extent Report Demo");




        ExtentTest test1 = extent.createTest("Login Test").assignAuthor("Farhan").assignCategory("Regression").assignDevice("chrome 84");
        test1.pass("Login test started successfully");
        test1.pass("URL Loaded");
        test1.pass("values entered");
        test1.pass("Login Test completed successfully");
        test1.fail("close test failed");



        ExtentTest test2 = extent.createTest("Login Test").assignCategory("smoke").assignAuthor("Naveen").assignDevice("Firefox 60");
        test2.pass("Login test started successfully");
        test2.pass("URL Loaded");
        test2.pass("values entered");
        test2.pass("Login Test completed successfully");


        extent.flush();


    }
}
