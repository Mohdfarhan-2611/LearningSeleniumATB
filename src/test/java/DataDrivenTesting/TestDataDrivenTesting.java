package DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataDrivenTesting {

    @DataProvider(name = "LoginData")
    public Object[][] getData()
    {
        return new Object[][]{
                new Object[]{"admin@gmail.com", "pass123@"},
               new Object[]{"admin123@gmail.com", "pass123@"},
                };
    }

    @Test(dataProvider = "LoginData")
    public void logintest(String email, String password)
    {
        System.out.println(email + " | " +password );
    }

}
