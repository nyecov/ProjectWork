package stepdefinitions;

import io.cucumber.java.en.Then;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import pages.HeaderPage;
import pages.PlannerPage;
import utils.SharedContext;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AbstractPage;


public class ThenSteps {
    private WebDriver driver;
    private SharedContext sharedContext;
    private WebDriverWait wait;
    private AbstractPage abstractPage;
    private PlannerPage plannerPage;
    private HeaderPage headerPage;

    public ThenSteps() {
        this.sharedContext = SharedContext.getInstance();
        this.driver = sharedContext.getDriver();
        this.wait = sharedContext.getWebDriverWait();
        this.abstractPage = new AbstractPage();
        this.plannerPage = new PlannerPage();
        this.headerPage= new HeaderPage();
    }

    @Then("main panel title is labelled {string}")
    public void titleShouldBe(@NotNull String panelTitle) {
        plannerPage.titleShouldBe(panelTitle);
    }
}
