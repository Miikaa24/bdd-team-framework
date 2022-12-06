package com.duobank.stepDefinitions;

import com.duobank.pages.HomePage;
import com.duobank.pages.MortgageApplicationPage;
import com.duobank.utilities.Driver;
import com.duobank.utilities.SeleniumUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PersonalInformationPageStepDefs {


    MortgageApplicationPage mortgageApplicationPage;


    @Then("I should be able to direct to the Preapproval Details page")
    public void i_should_be_able_to_direct_to_the_preapproval_details_page() {
        WebElement PreApprovalPageMessage = Driver.getDriver().findElement(By.xpath("//h6[.='PreApproval Inquiry']"));
        Assert.assertTrue(PreApprovalPageMessage.isDisplayed());
    }


    @Then("I enter required information for Preapproval Details page and click on Next button")
    public void i_enter_required_information_for_preapproval_details_page_and_click_on_next_button() {
        mortgageApplicationPage = new MortgageApplicationPage<>();
        WebElement checkBoxForNoRealtor;

        checkBoxForNoRealtor = mortgageApplicationPage.checkNoForRealtor;

        if (!checkBoxForNoRealtor.isSelected()) {
            checkBoxForNoRealtor.click();
        }

        mortgageApplicationPage.estimatedPurchasePriceBox.sendKeys("1000000");
        mortgageApplicationPage.downPaymentBox.sendKeys("200000");
        mortgageApplicationPage.nextButton.click();

    }


    @Then("I should be able to direct to the next page and see Personal Information text")
    public void i_should_be_able_to_direct_to_the_next_page_and_see_personal_information_text() {

        WebElement personalInformationText;
        personalInformationText = Driver.getDriver().findElement(By.xpath("//h6[.='Personal Information']"));
        personalInformationText.isDisplayed();

    }




    @When("I enter valid credentials for application form on Personal Information page")
    public void i_enter_valid_credentials_for_application_form_on_personal_information_page() throws InterruptedException {
        //mortgageApplicationPage = new MortgageApplicationPage();
        mortgageApplicationPage.firstNameInPersonalInformation.sendKeys("John");
        mortgageApplicationPage.lastNameInPersonalInformation.sendKeys("Smith");
        mortgageApplicationPage.emailInPersonalInformation.sendKeys("jsmith@gmail");
        mortgageApplicationPage.dobInPersonalInformation.sendKeys("10101985");
        mortgageApplicationPage.ssnInPersonalInformation.sendKeys("123456789");
        Select maritalStatus = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='b_marital']")));
        maritalStatus.selectByVisibleText("Married");
        mortgageApplicationPage.cellPhoneInPersonalInformation.sendKeys("4154151515");
    }

    @Then("I check Privacy Policy box and click on next")
    public void i_check_privacy_policy_box_and_click_on_next() {
        mortgageApplicationPage.privacyPolicyCheckBox.click();
        mortgageApplicationPage.nextButton.click();

    }

    @Then("I should land on Expenses page and see Current Monthly Housing Expenses text")
    public void i_should_land_on_expenses_page_and_see_current_monthly_housing_expenses_text() {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//h6[.='Current Monthly Housing Expenses']")).isDisplayed());

    }


//    @When("I enter invalid credentials for application form on Personal Information page")
//    public void i_enter_invalid_credentials_for_application_form_on_personal_information_page() {
//        mortgageApplicationPage = new MortgageApplicationPage();
//          mortgageApplicationPage.maritalStatusInPersonalInformation.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
//        mortgageApplicationPage.firstNameInPersonalInformation.sendKeys("cl@ss123");
//        mortgageApplicationPage.lastNameInPersonalInformation.sendKeys("cl@ss123");
//        mortgageApplicationPage.emailInPersonalInformation.sendKeys("cl@ss123");
//        mortgageApplicationPage.dobInPersonalInformation.sendKeys("cl@ss123");
//        mortgageApplicationPage.ssnInPersonalInformation.sendKeys("cl@ss123");
//          mortgageApplicationPage.maritalStatusInPersonalInformation.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
//        Select maritalStatus = new Select(Driver.getDriver().findElement(By.xpath("//span[@aria-labelledby='select2-b_marital-container']")));
//        maritalStatus.getFirstSelectedOption();

//        SeleniumUtils.jsClick(mortgageApplicationPage.maritalStatusInPersonalInformation);
//        Driver.getDriver().findElement(By.xpath("//li[.='Married']")).click();
        //  Driver.getDriver().findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
//        mortgageApplicationPage.cellPhoneInPersonalInformation.sendKeys("cl@ss123");
//    }
    @Then("I click on next")
    public void i_click_on_next() {
        mortgageApplicationPage.nextButton.click();
    }
    @Then("I should no be able to land on Expenses page and see Current Monthly Housing Expenses text")
    public void i_should_no_be_able_to_land_on_expenses_page_and_see_current_monthly_housing_expenses_text() {
      Assert.assertFalse(Driver.getDriver().findElement(By.xpath("//h6[.='Current Monthly Housing Expenses']")).isDisplayed());
    }










    @Then("I click on next button on Personal Information page without entering any credentials")
    public void i_click_on_next_button_without_entering_any_credentials() {
        mortgageApplicationPage.lastNameInPersonalInformation.sendKeys("Smith");
        mortgageApplicationPage.nextButton.click();
    }
    @Then("I should be  able to see an error message of This field is required.")
    public void i_should_be_able_to_see_this_field_is_required_error_message() {
        boolean errorMessageIsDisplayed = mortgageApplicationPage.firstNameErrorMessage.isDisplayed();
        Assert.assertTrue(errorMessageIsDisplayed);
    }

}
