package com.duobank.pages;

import com.duobank.utilities.Driver;
import com.duobank.utilities.SeleniumUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreditReportPage {

    public CreditReportPage() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(id = "creditreport1")
    public WebElement preApprovalInquiryButtonYes;

    @FindBy(id = "creditreport2")
    public WebElement preApprovalInquiryButtonNo;

    @FindBy(xpath = "//a[@href='#next']")
    public WebElement preApprovalInquiryNextButton;

    public void clickCheckboxYes(){
        SeleniumUtils.jsClick(preApprovalInquiryButtonYes);
    }

    public void clickCheckboxNo() {
        SeleniumUtils.jsClick(preApprovalInquiryButtonNo);
    }

    public void clickNext(){
        SeleniumUtils.jsClick(preApprovalInquiryNextButton);
    }
}
