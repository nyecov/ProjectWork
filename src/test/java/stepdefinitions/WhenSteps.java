package stepdefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.SharedContext;

public class WhenSteps {
    private WebDriver driver;
    private SharedContext sharedContext;

    public WhenSteps() {
        this.sharedContext = SharedContext.getInstance();
        this.driver = sharedContext.getDriver();
    }

    @When("placeholder3")
    public void placeholder() {
        String baseUrl = sharedContext.getBaseUrl();
        driver.get(baseUrl + "/login");
    }
}
