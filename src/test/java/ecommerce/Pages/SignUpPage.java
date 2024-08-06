package ecommerce.Pages;

import org.openqa.selenium.WebDriver;
import ecommerce.testdata.SignUpForm;
import org.openqa.selenium.By;

public class SignUpPage extends BasePage {
    private By createAccountButton = By.cssSelector("[data-qa=create-account]");
    private By mobileNumberInput = By.cssSelector("#mobile_number");
    private By firstNameInput = By.cssSelector("#first_name");
    private By lastNameInput = By.cssSelector("#last_name");
    private By passwordInput = By.cssSelector("#password");
    private By addressInput = By.cssSelector("#address1");
    private By zipcodeInput = By.cssSelector("#zipcode");
    private By stateInput = By.cssSelector("#state");
    private By cityInput = By.cssSelector("#city");

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void fillForm(SignUpForm signUpForm) {
        sendKeys(signUpForm.getSignUpFirstName(), firstNameInput);
        sendKeys(signUpForm.getMobileNumber(), mobileNumberInput);
        sendKeys(signUpForm.getSignUpLastName(), lastNameInput);
        sendKeys(signUpForm.getPassword(), passwordInput);
        sendKeys(signUpForm.getZipcode(), zipcodeInput);
        sendKeys(signUpForm.getAddress(), addressInput);
        sendKeys(signUpForm.getState(), stateInput);
        sendKeys(signUpForm.getCity(), cityInput);
    }

    public void clickCreateAccount() {
        click(this.createAccountButton);
    }
}