package pages;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.SharedContext;
import utils.WebElementStore;
import locators.LocatorConstants;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;


public class AbstractPage implements LocatorConstants {
    private WebElementStore elementStore;
    String baseUrl = SharedContext.getInstance().getBaseUrl();
    WebDriver driver = SharedContext.getInstance().getDriver();
    WebDriverWait wait = SharedContext.getInstance().getWebDriverWait();
    Actions actions = new Actions(driver);

    public AbstractPage() {
        this.elementStore = new WebElementStore(driver);
    }

    public void openPage() {
        driver.get(baseUrl);
        wait.until(ExpectedConditions.titleContains("BudapestGO"));
    }

 /*   public void acceptPolicy() {
        wait.until(ExpectedConditions.visibilityOf(AcceptPrivacyButton()));
        AcceptPrivacyButton().click();
        wait.until(ExpectedConditions.elementToBeClickable(MainLogo()));
    }*/

    protected void checkPlannerTitleLanguage(@NotNull String selectedLanguage) {
        if (selectedLanguage.equals("English")) {
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(EnglishTitle())));
        } else {
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(HungarianTitle())));
        }
    }

    protected void waitForTitle() {
        wait.until(ExpectedConditions.titleContains("BudapestGO"));
    }

    protected void checkVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected void waitForClickAbleStatus(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void selectLanguage(@NotNull String wantedLanguage) {
        if (wantedLanguage.equals("Hungarian")) {
            FlagHun().click();
        } else {
            FlagEng().click();
        }
    }

    public void checkTitle(@NotNull String panelTitle) {
        if (panelTitle.equals("Utazástervezés")) {
            wait.until(ExpectedConditions.textToBePresentInElement(HungarianTitle(), panelTitle));
        } else {
            wait.until(ExpectedConditions.textToBePresentInElement(EnglishTitle(), panelTitle));
        }
    }

    protected void pageRefresh() {
        driver.navigate().refresh();
        wait.until(ExpectedConditions.titleContains("BudapestGO"));
    }

    protected void fillInputWith(@NotNull String inputName, @NotNull String inputValue) {
        String selector = String.format("//input[@placeholder='%s']", inputName);
        WebElement input = driver.findElement(By.xpath(selector));
        wait.until(ExpectedConditions.elementToBeClickable(input));
        input.click();
        input.clear();
        input.sendKeys(inputValue);
        actions.sendKeys(input, Keys.TAB).build().perform();
    }

    protected void clickOnText(String text) {
        String selector = String.format("//option [contains(text(),'%s')]", text);
        WebElement element = driver.findElement(By.xpath(selector));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    protected void waitForResults() {
        waitFor(3);
        wait.until(ExpectedConditions.textToBePresentInElement(ResultsTitle(),"Suggested"));
        WebElement panel=driver.findElement(By.xpath("//div[@id='panel-inner']"));
        wait.until(ExpectedConditions.visibilityOf(panel));
        wait.until(ExpectedConditions.visibilityOf(ResultsTitle()));
    }

    protected void waitFor(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected WebElement AcceptPrivacyButton() {
        return elementStore.findElement(acceptPrivacyButton);
    }

    protected WebElement MainLogo() {
        return elementStore.findElement(mainLogo);
    }

    protected WebElement FlagHun() {
        return elementStore.findElement(flagHun);
    }

    protected WebElement HungarianTitle() {
        return elementStore.findElement(hungarianTitle);
    }

    protected WebElement FlagEng() {
        return elementStore.findElement(flagEng);
    }

    protected WebElement EnglishTitle() {
        return elementStore.findElement(englishTitle);
    }

    protected WebElement HungarianBackArrow() {
        return elementStore.findElement(hungarianBackArrow);
    }

    protected WebElement FromInput() {
        return elementStore.findElement(fromInput);
    }

    protected WebElement ArriveByDropdown() {
        return elementStore.findElement(arriveByDropdown);
    }

    protected WebElement RouteOptimizeDropdown() {
        return elementStore.findElement(routeOptimizeDropdown);
    }

    protected WebElement PlanButton() {
        return elementStore.findElement(planButton);
    }

    protected WebElement ResultsTitle() {
        return elementStore.findElement(resultsTitle);
    }


}
