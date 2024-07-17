package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.SharedContext;

public class Hooks {
    private SharedContext sharedContext;

    @Before
    public void setUp() {
        // Initialize SharedContext
        this.sharedContext = SharedContext.getInstance();
        sharedContext.setupTest();
        sharedContext.setBaseUrl("https://go.bkk.hu/");
    }

    @After
    public void tearDown() {
        // Clean up resources
        if (sharedContext != null) {
            sharedContext.tearDown();
        }
    }
}
