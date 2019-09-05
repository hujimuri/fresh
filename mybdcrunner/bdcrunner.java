package mybdcrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="multi",glue="bdcstepdefinations",tags= {"@Sanity,@Regression"},
plugin= {"pretty","html:target/cucumber-html-report","json:target/SriniDemo-JSON-report"})
public class bdcrunner {

}
