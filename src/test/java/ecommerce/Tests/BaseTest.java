package ecommerce.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    protected static WebDriver driver;
    protected WebDriverWait wait;
    protected final String baseUrl = "https://practicesoftwaretesting.com/auth/login"; // Centralized baseUrl

    @BeforeMethod
    public void setupDriverConnection(){
        System.setProperty("webdriver.chrome.driver", "src/test/java/ecommerce/Drivers/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(12)); // Updated WebDriverWait constructor
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeDriverConnection() throws InterruptedException  {
        Thread.sleep(1000);
        if (driver != null) {
            driver.quit();
        }
    }
}
