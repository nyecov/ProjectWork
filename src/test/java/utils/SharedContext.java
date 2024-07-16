package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.bbkGoPage;

public class SharedContext {
    private static SharedContext instance;
    private TestSetup testSetup;
    private WebDriver driver;
    private WebDriverWait wait;


    // Private constructor to prevent direct instantiation
    private SharedContext() {
        this.testSetup = new TestSetup();
        this.testSetup.setUp();
        this.driver = testSetup.getDriver();
        this.wait = testSetup.getWait();
        this.bkkGoPage =new bbkGoPage(driver);
    }

    // Public method to get the single instance of SharedContext
    public static synchronized SharedContext getInstance() {
        if (instance == null) {
            instance = new SharedContext();
        }
        return instance;
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

    // You can add more shared resources or data as needed
    // For example:
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
