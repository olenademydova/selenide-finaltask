package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {
    private ElementsCollection productsList = $$("[data-auto-id='productTile']");

    public ElementsCollection getProductsList() {
        return productsList;
    }

    public SelenideElement getSaveButton(SelenideElement element) {
        return element.$("[data-auto-id=saveForLater]");
    }
}
