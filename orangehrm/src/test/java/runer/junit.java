package runer;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features = {"feature\\login.feature"},
        glue = {"stepdefination"},
//        tags = "@valid-login",
        plugin = {
            "pretty",
            "html:target/cucumber-reports/cucumber-report.html" 
        }
)
public class junit {

    
}



