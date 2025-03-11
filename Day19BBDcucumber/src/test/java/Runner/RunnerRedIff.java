package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src\\test\\resources\\Features\\login.feature" }, glue = {
		"stepdefinition" , "Hooks" }, tags = "@SC2"/*, plugin = { "pretty",
				"html:src\\test\\resources\\Reports\\cucumber2-reports.html",
				"json:src\\test\\resources\\Reports\\json1-reports.json",
				"junit:src\\test\\resources\\Reports\\junit1-reports.xml" }*/)

public class RunnerRedIff extends AbstractTestNGCucumberTests {

}
