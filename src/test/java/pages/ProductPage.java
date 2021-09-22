package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ProductPage {
    private SelenideElement sizeSelectDropdown = $x("//select[@data-id='sizeSelect']");
    private ElementsCollection availableSizeOptions = $$x("//select[@data-id='sizeSelect']/option");
    private SelenideElement addToCartButton = $("[data-test-id='add-button']");
    private SelenideElement cartPopup = $("[data-testid='minibag-dropdown']");
    private SelenideElement viewBagButton = $x("//a[@data-test-id='bag-link']//span");
    private SelenideElement sizeErrorMessage = $("#selectSizeError");
    private SelenideElement saveItemFromProductPage = $(".save-button");

    public SelenideElement getSizeSelectDropdown() {
        return sizeSelectDropdown;
    }

    public ElementsCollection getAvailableSizeOptions() { return availableSizeOptions; }

    public SelenideElement getAddToCartButton() {
        return addToCartButton;
    }

    public SelenideElement getCartPopup() { return cartPopup; }

    public SelenideElement getViewBagButton() { return viewBagButton; }

    public SelenideElement getSizeErrorMessage() { return sizeErrorMessage; }

    public SelenideElement getSaveItemFromProductPage() { return saveItemFromProductPage; }
}
