package ecommerce.Tests;

import org.testng.annotations.BeforeMethod;
import ecommerce.testdata.SignupTestData;
import ecommerce.testdata.SignupForm;
import org.testng.annotations.Test;
import ecommerce.Pages.SignupPage;
import ecommerce.Pages.LoginPage;
import org.testng.Assert;

@Test(groups = "Login")
public class LoginTests extends BaseTest {
    private SignupPage signupPage;
    private LoginPage loginPage;
    public String randomEmail;

    @BeforeMethod
    public void setupTest() {
        driver.get(baseUrl); // Using baseUrl from BaseTest
        signupPage = new SignupPage(driver);
        loginPage = new LoginPage(driver);
    }

    @Test
    public void createNewUser() {
        randomEmail = LoginPage.generateRandomEmail();
        loginPage.newUserSignup("Test", randomEmail);
        SignupForm signupForm = SignupTestData.FormUserDataInfo;

        signupPage.fillForm(signupForm);
        signupPage.clickCreateAccount();

        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/account_created");
    }
}