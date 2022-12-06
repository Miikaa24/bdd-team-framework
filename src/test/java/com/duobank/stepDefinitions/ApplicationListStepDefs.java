package com.duobank.stepDefinitions;

import com.duobank.pages.ApplicationListPage;
import com.duobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ApplicationListStepDefs {



    ApplicationListPage applicationListPage;


    @When("I click on Application List button")
    public void i_click_on_application_list_button() {
        applicationListPage = new ApplicationListPage();
        applicationListPage.applicationListLinkButton.click();

    }
    @Then("I type applicant name on the search box")
    public void I_type_applicant_name_on_the_search_box() {
        applicationListPage = new ApplicationListPage();
        applicationListPage.searchBoxInApplicationList.sendKeys("Michael");
    }
    @Then("I should be able to see searched applicant name on the page")
    public void i_should_be_able_to_see_searched_applicant_name_on_the_page() {
        WebElement searchedApplicant = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'Michael')]"));
        String searchedApplicantName = searchedApplicant.getText();
        Assert.assertTrue(searchedApplicantName.contains("Michael"));
    }
}
