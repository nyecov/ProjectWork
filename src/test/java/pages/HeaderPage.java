package pages;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.SharedContext;
import utils.WebElementStore;
import pages.AbstractPage;

public class HeaderPage extends AbstractPage {
    private WebElementStore elementStore;
    private AbstractPage abstractPage;
    String baseUrl = SharedContext.getInstance().getBaseUrl();
    WebDriver driver = SharedContext.getInstance().getDriver();
    WebDriverWait wait = SharedContext.getInstance().getWebDriverWait();
    Actions actions = new Actions(driver);

    public HeaderPage() {
        this.elementStore = new WebElementStore(driver);
        this.abstractPage = new AbstractPage();
    }

    public void chekFlagVisiblity(@NotNull String neededFlag) {
        if (neededFlag.equals("Hungarian")) {
            checkVisibility(driver.findElement(flagHun));
        } else{
            checkVisibility(driver.findElement(flagEng));
        }
    }

    public void selectDisplayLanguage(String wantedLanguage)
    {
        if (wantedLanguage.equals("Hungarian")) {
            FlagHun().click();
        } else {
            FlagEng().click();
        }
    }

    public AbstractPage getAbstractPage() {
        return abstractPage;
    }

}
