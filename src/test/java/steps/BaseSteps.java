package steps;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;


public class BaseSteps {
    @Before
    public void setUp() {
        Configuration.baseUrl = "https://www.asos.com";
        Configuration.startMaximized = true;
        Configuration.timeout = 10000;
    }

    @Given("user opens main page")
    public void openMainPage() {
        Selenide.open("");
    }

    @After
    public void closeDriver() {
        Selenide.closeWebDriver();
    }
}
