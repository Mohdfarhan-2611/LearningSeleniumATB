package org.example.DataProviderTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class TestDataProvider {


    @Test(dataProvider = "test1")
    public void test01(Employee employee) {
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println("entering username");
        System.out.println("entering password");
        System.out.println("clicking login");
    }


    @DataProvider
    public String[] getData() {
        String[] a = {"Farhan", "Tayyab", "Anam"};
        return a;
    }

    @DataProvider
    public Object[][] getData2() {
        return new Object[][]
                {
                        {"Farhan"},
                        {"name"},
                        {"Anam"}
                };

    }
}

    //Object[][] -> How many iteration you want to run your this test case
    //Second dimension -> how many parameters you want to feed to your test case


