package ecommerce.Pages;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    protected LandingPage landingPage;

    // Selectors
    private By newUserEmailInput = By.cssSelector("[data-qa=signup-email]");
    private By passwordInput = By.cssSelector("[data-qa=login-password]");
    private By loginEmailInput = By.cssSelector("[data-qa=login-email]");
    private By signUpButton = By.cssSelector("[data-qa=signup-button]");
    private By loginButton = By.cssSelector("[data-qa=login-button]");
    private By nameInput = By.cssSelector("[data-qa=signup-name]");
    private By signupLoginLink = By.cssSelector("[href='/login']");

    public LoginPage(WebDriver driver) {
        super(driver);
        this.landingPage = new LandingPage(driver); // Inicializa LandingPage
    }

    public void login(String email, String password) {
        click(signupLoginLink);
        sendKeys(email, loginEmailInput);
        sendKeys(password, passwordInput);
        click(loginButton);
    }

    public void newUserSignup(String firstName, String email) {
        click(signupLoginLink);
        sendKeys(firstName, nameInput);
        sendKeys(email, newUserEmailInput);
        click(signUpButton);
    }

    public void clickLogin() {
        click(this.loginButton);
    }

    public String myAccountTitle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'myAccountTitle'");
    }

    public static String generateRandomEmail() {
        return "test" + UUID.randomUUID().toString() + "@example.com";
    }
}
