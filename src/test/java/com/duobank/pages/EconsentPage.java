package com.duobank.pages;

import com.duobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EconsentPage {

    public EconsentPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "eConsentdeclarerFirstName")
    public WebElement eConsentFirstName;

    @FindBy(id = "eConsentdeclarerLastName")
    public WebElement eConsentLastName;

    @FindBy(id = "eConsentdeclarerEmail")
    public WebElement eConsentEmail;

    @FindBy(id = "agree")
    public WebElement eConsentAgreeButton;

    @FindBy(id = "dontagree")
    public WebElement eConsentDisagreeButton;

    @FindBy(xpath = "//a[@href='#next']")
    public WebElement eConsentNextButton;

    @FindBy(xpath = "//h4[contains(text(), 'eConsent')]")
    public WebElement eConsentTitle;

    @FindBy(xpath = "//label[@id='eConsentdeclarerFirstName-error']")
    public WebElement fieldRequiredFirstNameError;

    @FindBy(xpath = "//label[@id='eConsentdeclarerEmail-error']")
    public WebElement getFieldRequiredEmailError;

}
