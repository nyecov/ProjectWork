package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebElementStore;


public class BkkPage {
    private WebElementStore elementStore;

public BkkPage(WebDriver driver){
    this.elementStore= new WebElementStore(driver);
}

    private By acceptButton = By.xpath("//button[text()='Accept']");


    public WebElement getAcceptButton(){
        return elementStore.findElement(acceptButton);
    }

}
