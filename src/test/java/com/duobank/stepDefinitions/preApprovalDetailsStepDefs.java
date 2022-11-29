package com.duobank.stepDefinitions;

import com.duobank.pages.HomePage;
import com.duobank.pages.PreApprovalDetailsPage;
import com.duobank.utilities.ConfigReader;
import com.duobank.utilities.Driver;
import com.duobank.utilities.SeleniumUtils;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class preApprovalDetailsStepDefs {


    HomePage homePage = new HomePage();
    PreApprovalDetailsPage preApprovalDetailsPage = new PreApprovalDetailsPage();

    @When("I login")
    public void i_enter_valid_login_credentials() throws InterruptedException {

        homePage.enterEmail.sendKeys(ConfigReader.getProperty("email"));
        homePage.enterPass.sendKeys(ConfigReader.getProperty("pass"));
        homePage.loginButton.click();
        Thread.sleep(2000);

    }
    @When("I click on Mortgage Application")
    public void i_click_on_mortgage_application() {


        preApprovalDetailsPage.mortgageApplication.click();
    }
    @Then("I click Next Button")
    public void i_click_next_button() {

        preApprovalDetailsPage.nextButton.click();
    }


    @Then("I should see THIS FIELD IS REQUIRED. text")
    public void i_should_see_this_field_is_required_text() {

        Assert.assertTrue(preApprovalDetailsPage.fieldIsRequired.isDisplayed());
    }

    @When("Check No Checkbox under Are You Working With realtor")
    public void check_no_checkbox_under_are_you_working_with_realtor() throws InterruptedException {

        SeleniumUtils.jsClick(preApprovalDetailsPage.checkboxNo);
        Thread.sleep(2000);
    }

    @Then("Enter purchase price")
    public void enter_purchase_price() throws InterruptedException {

        preApprovalDetailsPage.purchasePrice.sendKeys("850000");
        Thread.sleep(1000);
    }
    @Then("Enter amount of the down payment")
    public void enter_amount_of_the_down_payment() throws InterruptedException {

        preApprovalDetailsPage.downPayment.sendKeys("150000");
        Thread.sleep(1000);
    }
    @Then("Click on next button")
    public void click_on_next_button() {

        preApprovalDetailsPage.nextButton.click();
    }
    @Then("I should be on personal information page")
    public void i_shoul_be_on_personal_information_page() {

        //preApprovalDetailsPage.personalInfoPage.isDisplayed();

    }


    @When("Check Yes Checkbox under Are You Working With realtor")
    public void check_yes_checkbox_under_are_you_working_with_realtor() {

        SeleniumUtils.jsClick(preApprovalDetailsPage.checkboxYes);
    }


    @Then("I enter realtor name")
    public void i_enter_realtor_name() {

        Faker faker = new Faker();
        preApprovalDetailsPage.realtorinfo.sendKeys(faker.name().fullName());
    }


    @Then("Enter amount of the down payment that is greater than purchase price")
    public void enter_amount_of_the_down_payment_that_is_greater_than_purchase_price() {

        preApprovalDetailsPage.downPayment.sendKeys("900000");
    }

    @Then("Loan amount amount should be calculated correct")
    public void loan_amount_amount_should_be_calculated_correct() {

    }

    @Then("Click on Purpose of loan")
    public void click_on_purpose_of_loan() throws InterruptedException {

        preApprovalDetailsPage.dropdowm.click();
        Thread.sleep(1000);
    }
    @Then("Search {string}")
    public void search(String loanType) {

        preApprovalDetailsPage.dropdownSearch.sendKeys(loanType);
    }
    @Then("Loan I should see No Result Found text.")
    public void loan_i_should_see_no_result_found_text() {

        Assert.assertTrue(preApprovalDetailsPage.noResultFound.isDisplayed());
    }




}

