
package com.duobank.stepDefinitions;
import com.duobank.pages.HomePage;
import com.duobank.pages.MortgageApplicationPage;
import com.duobank.utilities.ConfigReader;
import com.duobank.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class SignUpStepDef {
    String first;
    String last;

    HomePage homePage = new HomePage();
    @When("I enter valid random info to sign up")
    public void i_enter_valid_random_info_to_sign_up() throws InterruptedException {

        Faker faker = new Faker();

        Thread.sleep(1000);
       // homePage.signUpLink.click();
        Thread.sleep(1000);
        first=faker.name().firstName();
        Thread.sleep(1000);
        System.out.println(first);
        //Thread.sleep(1000);
        homePage.firstName.sendKeys(first);
        //Thread.sleep(1000);
        last=faker.name().lastName();
        // Thread.sleep(1000);
        homePage.lastName.sendKeys(last);
        //Thread.sleep(1000);
        homePage.email.sendKeys(faker.internet().emailAddress());
        //Thread.sleep(1000);
        homePage.password.sendKeys(faker.internet().password());
//
    }
//    @Then("I should be able to see the same full name that I signed up with")
//    public void i_should_be_able_to_see_the_same_full_name_that_i_signed_up_with() {
//
//        Assert.assertEquals(first+" "+last, new MortgageApplicationPage().fullNameOnDash.getText());
//    }


    @When("I enter the following info to sign up")
    public void i_enter_the_following_info_to_sign_up( List<Map<String, String>> dataTable) throws InterruptedException {

        Map<String, String> map = dataTable.get(0);

        HomePage homePage = new HomePage();

        first=map.get("Firstname");
        last=map.get("Lastname");
        homePage.firstName.sendKeys(map.get("FIRST"));
        homePage.lastName.sendKeys(map.get("LAST"));
        homePage.email.sendKeys(map.get("EMAIL"));
        homePage.password.sendKeys(map.get("PASS"));

        Thread.sleep(2000);
    }
}
