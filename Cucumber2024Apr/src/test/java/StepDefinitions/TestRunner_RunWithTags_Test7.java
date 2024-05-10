package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeaturesWithTags", glue="StepDefinitions", 
					tags = "@smoke or @regression and @important")
public class TestRunner_RunWithTags_Test7 {

}

//"pretty","json:target/JSONReports/report.json"
//"pretty","junit:target/JunitReports/report.xml"
