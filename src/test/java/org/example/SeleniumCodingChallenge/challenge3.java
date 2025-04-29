package org.example.SeleniumCodingChallenge;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class challenge3 {

    static WebDriver driver;
    static WebDriverWait wait;

    private static final By PRODUCT_NAME = By.xpath("//div[@data-qa='product-name']");
    private static final By RECOMMENDEDFORYOU = By.xpath("//img[contains(@src, 'https://f.nooncdn.com/mpcms/EN0001/assets/1e06a839-ba31-4d5d-8638-29fed7d86d47.png?format=avif')]");
    private static final By NEXT_BUTTON = By.xpath("//div[@class='componentArea-5']//div[contains(@class, 'swiper-button-next custom-navigation')]");

    public static void main(String[] args) {
        try {
            // Set up WebDriver
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.noon.com/uae-en/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            wait = new WebDriverWait(driver, Duration.ofSeconds(30));

            // Scroll to the recommended section
            ScrollToElementByJS(RECOMMENDEDFORYOU);

            // Get product names
            getProductName(PRODUCT_NAME);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Quit driver to close browser
            if (driver != null) {
                driver.quit();
            }
        }
    }


    static void getProductName(By locator) {
        while (true) {
            List<WebElement> productNames = driver.findElements(locator);

            if (productNames.isEmpty()) {
                System.out.println("No products found.");
            } else {
                System.out.println("Product Names:");
                for (WebElement product : productNames) {
                    System.out.println(product.getText());
                }
            }

            try {
                WebElement nextElement = driver.findElement(NEXT_BUTTON);
                if (nextElement.isDisplayed() && nextElement.isEnabled()) {
                    nextElement.click();
                    Thread.sleep(2000); // Wait for products to load
                } else {
                    break; // Exit loop if the next button is disabled
                }
            } catch (NoSuchElementException | StaleElementReferenceException e) {
                System.out.println("Next button not found or no longer available.");
                break;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void ScrollToElementByJS(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        int maxScrolls = 5; // Limit number of scroll attempts to prevent infinite loops
        int scrollAttempts = 0;

        while (scrollAttempts < maxScrolls) {
            try {
                WebElement imageElement = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
                js.executeScript("arguments[0].scrollIntoView(true);", imageElement);
                System.out.println("Scrolled to element successfully.");
                return;
            } catch (NoSuchElementException | TimeoutException e) {
                js.executeScript("window.scrollBy(0, 1000);"); // Scroll down by 500 pixels
                System.out.println("Scroll by pixel .");
                scrollAttempts++;
            }
        }
        System.out.println("Element not found after scrolling.");
    }
}
