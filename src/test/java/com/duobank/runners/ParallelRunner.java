package com.duobank.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(


        features = "src/test/resources", // path to the feature files
        glue = "com/duobank/stepDefinitions", //path to the step definition classes
        stepNotifications = true,
        plugin = {
        "pretty",  // provides more info about the test run on the console
        "html:target/cucumber-built-in-report/report.html",  // generates a built-in cucumber html report
        "json:target/jsonReport.json",

}



)
@RunWith(Cucumber.class)
public class ParallelRunner {
}
