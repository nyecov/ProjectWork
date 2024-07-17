package pages;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.SharedContext;
import utils.WebElementStore;

public class PlannerPage extends AbstractPage {
    private WebElementStore elementStore;
    private AbstractPage abstractPage;
    String baseUrl = SharedContext.getInstance().getBaseUrl();
    WebDriver driver = SharedContext.getInstance().getDriver();
    WebDriverWait wait = SharedContext.getInstance().getWebDriverWait();
    Actions actions = new Actions(driver);


    public PlannerPage() {
        this.elementStore = new WebElementStore(driver);
        this.abstractPage = new AbstractPage();
    }

    public void fillPlannerPageInput(@NotNull String inputName, @NotNull String inputValue) {
        fillInputWith(inputName, inputValue);
    }

    public void checkSelectedLanguage(@NotNull String selectedLanguage) {
        waitForTitle();
        checkPlannerTitleLanguage(selectedLanguage);
    }

    public void titleShouldBe(@NotNull String panelTitle) {
        pageRefresh();
        checkTitle(panelTitle);
    }

    public void selectFromDropDown(@NotNull String optionName, @NotNull String droDownName) {
        WebElement dropdown = null;
        if (droDownName.equals("arriveby")) {
            dropdown = ArriveByDropdown();
        } else {
            dropdown = RouteOptimizeDropdown();
        }
        wait.until(ExpectedConditions.elementToBeClickable(dropdown));
        dropdown.click();
        clickOnText(optionName);
        dropdown.click();
    }

    public void clickOnPlanButton() {
        PlanButton().click();
    }

    public void checkResults(){
        waitForResults();
    }

    public AbstractPage getAbstractPage() {
        return abstractPage;

    }
}
