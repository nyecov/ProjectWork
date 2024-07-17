package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SharedContext {
    private static SharedContext instance;
    private WebDriverHandler webDriverHandler;
    private WebDriver driver;
    private WebDriverWait wait;


    // Private constructor to prevent direct instantiation
    private SharedContext() {
        this.webDriverHandler = new WebDriverHandler();
    }

    // Public method to get the single instance of SharedContext
    public static synchronized SharedContext getInstance() {
        if (instance == null) {
            instance = new SharedContext();
        }
        return instance;
    }

    public void setupTest(){
        this.webDriverHandler.setUp();
        this.driver = webDriverHandler.getDriver();
        this.wait = webDriverHandler.getWait();
    }

    // Getter for WebDriver
    public WebDriver getDriver() {
        return this.driver;
    }

    // Method to clean up resources
    public void tearDown() {
        if (this.webDriverHandler != null) {
            this.webDriverHandler.tearDown();
        }
    }


    private String baseUrl;

    public void setBaseUrl(String url) {
        this.baseUrl = url;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public WebDriverWait getWebDriverWait() {
        return this.wait;
    }
}
