package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SavedItemsPage {
    private ElementsCollection savedItems = $$x("//div[contains(@class,'customerItemsProductTile')]");
    private SelenideElement noItemsMessage = $x("//h2[contains(@class,'noItemsPrompt')]");

    public SelenideElement getNoItemsMessage() {
        return noItemsMessage;
    }

    public SelenideElement getDeleteItemButton(SelenideElement item) {
        return item.$x(".//button[contains(@class,'deleteButton')]");
    }

    public ElementsCollection getSavedItems() {
        return savedItems;
    }
}
