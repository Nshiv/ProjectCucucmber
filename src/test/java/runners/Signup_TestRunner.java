package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/io/FeatureFiles/signup.feature",
        glue = "io.cucumber"
)
public class Signup_TestRunner
{

}
