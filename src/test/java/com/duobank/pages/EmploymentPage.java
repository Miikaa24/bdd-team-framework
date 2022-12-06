package com.duobank.pages;

import com.duobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmploymentPage <WebElements>{

    public EmploymentPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//a[@href='#next']")
    public WebElement nextButton;
    @FindBy(xpath = "//div[@class='form-group']//label[@for='employername1']")
    public WebElement employerInfo;

    @FindBy(id = "employername1")
    public WebElement employername1;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "position1")
    public WebElement position1;

    @FindBy(id = "state1")
    public WebElement state1;

    @FindBy(id = "start_date1")
    public WebElement start_date1;

    @FindBy(id = "grossmonthlyincome")
    public WebElement grossmonthlyincome;

    @FindBy(id = "monthlyovertime")
    public WebElement monthlyovertime;

    @FindBy(id = "monthlybonuses")
    public WebElement monthlybonuses;

    @FindBy(id = "monthlycommission")
    public WebElement monthlycommission;

    @FindBy(id = "monthlydividents")
    public WebElement monthlydividents;








}
