package cucumberOptions;

import javax.security.auth.login.LoginContext;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue= "stepDefinationFile"
		)

public class TestRunner {

}
