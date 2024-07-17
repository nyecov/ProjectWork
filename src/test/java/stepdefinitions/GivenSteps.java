package stepdefinitions;

import io.cucumber.java.en.Given;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import pages.HeaderPage;
import pages.PlannerPage;
import pages.PrivacyPolicyPage;
import utils.SharedContext;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AbstractPage;

public class GivenSteps {
    private WebDriver driver;
    private SharedContext sharedContext;
    private WebDriverWait wait;
    private AbstractPage abstractPage;
    private PlannerPage plannerPage;
    private HeaderPage headerPage;
    private PrivacyPolicyPage privacyPolicyPage;


    public GivenSteps() {
        this.sharedContext = SharedContext.getInstance();
        this.driver = sharedContext.getDriver();
        this.wait = sharedContext.getWebDriverWait();
        this.abstractPage = new AbstractPage();
        this.plannerPage = new PlannerPage();
        this.headerPage= new HeaderPage();
        this.privacyPolicyPage=new PrivacyPolicyPage();

    }

    @Given("that the page is open")
    public void openPage() {
        abstractPage.openPage();
    }
    @Given("I accept privacy policy")
    public void acceptPolicy() {
        privacyPolicyPage.acceptPrivacyPolicy();
    }

    @Given("the selected language is {string}")
    public void checkSelectedLanguage(@NotNull String selectedLanguage) {
        plannerPage.checkSelectedLanguage(selectedLanguage);
    }

    @Given("the {string} flag is visible")
    public void checkFlagVisibility(@NotNull String neededFlag) {
        headerPage.chekFlagVisiblity(neededFlag);
    }

    @Given("I select the {string} language")
    public void selectLanguage(@NotNull String wantedLanguage) {
       headerPage.selectDisplayLanguage(wantedLanguage);
    }


}
