package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.SharedContext;
import utils.WebElementStore;
import locators.LocatorConstants;



public class BkkPage implements LocatorConstants {
    private WebElementStore elementStore;

    public BkkPage() {
        this.elementStore = new WebElementStore(SharedContext.getInstance().getDriver());
    }

    public void openPage(){
        String baseUrl = SharedContext.getInstance().getBaseUrl();
        SharedContext.getInstance().getDriver().get(baseUrl);
        SharedContext.getInstance().getWebDriverWait().until(ExpectedConditions.titleContains("BudapestGO"));
    }

    public WebElement AcceptButton() {
        return elementStore.findElement(acceptButton);
    }

    public WebElement MainLogo() {
        return elementStore.findElement(mainLogo);
    }

    public WebElement FlagHun() {
        return elementStore.findElement(flagHun);
    }

    public WebElement HungarianTitle() {
        return elementStore.findElement(hungarianTitle);
    }

    public WebElement FlagEng() {
        return elementStore.findElement(flagEng);
    }

    public WebElement EnglishTitle() {
        return elementStore.findElement(englishTitle);
    }

    public WebElement HungarianBackArror() {
        return elementStore.findElement(hungarianBackArrow);
    }


}
