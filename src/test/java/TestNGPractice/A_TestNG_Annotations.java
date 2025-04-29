package TestNGPractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A_TestNG_Annotations {

    @BeforeTest
    public void getToken(){
        System.out.println("1");
    }

    @AfterTest
    public void getBookingID(){
        System.out.println("2");
    }

    @Test
    public void getUpdate(){
        System.out.println("3");
    }

}
