package com.duobank.stepDefinitions;

import com.duobank.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {
    //most types of hooks are explained in Akmal's bdd framework under Hook's class
    @Before
    public void setupScenario(){

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Driver.getDriver().manage().window().maximize();
        //you can add delete cookies as well

    }
    @After
        public void tearDownScenario(Scenario scenario){

        if(scenario.isFailed()) {
            byte[] screenshotFile = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshotFile, "image/png", "screenshotOfFailure");
        }

        Driver.quitDriver();
    }
}
