package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\java\\Feature",glue= {"StepDefinitions"},
monochrome=true,
plugin= {"pretty","html:target/HtmlReports.html",
"json:target/JsonReports.json",
"junit:target/JunitReport.xml"},
tags="@Login or @Support")

public class TestRunner {

	
}
