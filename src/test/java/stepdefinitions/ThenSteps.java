package stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import utils.SharedContext;

public class ThenSteps {
    private WebDriver driver;
    private SharedContext sharedContext;

    public ThenSteps() {
        this.sharedContext = SharedContext.getInstance();
        this.driver = sharedContext.getDriver();
    }

    @Then("Placeholder2")
    public void palceholder(){
        String baseUrl = sharedContext.getBaseUrl();
        driver.get(baseUrl + "/login");
    }
}
