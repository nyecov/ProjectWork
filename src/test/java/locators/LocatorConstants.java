package locators;

import org.openqa.selenium.By;

public interface LocatorConstants {
    By acceptPrivacyButton = By.xpath("//button[text()='Accept']");
    By mainLogo = By.cssSelector(".logo-link");
    By englishTitle = By.xpath("//h2[text()='Trip Planner']");
    By hungarianTitle = By.xpath("//h2[text()='Utazástervezés']");
    By flagHun = By.xpath("//span[@title='magyar']");
    By flagEng = By.xpath("//span[@title='english']");
    By hungarianBackArrow = By.xpath("//div[@title='Vissza']");
    By fromInput = By.xpath("//input[@placeholder=\"From\"]");
    By arriveByDropdown = By.xpath("//select[contains(@class,\"planner-arriveby\")]");
    By routeOptimizeDropdown = By.xpath("//select[contains(@class,'planner-optimize')]");
    By planButton = By.xpath("//input[@type='submit' and @role='button']");
    By resultsTitle =By.xpath("//h2[text()='Suggested itineraries']");
    By reverseButton =By.xpath("//span[@role='button' and contains(@class,'planner-reverse')]");
}
