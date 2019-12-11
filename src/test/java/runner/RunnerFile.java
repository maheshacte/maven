package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue="",
tags="@Reg123", plugin = {"pretty","html:target/cucumber-reports", "json:target/cucumber-reports/report.json"})
public class RunnerFile {

}
