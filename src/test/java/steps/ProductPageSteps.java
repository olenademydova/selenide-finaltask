package steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.ProductPage;

public class ProductPageSteps {
    private ProductPage productPage;
    private HomePage homePage;

    public ProductPageSteps() {
        productPage = new ProductPage();
        homePage = new HomePage();
    }

    @When("user adds item to cart from the product page")
    public void addToCartItem() {
        productPage.getSizeSelectDropdown().click();
        productPage.getAvailableSizeOptions()
                .filter(Condition.not(Condition.text("Not available")))
                .filter(Condition.not(Condition.text("Please select")))
                .first().click();
        productPage.getAddToCartButton().click();
    }

    @When("user clicks add to cart button")
    public void clickAddToCart(){
        productPage.getAddToCartButton().click();
    }

    @Then("user sees message that user should choose the size")
    public void verifyUserSeesErroMessage(){
        productPage.getSizeErrorMessage();
    }

    @Then("user sees that item was added to cart")
    public void verifyUserCanSeeItemAddedToCart() {
        productPage.getAddToCartButton().shouldHave(Condition.text("Added"));
        productPage.getCartPopup().shouldHave(Condition.text("1 item"));
        productPage.getCartPopup().shouldHave(Condition.text("It's in the bag - We'll hold it for an hour"));
    }

    @When("user navigates to cart from product page")
    public void navigateToCart() {
        homePage.getCartButton().hover();
        productPage.getViewBagButton().click();
    }

    @When("user saves item from products page")
    public void addItemToSavedItems(){
        productPage.getSaveItemFromProductPage().click();
    }

}
