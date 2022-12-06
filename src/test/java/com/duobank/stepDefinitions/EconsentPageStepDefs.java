package com.duobank.stepDefinitions;

import com.duobank.pages.EconsentPage;
import com.duobank.pages.SummaryPage;
import com.duobank.utilities.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EconsentPageStepDefs {

    EconsentPage econsentPage = new EconsentPage();
    SummaryPage summaryPage = new SummaryPage();

    @When("I Consent")
    public void i_enter_personal_information(){
        econsentPage.eConsentFirstName.sendKeys(ConfigReader.getProperty("FirstName"));
        econsentPage.eConsentLastName.sendKeys(ConfigReader.getProperty("LastName"));
        econsentPage.eConsentEmail.sendKeys(ConfigReader.getProperty("email"));
    }

    @Then("I Click on Agree and Next")
    public void i_click_on_agree_and_next(){
        econsentPage.eConsentAgreeButton.click();
        econsentPage.eConsentNextButton.click();
    }

    @Then("I should See the eConsent Summary Title")
    public void i_should_see_the_eConsent_summary_title(){
        Assert.assertTrue(summaryPage.eConsentSummary.isDisplayed());
    }

    @When("I don't Consent")
    public void i_enter_my_personal_information() {
        econsentPage.eConsentFirstName.sendKeys(ConfigReader.getProperty("FirstName"));
        econsentPage.eConsentLastName.sendKeys(ConfigReader.getProperty("LastName"));
        econsentPage.eConsentEmail.sendKeys(ConfigReader.getProperty("email"));
    }

    @Then("I Click on Disagree and Next")
    public void i_click_on_disagree_and_next(){
        econsentPage.eConsentDisagreeButton.click();
        econsentPage.eConsentNextButton.click();
    }

    @Then("I should See eConsent Summary Title")
    public void i_should_see_eConsent_summary_title(){
        Assert.assertTrue(summaryPage.eConsentSummary.isDisplayed());
    }

    @When("I Consent but don't  Enter my First Name")
    public void i_consent_but_dont_enter_my_firt_name(){
        econsentPage.eConsentAgreeButton.click();
        econsentPage.eConsentNextButton.click();
    }

    @Then("I should See the Field Required Error")
    public void i_should_see_the_field_required_error(){
        Assert.assertTrue(econsentPage.fieldRequiredFirstNameError.isDisplayed());
    }

    @When("I don't Consent but don't Enter my First Name")
    public void i_dont_consent_but_dont_enter_my_firts_name(){
        econsentPage.eConsentDisagreeButton.click();
        econsentPage.eConsentNextButton.click();
    }

    @Then("I should See First Name Field Required Error")
    public void i_should_see_first_name_field_required_error(){
        Assert.assertTrue(econsentPage.fieldRequiredFirstNameError.isDisplayed());
    }

    @When("I Consent but don't  Enter my Email Address")
    public void i_consent_but_dont_enter_email_address(){
        econsentPage.eConsentAgreeButton.click();
        econsentPage.eConsentNextButton.click();
    }

    @Then("I should See Email Field Required Error")
    public void i_should_see_email_field_required_error(){
        Assert.assertTrue(econsentPage.getFieldRequiredEmailError.isDisplayed());
    }

    @When("I don't Consent but don't  Enter my Email Address")
    public void i_dont_consent_but_dont_enter_email_address(){
        econsentPage.eConsentDisagreeButton.click();
        econsentPage.eConsentNextButton.click();
    }

    @Then("I should See the Email Field Required Error")
    public void i_should_see_the_email_field_required_error(){
        Assert.assertTrue(econsentPage.getFieldRequiredEmailError.isDisplayed());
    }


}
