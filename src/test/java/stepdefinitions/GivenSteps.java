package stepdefinitions;

import io.cucumber.java.en.Given;
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
        this.bkkPage= sharedContext.getPage();

    }

    @Given("that the page is open")
    public void openPage() {
        String baseUrl = sharedContext.getBaseUrl();
        driver.get(baseUrl);
        wait.until(ExpectedConditions.titleContains("BudapestGO"));
    }
    @Given("I accept privacy policy")
    public void acceptPolicy() {
        wait.until(ExpectedConditions.visibilityOf(bkkPage.AcceptButton()));
        bkkPage.AcceptButton().click();
        wait.until(ExpectedConditions.elementToBeClickable(bkkPage.MainLogo()));
    }

    @Given("the selected language is in {string}")
    public void checkSelectedLanguage(@NotNull String selectedLanguage) {
        if (selectedLanguage.equals("English")) {
            wait.until(ExpectedConditions.visibilityOf(bkkPage.EnglishTitle()));
        } else {
            wait.until(ExpectedConditions.visibilityOf(bkkPage.HungarianTitle()));
        };
    }

    @Given("the {string} flag is visible")
    public void checkFlagVisibility(@NotNull String neededFlag) {
        if (neededFlag.equals("Hungarian")) {
            wait.until(ExpectedConditions.visibilityOf(bkkPage.FlagHun()));
        } else {
            wait.until(ExpectedConditions.visibilityOf(bkkPage.FlagEng()));
        };
    }

}
