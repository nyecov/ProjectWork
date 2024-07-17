package stepdefinitions;

import io.cucumber.java.en.When;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import pages.PlannerPage;
import utils.SharedContext;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AbstractPage;

public class WhenSteps {
    private WebDriver driver;
    private SharedContext sharedContext;
    private WebDriverWait wait;
    private AbstractPage abstractPage;
    private PlannerPage plannerPage;

    public WhenSteps() {
        this.sharedContext = SharedContext.getInstance();
        this.driver = sharedContext.getDriver();
        this.wait = sharedContext.getWebDriverWait();
        this.abstractPage = new AbstractPage();
        this.plannerPage = new PlannerPage();
    }

    @When("I fill out the {string} input with: {string}")
    public void fillInputWith(@NotNull String inputName, @NotNull String inputValue) {
        plannerPage.fillPlannerPageInput(inputName, inputValue);
    }

    @When("I select the {string} option from the {string} dropdown")
    public void selectTimeMode(@NotNull String optionName, @NotNull String droDownName) {
        plannerPage.selectFromDropDown(optionName, droDownName);
    }

    @When("I click on the Plan button")
    public void routePlan() {
        plannerPage.clickOnPlanButton();
    }

    @When("I click on the Reverse direction button")
    public void clickOnReverse() {
        plannerPage.routeReverse();
    }


}
