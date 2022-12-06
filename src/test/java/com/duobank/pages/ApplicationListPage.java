package com.duobank.pages;

import com.duobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationListPage {

    public ApplicationListPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//*[.='Application List']")
    public WebElement applicationListLinkButton;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBoxInApplicationList;

    @FindBy(xpath = "///a[.=' View Details ']")
    public WebElement viewDetailsButton;


}
