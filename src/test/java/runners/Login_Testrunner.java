package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/io/FeatureFiles/login.feature",
        glue = "com.examples.StepDefintions",
        tags = "@SmokeTest",
       /* plugin = {"pretty","html:target/cucumberReport.html"}*/
       /* plugin = {"pretty","html:target/cucumberREsult.json"}*/
        plugin = {"pretty","junit:target/cukes.xml"},
        dryRun = true,
        monochrome = true

)
public class Login_Testrunner
{

}
