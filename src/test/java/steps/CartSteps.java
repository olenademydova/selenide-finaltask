package steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;

public class CartSteps {
    private CartPage cartPage;

    public CartSteps(){
        cartPage = new CartPage();
    }

    @When("user deletes item from cart")
    public void deleteFromCart() {
        cartPage.getDeleteItemButton().click();
    }

    @Then("user sees empty cart")
    public void verifyEmptyCart() {
        cartPage.getEmptyBagMessage().shouldHave(Condition.text("Your bag is empty"));
    }
}
