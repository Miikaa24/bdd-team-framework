package com.duobank.pages;

import com.duobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PreApprovalDetailsPage <WebElements> {

    public PreApprovalDetailsPage()
    {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//li[@class='nav-item has-sub sidebar-group-active open']//li[@class='active']//a")
    public WebElement mortgageApplication;

//    @FindBy(linkText = "Are you working with a realtor?")
//    public WebElement workWithRealtor;

    @FindBy(xpath = "//div[@class='actions clearfix']//li[2]//a")
    public WebElement nextButton;

    @FindBy(xpath = "//*[contains(text(),'This field is required.')]")
    public WebElement fieldIsRequired;

    @FindBy(id = "realtor2")
    public WebElement checkboxNo;
    @FindBy(id = "estimatedprice")
    public WebElement purchasePrice;
    @FindBy(id = "downpayment")
    public WebElement downPayment;

    @FindBy(xpath = "//h6[contains(text(),'Personal Information')]")
    public WebElement personalInfoPage;
    @FindBy(id = "realtor1")
    public WebElement checkboxYes;
    @FindBy(id = "realtorinfo")
    public WebElement realtorinfo;

    @FindBy(id = "downpaymentpercentage")
    public WebElement downpaymentpercentage;

    @FindBy(xpath = "//span[contains(text(),'Purchase a Home')]")
    public WebElement dropdowm;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement dropdownSearch;

    @FindBy(xpath = "//li[@class='select2-results__option select2-results__message']")
    public WebElement noResultFound;
}

