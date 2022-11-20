package com.duobank.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/test/resources", // path to the feature files
        glue = "com/duobank/stepDefinitions" //path to the step definition classes




)
@RunWith(Cucumber.class)
public class CucumberRunner {
}
