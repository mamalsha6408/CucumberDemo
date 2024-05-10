package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeaturesWithBackground", glue="StepDefinitionsBackground", monochrome = true,
				plugin = {"pretty","html:target/HtmlReports/report.html",
						"json:target/JSONReports/report.json",
						"junit:target/JunitReports/report.xml"} 
					)
public class TestRunner_RunWithBackground_Test10 {

}

//"pretty","json:target/JSONReports/report.json"
//"pretty","junit:target/JunitReports/report.xml"
