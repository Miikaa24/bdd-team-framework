package com.duobank.stepDefinitions;

import com.duobank.pages.HomePage;
import com.duobank.utilities.DButils;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.apache.commons.codec.digest.DigestUtils;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.Keys;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.*;

import java.util.List;
import java.util.Map;

public class DatabaseStepDefs {

    HomePage homePage = new HomePage();


    @Then("I enter customer information and click sugnUp button")
    public void i_enter_customer_information_and_click_sugn_up_button() throws InterruptedException, SQLException {

        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = firstName + "@" + lastName +".com";
        String password = firstName + lastName;
        String query = "select * from tbl_user where first_name='"+firstName+"'";
        homePage.firstName.sendKeys(firstName);
        homePage.lastName.sendKeys(lastName);
        homePage.email.sendKeys(email);
        homePage.password.sendKeys(password, Keys.ENTER);

        List<Map<String, Object>> resultFromDB = DButils.getQueryResultListOfMaps(query);

        Map<String, Object> userInfoRow = resultFromDB.get(0);

        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(userInfoRow.get("first_name")).isEqualTo(firstName);
        softAssertions.assertThat(userInfoRow.get("last_name")).isEqualTo(lastName);
        softAssertions.assertThat(userInfoRow.get("email")).isEqualTo(email);
        String passwordMD5 = DigestUtils.md5Hex(password);
        softAssertions.assertThat(userInfoRow.get("password")).isEqualTo(passwordMD5);

        DButils.executeUpdate("DELETE from tbl_user where first_name='"+firstName+"'");

        softAssertions.assertAll();

        Thread.sleep(1000);
    }

    @Then("The information I entered should match the information in the database")
    public void the_information_i_entered_should_match_the_information_in_the_database() {


    }


}
