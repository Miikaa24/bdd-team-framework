package com.duobank.stepDefinitions;

import com.duobank.pages.HomePage;
import com.duobank.utilities.ConfigReader;
import com.duobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    @When("I enter valid login credentials")
    public void i_enter_valid_login_credentials() {
        HomePage homePage = new HomePage();
        homePage.enterEmail.sendKeys(ConfigReader.getProperty("email"));
        homePage.enterPass.sendKeys(ConfigReader.getProperty("pass"));
        homePage.loginButton.click();

    }

    @Then("I should be able to login and land on Welcome Page")
    public void i_should_be_able_to_login_and_land_on_welcome_page() {
        Assert.assertEquals("http://qa-duobank.us-east-2.elasticbeanstalk.com/dashboard.php", Driver.getDriver().getCurrentUrl());

    }

    @When("I enter invalid login credentials")
    public void i_enter_invalid_login_credentials() {
        HomePage homePage = new HomePage();
        homePage.enterEmail.sendKeys("myemail");
        homePage.enterPass.sendKeys("pass");
        homePage.loginButton.click();
    }
    @Then("I should not be able to login")
    public void i_should_not_be_able_to_login() {
        Assert.assertNotEquals("http://qa-duobank.us-east-2.elasticbeanstalk.com/dashboard.php", Driver.getDriver().getCurrentUrl());

    }
    @When("I enter no login credentials")
    public void i_enter_no_login_credentials() {
        HomePage homePage = new HomePage();
        homePage.enterEmail.sendKeys("");
        homePage.enterPass.sendKeys("");
        homePage.loginButton.click();

    }

    @When("I enter login credentials as {string} and {string}")
    public void i_enter_login_credentials_as_and(String email, String pass) {
        HomePage homePage = new HomePage();
        homePage.enterEmail.sendKeys(email);
        homePage.enterPass.sendKeys(pass);
        homePage.loginButton.click();
    }
}
