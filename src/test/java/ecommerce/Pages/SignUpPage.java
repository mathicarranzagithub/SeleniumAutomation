package ecommerce.Pages;

import org.openqa.selenium.WebDriver;
import ecommerce.testdata.SignupForm;
import org.openqa.selenium.By;

public class SignupPage extends BasePage {
    private By createAccountButton = By.cssSelector("[data-qa=create-account]");
    private By mobileNumberInput = By.cssSelector("#mobile_number");
    private By firstNameInput = By.cssSelector("#first_name");
    private By lastNameInput = By.cssSelector("#last_name");
    private By passwordInput = By.cssSelector("#password");
    private By addressInput = By.cssSelector("#address1");
    private By zipcodeInput = By.cssSelector("#zipcode");
    private By stateInput = By.cssSelector("#state");
    private By cityInput = By.cssSelector("#city");

    public SignupPage(WebDriver driver) {
        super(driver);
    }

    public void fillForm(SignupForm signupForm) {
        sendKeys(signupForm.getSignupFirstName(), firstNameInput);
        sendKeys(signupForm.getMobileNumber(), mobileNumberInput);
        sendKeys(signupForm.getSignupLastName(), lastNameInput);
        sendKeys(signupForm.getPassword(), passwordInput);
        sendKeys(signupForm.getZipcode(), zipcodeInput);
        sendKeys(signupForm.getAddress(), addressInput);
        sendKeys(signupForm.getState(), stateInput);
        sendKeys(signupForm.getCity(), cityInput);
    }

    public void clickCreateAccount() {
        click(this.createAccountButton);
    }
}