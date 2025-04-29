package A_BrokenLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Broken {

    @Test
    public static void brokenLinks(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://www.deadlinkcity.com/");

        int resCode = 200;
        int brokenLinkCount = 0;
        List<WebElement> elementList = driver.findElements(By.tagName("a"));
        for(WebElement element : elementList)
        {
            String url = element.getAttribute("href");
            if (url != null && !url.isEmpty()) {

                try {
                    URL urlLink = new URL(url);
                    HttpURLConnection huc = (HttpURLConnection) urlLink.openConnection();
                    huc.setRequestMethod("HEAD");
                    huc.connect();
                    resCode = huc.getResponseCode();

                    if (resCode >= 400) {
                        System.out.println(url + " broken link.");
                        brokenLinkCount++;
                    }

                } catch (MalformedURLException e) {

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(brokenLinkCount);

        }

       driver.quit();
    }
}
