package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage {
    private SelenideElement searchField = $("[data-testid='search-input']");
    private SelenideElement searchButton = $("[data-testid='search-button-inline']");
    private SelenideElement cartButton = $("[data-testid='miniBagIcon']");
    private SelenideElement myAccountDropdownButton = $("#myAccountDropdown");
    private SelenideElement signInButton = $x("//*[@data-testid='signin-link']");
    private SelenideElement signOutButton = $("[data-testid='signout-link']");
    private SelenideElement savedItemsButton = $("[data-testid='savedItemsIcon']");

    public SelenideElement getSearchField() {
        return searchField;
    }

    public SelenideElement getSearchButton() {
        return searchButton;
    }

    public SelenideElement getCartButton() {
        return cartButton;
    }

    public SelenideElement getMyAccountDropdownButton() {
        return myAccountDropdownButton;
    }

    public SelenideElement getSignInButton() {
        return signInButton;
    }

    public SelenideElement getSignOutButton() {
        return signOutButton;
    }

    public SelenideElement getSavedItemsButton() {
        return savedItemsButton;
    }

}
