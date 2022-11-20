package com.duobank.stepDefinitions;

import com.duobank.pages.HomePage;
import com.duobank.utilities.ConfigReader;
import com.duobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BasicStepDefs{

    @Given("I navigate to the homepage")
    public void i_navigate_to_the_homepage(){
    Driver.getDriver().get(ConfigReader.getProperty("url"));}

    @Then("The homepage url should be correct")
    public void the_homepage_url_should_be_correct() {
        Assert.assertEquals(ConfigReader.getProperty("url"), Driver.getDriver().getCurrentUrl());
    }

    @And("The title should be Login - Loan Application")
    public void the_title_should_be_login_loan_application() {
    Assert.assertEquals("Login - Loan Application", Driver.getDriver().getTitle());
    Driver.quitDriver();
}
                                      //Second Scenario from Basic:
    @When("I click on sign up link")
    public void i_click_on_sign_up_link() {
        new HomePage().signUpLink.click();

    }
    @Then("I should see Please enter your details to sign up and create your account text")
    public void i_should_see_please_enter_your_details_to_sign_up_and_create_your_account_text() {
        Assert.assertTrue(new HomePage().createAccountText.isDisplayed());
    }
    @Then("I should see sign up button")
    public void i_should_see_sign_up_button() {
        Assert.assertTrue(new HomePage().signUpButton.isDisplayed());
        Driver.quitDriver();

    }
}

