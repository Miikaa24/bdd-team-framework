package com.duobank.pages;

import com.duobank.utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@href='register.php']")
    public WebElement signUpLink;


    @FindBy(name = "first_name")
    public WebElement firstName;

    @FindBy(name = "last_name")
    public WebElement lastName;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//*[contains(text(),' Please enter your details to sign up and create your account')]")
    public WebElement createAccountText;

    @FindBy(name = "register")
    public WebElement signUpButton;

    @FindBy(id = "exampleInputEmail1")
    public WebElement enterEmail;

    @FindBy(id = "exampleInputPassword1")
    public WebElement enterPass;

    @FindBy(name = "login")
    public WebElement loginButton;

}














