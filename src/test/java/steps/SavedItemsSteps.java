package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SavedItemsPage;

public class SavedItemsSteps {
    private SavedItemsPage savedItemsPage;

    public SavedItemsSteps() {
        savedItemsPage = new SavedItemsPage();
    }

    @Then("user sees item {string} on the saved list")
    public void verifyItemExistOnPage(String text) {
        savedItemsPage.getSavedItems().filter(Condition.text(text)).first().shouldBe(Condition.visible);
    }

    @When("user removes item {string} from saved list")
    public void removeSavedItem(String text) {
        SelenideElement element = savedItemsPage.getSavedItems().filter(Condition.text(text)).first();
        savedItemsPage.getDeleteItemButton(element).click();
    }

    @Then("user sees empty saved list")
    public void verifyEmptySavedList() {
        savedItemsPage.getNoItemsMessage().should(Condition.text("You have no Saved Items"));
    }
}
