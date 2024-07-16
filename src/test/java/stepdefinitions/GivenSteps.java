package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.SharedContext;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.bbkGoPage;

public class GivenSteps {
    private WebDriver driver;
    private SharedContext sharedContext;
    private WebDriverWait wait;

    public GivenSteps() {
        this.sharedContext = SharedContext.getInstance();
        this.driver = sharedContext.getDriver();
        this.wait = sharedContext.getWebDriverWait();
    }

    @Given("that the page is open")
    public void openPage() {
        String baseUrl = sharedContext.getBaseUrl();
        driver.get(baseUrl);
        wait.until(ExpectedConditions.titleContains("BudapestGO"));
    }
    @Given("I accept privacy policy")
    public void acceptPolicy() {
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[text()='Accept']"))));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(bbkGoPage.)
        driver.findElement(By.xpath("//button[text()='Accept']")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".logo-link"))));
    }

}
