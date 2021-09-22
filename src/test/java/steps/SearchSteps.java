package steps;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchResultsPage;

public class SearchSteps {
    private HomePage homePage;
    private SearchResultsPage searchResultsPage;

    public SearchSteps() {
        homePage = new HomePage();
        searchResultsPage = new SearchResultsPage();

    }

    @When("user searches by {string} keyword")
    public void searchByKeyword(String keyword) {
        homePage.getSearchField().click();
        homePage.getSearchField().sendKeys(keyword);
        homePage.getSearchButton().click();
    }

    @Then("user should see {string} in search results")
    public void verifyUserSeeKeywordInSearchResults(String keyword) {
        searchResultsPage.getProductsList().filter(Condition.text(keyword)).shouldHave(CollectionCondition.sizeGreaterThan(0));
    }

    @When("user choose {string} from list of products")
    public void chooseItemFromProductsList(String keyword) {
        searchResultsPage.getProductsList().filter(Condition.text(keyword)).first().click();
    }

    @When("user saves {string} from search results page")
    public void addItemToSavedItems(String item) {
        SelenideElement searchResult = searchResultsPage.getProductsList().filter(Condition.text(item)).first();
        searchResultsPage.getSaveButton(searchResult).click();
    }

    @When("user navigates to saved items page")
    public void navigateToSavedItemsPage() {
        homePage.getSavedItemsButton().click();
    }
}
