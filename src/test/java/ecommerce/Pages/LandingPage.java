package ecommerce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage extends BasePage {

    private By signupLoginLink = By.cssSelector("[href=\"/login\"]");

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public By getSignupLoginLink() {
        return signupLoginLink;
    }
}