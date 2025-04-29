package org.example.DataProviderTest2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestDataProvider {





    @Test(dataProvider = "Test02")
    public void testdataprovider(Object email, Object password)
    {
        System.out.println(email + " "+ password);

    }


    @DataProvider(name= "Test01")
    public Object[] getData1()
    {

        Object[] name= {"Farhan", 123};
        return name;
    }


    @DataProvider(name = "Test02")
    public Object[][] getData2()
    {
        Object[][] a = {
                {"Farhan@gmail.com",1234},
                {"Tayyab@gmail.com",123}
        };

        return a;
    }


    @DataProvider(name = "Test03")
    public Iterator<Object[]> getData3() {
        List<Object[]> data = new ArrayList<>();

        Object[] a1 = {"Ali", "shan"};
        Object[] a2 = {"sara", "khan"};

        // Adding data sets to the list
        data.add(a1);
        data.add(a2);

        data.add(new Object[]{"John", "Maan"});
        data.add(new Object[]{"Jerry", "jon"});


        return data.iterator();
    }









}
