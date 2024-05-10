package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeaturesWithHooks", glue="StepDefinitionsHooks" 
					)
public class TestRunner_RunWithHooks_Test9 {

}

//"pretty","json:target/JSONReports/report.json"
//"pretty","junit:target/JunitReports/report.xml"
