package steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {
    private HomePage homePage = new HomePage();
    private LoginPage loginPage = new LoginPage();

    @When("user login with credentials - {string} / {string}")
    public void loginWithValidCredentials(String login, String pass){
        homePage.getMyAccountDropdownButton().click();
        homePage.getSignInButton().click();
        loginPage.getEmailAddressField().sendKeys(login);
        loginPage.getPasswordField().sendKeys(pass);
        loginPage.getSignInRegistryButton().click();
    }

    @Then("user sees greetings message")
    public void greetingsMessage(){
        homePage.getMyAccountDropdownButton().hover();
        homePage.getMyAccountDropdownButton().shouldHave(Condition.text("Hi Asos"));
    }

    @When("user logouts")
    public void logoutFromMainPage(){
        homePage.getMyAccountDropdownButton().hover();
        homePage.getSignOutButton().click();
    }

    @Then("user sees that user is logged out")
    public void verifyThatUserLoggedout(){
        homePage.getMyAccountDropdownButton().hover();
        homePage.getSignInButton().shouldBe(Condition.visible);
    }

    @Then("user sees error message about unsuccessful login")
    public void verifyThatUserSeesErrorMessage(){
        loginPage.getErrorMessage().shouldHave(Condition.text("Looks like either your email address or password were incorrect. Wanna try again?"));
    }
}
