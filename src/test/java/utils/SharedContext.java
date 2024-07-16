package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BkkPage;

public class SharedContext {
    private static SharedContext instance;
    private TestSetup testSetup;
    private WebDriver driver;
    private WebDriverWait wait;
    private BkkPage bkkPage;


    // Private constructor to prevent direct instantiation
    private SharedContext() {
        this.testSetup = new TestSetup();
        this.testSetup.setUp();
        this.driver = testSetup.getDriver();
        this.wait = testSetup.getWait();
        this.bkkPage = new BkkPage(driver);

    }

    // Public method to get the single instance of SharedContext
    public static synchronized SharedContext getInstance() {
        if (instance == null) {
            instance = new SharedContext();
        }
        return instance;
    }

    public BkkPage getPage() {
        return this.bkkPage;
    }

    // Getter for WebDriver
    public WebDriver getDriver() {
        return this.driver;
    }

    // Method to clean up resources
    public void tearDown() {
        if (this.testSetup != null) {
            this.testSetup.tearDown();
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
