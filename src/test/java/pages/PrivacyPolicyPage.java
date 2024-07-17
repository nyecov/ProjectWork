package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.SharedContext;
import utils.WebElementStore;

public class PrivacyPolicyPage extends  AbstractPage{
    private WebElementStore elementStore;
    private AbstractPage abstractPage;
    String baseUrl = SharedContext.getInstance().getBaseUrl();
    WebDriver driver = SharedContext.getInstance().getDriver();
    WebDriverWait wait = SharedContext.getInstance().getWebDriverWait();
    Actions actions = new Actions(driver);

    public PrivacyPolicyPage(){
        this.elementStore = new WebElementStore(driver);
        this.abstractPage = new AbstractPage();
    }

    public void acceptPrivacyPolicy() {
        waitForClickAbleStatus(AcceptPrivacyButton());
        AcceptPrivacyButton().click();
    }
}
