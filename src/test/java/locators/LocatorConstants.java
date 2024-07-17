package locators;

import org.openqa.selenium.By;

public interface LocatorConstants {
    By acceptButton = By.xpath("//button[text()='Accept']");
    By mainLogo = By.cssSelector(".logo-link");
    By englishTitle = By.xpath("//h2[text()='Trip Planner']");
    By hungarianTitle = By.xpath("//h2[text()='Utazástervezés']");
    By flagHun = By.xpath("//span[@title='magyar']");
    By flagEng = By.xpath("//span[@title='english']");
    By hungarianBackArrow = By.xpath("//div[@title='Vissza']");
    By fromInput=By.xpath("//input[@placeholder=\"From\"]");
}
