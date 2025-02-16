package org.example.ExtenrReport;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ReportPractise {


    @Test
    public void report() throws IOException {
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("index2.html");
        spark.config().setReportName("Extent Report Practise");
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("AutomationReport");
        extent.attachReporter(spark);


        ExtentTest test = extent.createTest("LoginTest");
        test.pass("Launched browser");
        test.info("Goto the url");
        test.info("Enter username");
        test.info("Enter password");
        test.info("Click on login");
        test.pass("Logged in successfully");



        extent.flush();
        Desktop.getDesktop().browse(new File("index2.html").toURI());


















    }
}
