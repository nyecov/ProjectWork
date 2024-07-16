package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Specify the location of your feature files
        glue = {"src/test/java/redefinitions"} // Specify the package where your step definitions are located
)
public class TestRunner {
    // This class will act as your test runner
}
