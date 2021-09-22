package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    private SelenideElement deleteItemButton = $(".bag-item-remove");

    private SelenideElement emptyBagMessage = $(".empty-bag-title");

    public SelenideElement getDeleteItemButton() {
        return deleteItemButton;
    }

    public SelenideElement getEmptyBagMessage() {
        return emptyBagMessage;
    }

}
