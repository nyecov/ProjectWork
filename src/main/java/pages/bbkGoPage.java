package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class bbkGoPage {
    private WebDriver driver;
    private By acceptButton = By.xpath("\"//button[text()='Accept']\"");

    public By AcceptButton(){
        return this.acceptButton;
    }
}
