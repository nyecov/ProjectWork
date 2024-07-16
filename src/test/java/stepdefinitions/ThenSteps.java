package stepdefinitions;

import io.cucumber.java.en.Then;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.SharedContext;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BkkPage;
import org.junit.Assert;

public class ThenSteps {
    private WebDriver driver;
    private SharedContext sharedContext;
    private WebDriverWait wait;
    private BkkPage bkkPage;

    public ThenSteps() {
        this.sharedContext = SharedContext.getInstance();
        this.driver = sharedContext.getDriver();
        this.wait = sharedContext.getWebDriverWait();
        this.bkkPage= sharedContext.getPage();
    }

    @Then("main panel title is labelled {string}")
    public void titleShouldBe(@NotNull String panelTitle){
        if (panelTitle.equals("Utazástervezés")) {
            driver.navigate().refresh();
            wait.until(ExpectedConditions.visibilityOf(bkkPage.HungarianTitle()));
        } else {
            driver.navigate().refresh();
            wait.until(ExpectedConditions.visibilityOf(bkkPage.EnglishTitle()));
        };
    }
}
