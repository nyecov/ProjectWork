package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebElementStore;
import locators.LocatorConstants;


public class BkkPage implements LocatorConstants{
    private WebElementStore elementStore;

public BkkPage(WebDriver driver){
    this.elementStore= new WebElementStore(driver);
}

    public WebElement AcceptButton(){
        return elementStore.findElement(acceptButton);
    }

    public WebElement MainLogo(){
        return elementStore.findElement(mainLogo);
    }

    public WebElement FlagHun(){
        return elementStore.findElement(flagHun);
    }

    public WebElement HungarianTitle(){
        return elementStore.findElement(hungarianTitle);
    }

    public WebElement FlagEng(){
        return elementStore.findElement(flagEng);
    }

    public WebElement EnglishTitle(){
        return elementStore.findElement(englishTitle);
    }


}
