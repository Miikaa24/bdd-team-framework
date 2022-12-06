package com.duobank.pages;

import com.duobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MortgageApplicationPage<WebElements> {
    public MortgageApplicationPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[.='Mortgage Application']")
    public WebElement mortgageApplicationButton;

    @FindBy(xpath = "//label[@for='realtor2']")
    public WebElement checkNoForRealtor;

    @FindBy(id = "estimatedprice")
    public WebElement estimatedPurchasePriceBox;

    @FindBy(id = "downpayment")
    public WebElement downPaymentBox;

    @FindBy(xpath = "//a[.='Next']")
    public WebElement nextButton;

    @FindBy(id = "b_firstName")
    public WebElement firstNameInPersonalInformation;

    @FindBy(id = "b_middleName")
    public WebElement middleNameInPersonalInformation;

    @FindBy(id = "b_lastName")
    public WebElement lastNameInPersonalInformation;

    @FindBy(id = "b_email")
    public WebElement emailInPersonalInformation;

    @FindBy(id = "b_ssn")
    public WebElement ssnInPersonalInformation;

    @FindBy(id = "b_cell")
    public WebElement cellPhoneInPersonalInformation;

    @FindBy(id = "b_dob")
    public WebElement dobInPersonalInformation;

    @FindBy(id = "//select[@name='b_marital']")
    public WebElement maritalStatusInPersonalInformation;

    @FindBy(xpath = "//label[@for='privacypolicy']")
    public WebElement privacyPolicyCheckBox;

    @FindBy(id = "b_firstName-error")
    public WebElement firstNameErrorMessage;







    @FindBy (id = "steps-uid-0-p-1")
    public List<WebElement> personalInformationElements;
}
