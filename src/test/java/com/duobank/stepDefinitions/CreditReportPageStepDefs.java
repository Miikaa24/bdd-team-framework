package com.duobank.stepDefinitions;

import com.duobank.pages.CreditReportPage;
import com.duobank.pages.EconsentPage;
import com.duobank.utilities.SeleniumUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class CreditReportPageStepDefs {

    CreditReportPage creditReportPage = new CreditReportPage();
    EconsentPage econsentPage = null;

    @When("Check Yes Checkbox under PreApproval Inquiry")
    public void check_yes_checkbox_under_preapproval_inquiry() {
        creditReportPage.clickCheckboxYes();
    }

    @Then("I Click on Next")
    public void i_click_on_next(){
        SeleniumUtils.jsClick(creditReportPage.preApprovalInquiryNextButton);
    }

    @Then("I should See the eConsent Title")
    public void i_should_see_the_eConsent_Title(){
        econsentPage = new EconsentPage();
        SeleniumUtils.waitFor(1);
        Assert.assertTrue(econsentPage.eConsentTitle.isDisplayed());
    }

    @When("Check No Checkbox under PreApproval Inquiry")
    public void check_no_checkbox_under_preapproval_inquiry(){
        creditReportPage.clickCheckboxNo();
    }

    @Then("Click on Next")
    public void click_on_next(){
        SeleniumUtils.jsClick(creditReportPage.preApprovalInquiryNextButton);
    }

    @When( "Check Both Yes and No Checkbox under PreApproval Inquiry")
    public void check_both_yes_and_no_checkbox_under_preapproval_inquiry(){
        creditReportPage.clickCheckboxYes();
        creditReportPage.clickCheckboxNo();
    }

    @Then("I click Next Button on creditReport")
    public void i_click_next_button_on_credit_report() {
        creditReportPage.clickNext();
    }


}
