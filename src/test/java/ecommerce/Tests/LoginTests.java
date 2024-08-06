package ecommerce.Tests;

import org.testng.annotations.BeforeMethod;
import ecommerce.testdata.SignupTestData;
import ecommerce.testdata.SignUpForm;
import org.testng.annotations.Test;
import ecommerce.Pages.SignUpPage;
import ecommerce.Pages.LoginPage;
import org.testng.Assert;

@Test(groups = "Login")
public class LoginTests extends BaseTest {
    private SignUpPage signUpPage;
    private LoginPage loginPage;
    public String randomEmail;

    @BeforeMethod
    public void setUpTest() {
        driver.get(baseUrl); // Using baseUrl from BaseTest
        signUpPage = new SignUpPage(driver);
        loginPage = new LoginPage(driver);
    }

    @Test
    public void createNewUser() {
        randomEmail = LoginPage.generateRandomEmail();
        loginPage.newUserSignup("Test", randomEmail);
        SignUpForm signUpForm = SignupTestData.FormUserDataInfo;

        signUpPage.fillForm(signUpForm);
        signUpPage.clickCreateAccount();

        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/account_created");
    }
}