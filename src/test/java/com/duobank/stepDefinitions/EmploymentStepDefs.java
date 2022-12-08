package com.duobank.stepDefinitions;

import com.duobank.pages.*;
import com.duobank.utilities.ConfigReader;
import com.duobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class EmploymentStepDefs {


    EmploymentPage employmentPage = new EmploymentPage();
    MortgageApplicationPage mortgageApplicationPage;
    PreApprovalDetailsPage preApprovalDetailsPage;
    ExpensesPage expensesPage = new ExpensesPage<>();



    @When("I enter rent amount")
    public void i_enter_rent_amount() {
        expensesPage.monthlyRent.sendKeys("3500");
    }
    @Then("click next")
    public void click_next() {

        expensesPage.nextButton.click();
    }

    @Then("I should be able to direct to the Employment page")
    public void i_should_be_able_to_direct_to_the_employment_page() {
        Assert.assertTrue(employmentPage.employerInfo.isDisplayed());
    }

    @When("I enter following info for required fields")
    public void i_enter_following_info_for_required_fields(List<Map<String,String>> dataTable) {

        employmentPage.employername1.sendKeys(dataTable.get(0).get("Name"));
        employmentPage.position1.sendKeys(dataTable.get(0).get("Position"));
        employmentPage.city.sendKeys(dataTable.get(0).get("City"));
    }

    @Then("I choose state")
    public void i_choose_state() {
        Select state = new Select(Driver.getDriver().findElement(By.id("state1")));
        state.selectByVisibleText("AK");
    }

    @Then("I enter following info for monthly income")
    public void i_enter_following_info_for_monthly_income(List<Map<String,String>> dataTable) {

        employmentPage.grossmonthlyincome.sendKeys(dataTable.get(0).get("Income"));
        employmentPage.monthlyovertime.sendKeys(dataTable.get(0).get("Overtime"));
        employmentPage.monthlybonuses.sendKeys(dataTable.get(0).get("Bonus"));
        employmentPage.monthlycommission.sendKeys(dataTable.get(0).get("Commission"));
        employmentPage.monthlydividents.sendKeys(dataTable.get(0).get("Interest"));
    }
    @Then("Click the next button")
    public void click_the_next_button() {
     employmentPage.nextButton.click();
    }

//    @Then("I should be able to direct to the next page and see PreApproval Inquiry")
//    public void i_should_be_able_to_direct_to_the_next_page_and_see_pre_approval_inquiry() {
//        WebElement currentPage = Driver.getDriver().findElement(By.xpath("//li[@class='current']"));
//        String currentPageText = currentPage.getText();
//        Assert.assertTrue(currentPageText.equalsIgnoreCase("credit report"));
//    }





}
