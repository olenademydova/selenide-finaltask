package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement emailAddressField = $("#EmailAddress");
    private SelenideElement passwordField = $("#Password");
    private SelenideElement signInRegistryButton = $("#signin");
    private SelenideElement errorMessage = $("#loginErrorMessage");

    public SelenideElement getEmailAddressField() {
        return emailAddressField;
    }

    public SelenideElement getPasswordField() {
        return passwordField;
    }

    public SelenideElement getSignInRegistryButton() {
        return signInRegistryButton;
    }

    public SelenideElement getErrorMessage() {
        return errorMessage;
    }
}
