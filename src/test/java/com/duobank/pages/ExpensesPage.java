package com.duobank.pages;

import com.duobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpensesPage <WebElements> {
    public ExpensesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//input[@value='Rent']")
    public WebElement checkRent;

    @FindBy(id = "monthlyrentalpayment")
    public WebElement monthlyRent;

    @FindBy(xpath = "//a[contains(text(),'Next')]")
    public WebElement nextButton;



}
