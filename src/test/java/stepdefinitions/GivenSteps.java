package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.SharedContext;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BkkPage;

public class GivenSteps {
    private WebDriver driver;
    private SharedContext sharedContext;
    private WebDriverWait wait;
    private BkkPage bkkPage;


    public GivenSteps() {
        this.sharedContext = SharedContext.getInstance();
        this.driver = sharedContext.getDriver();
        this.wait = sharedContext.getWebDriverWait();
        this.bkkPage = new BkkPage();

    }

    @Given("that the page is open")
    public void openPage() {
        bkkPage.openPage();
    }
    @Given("I accept privacy policy")
    public void acceptPolicy() {
    bkkPage.acceptPolicy();
    }

    @Given("the selected language is {string}")
    public void checkSelectedLanguage(@NotNull String selectedLanguage) {
        bkkPage.checkSelectedLanguage(selectedLanguage);
    }

    @Given("the {string} flag is visible")
    public void checkFlagVisibility(@NotNull String neededFlag) {
        bkkPage.checkFlagVisibility(neededFlag);
    }

    @Given("I select the {string} language")
    public void selectLanguage(@NotNull String wantedLanguage) {
       bkkPage.selectLanguage(wantedLanguage);
    }


}
