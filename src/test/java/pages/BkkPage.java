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


public class BkkPage implements LocatorConstants {
    private WebElementStore elementStore;
    String baseUrl = SharedContext.getInstance().getBaseUrl();
    WebDriver driver = SharedContext.getInstance().getDriver();
    WebDriverWait wait = SharedContext.getInstance().getWebDriverWait();
    Actions actions = new Actions(driver);

    public BkkPage() {
        this.elementStore = new WebElementStore(SharedContext.getInstance().getDriver());
    }

    public void openPage() {
        driver.get(baseUrl);
        wait.until(ExpectedConditions.titleContains("BudapestGO"));
    }

    public void acceptPolicy() {
        wait.until(ExpectedConditions.visibilityOf(AcceptButton()));
        AcceptButton().click();
        wait.until(ExpectedConditions.elementToBeClickable(MainLogo()));
    }

    public void checkSelectedLanguage(@NotNull String selectedLanguage) {
        wait.until(ExpectedConditions.titleContains("BudapestGO"));
        if (selectedLanguage.equals("English")) {
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(EnglishTitle())));
        } else {
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(HungarianTitle())));
        }
    }

    public void checkFlagVisibility(@NotNull String neededFlag) {
        if (neededFlag.equals("Hungarian")) {
            wait.until(ExpectedConditions.visibilityOf(FlagHun()));
        } else {
            wait.until(ExpectedConditions.visibilityOf(FlagEng()));
        }
    }

    public void selectLanguage(@NotNull String wantedLanguage) {
        if (wantedLanguage.equals("Hungarian")) {
            FlagHun().click();
        } else {
            FlagEng().click();
        }
    }

    public void titleShouldBe(@NotNull String panelTitle) {
        driver.navigate().refresh();
        wait.until(ExpectedConditions.titleContains("BudapestGO"));
        if (panelTitle.equals("Utazástervezés")) {
            wait.until(ExpectedConditions.textToBePresentInElement(HungarianTitle(), panelTitle));
        } else {
            wait.until(ExpectedConditions.textToBePresentInElement(EnglishTitle(), panelTitle));
        }
    }

    public void fillInputWith(@NotNull String inputName, @NotNull String inputValue) {
        String selector = String.format("//input[@placeholder='%s']", inputName);
        WebElement input = driver.findElement(By.xpath(selector));
        wait.until(ExpectedConditions.elementToBeClickable(input));
        input.click();
        input.clear();
        input.sendKeys(inputValue);
        actions.sendKeys(input,Keys.TAB).build().perform();
    }

    private WebElement AcceptButton() {
        return elementStore.findElement(acceptButton);
    }

    private WebElement MainLogo() {
        return elementStore.findElement(mainLogo);
    }

    private WebElement FlagHun() {
        return elementStore.findElement(flagHun);
    }

    private WebElement HungarianTitle() {
        return elementStore.findElement(hungarianTitle);
    }

    private WebElement FlagEng() {
        return elementStore.findElement(flagEng);
    }

    private WebElement EnglishTitle() {
        return elementStore.findElement(englishTitle);
    }

    private WebElement HungarianBackArrow() {
        return elementStore.findElement(hungarianBackArrow);
    }

    private WebElement FromInput() {
        return elementStore.findElement(fromInput);
    }


}
