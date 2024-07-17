package stepdefinitions;

import io.cucumber.java.en.When;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import utils.SharedContext;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BkkPage;

public class WhenSteps {
    private WebDriver driver;
    private SharedContext sharedContext;
    private WebDriverWait wait;
    private BkkPage bkkPage;

    public WhenSteps() {
        this.sharedContext = SharedContext.getInstance();
        this.driver = sharedContext.getDriver();
        this.wait = sharedContext.getWebDriverWait();
        this.bkkPage = new BkkPage();
    }

    @When("I fill out the {string} input with: {string}")
    public void fillInputWith(@NotNull String inputName,@NotNull String inputValue) {
        bkkPage.fillInputWith(inputName,inputValue);
    }


}
