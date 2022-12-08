
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
import java.util.Random;

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
        homePage.lastName.sendKeys(last);
        //Thread.sleep(1000);
        homePage.email.sendKeys(faker.internet().emailAddress());
        //Thread.sleep(1000);
        homePage.password.sendKeys(faker.internet().password());
        Thread.sleep(2000);


    }
    @When("click on the sign up button")
    public void click_on_the_sign_up_button() throws InterruptedException {
        homePage.signUpButton.click();
        Thread.sleep(3000);
    }
    @Then("I should be able to see Welcome Back, Automation Testers! text")
    public void i_should_be_able_to_see_welcome_back_automation_testers_text() {
        Assert.assertTrue((homePage.HomePageText).getText().contains("Welcome Back, Automation Testers!"));
    }


    @When("I enter the following info to sign up")
    public void i_enter_the_following_info_to_sign_up( List<Map<String, String>> dataTable) throws InterruptedException{

//        System.out.println(dataTable);
//        System.out.println(dataTable.get(0).get("Firstname"));

        Map<String, String> map = dataTable.get(0);


        HomePage homePage = new HomePage();
        int rand = new Random().nextInt(1000);
        first=map.get("Firstname");
        last=map.get("Lastname");
        homePage.firstName.sendKeys(map.get("Firstname"));
        homePage.lastName.sendKeys(map.get("Lastname"));

        Thread.sleep(500);
        homePage.email.sendKeys(map.get("Email")+rand);
        //Thread.sleep(500);
        homePage.password.sendKeys(map.get("Password"));

        Thread.sleep(1000);

    }
}
