package com.FinWorks.pages;

import com.FinWorks.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Onurcan extends BasePage {

    public LoginPage_Onurcan() {
        PageFactory.initElements(Driver.get(), this);
    }

    public WebElement getLoginBox() {
        return loginBox;
    }

    public void setLoginBox(WebElement loginBox) {
        this.loginBox = loginBox;
    }

    @FindBy(css = "#login")
    private WebElement loginBox;

    @FindBy(css = "#password")
    private WebElement passwordBox;

    @FindBy(xpath = "//*[@type='submit']")
    private WebElement submit;

    public WebElement getPasswordBox() {
        return passwordBox;
    }

    public void setPasswordBox(WebElement passwordBox) {
        this.passwordBox = passwordBox;
    }

    public WebElement getSubmit() {
        return submit;
    }

    public void setSubmit(WebElement submit) {
        this.submit = submit;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(WebElement errorMessage) {
        this.errorMessage = errorMessage;
    }

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    private WebElement errorMessage;




    public void login(String userNameStr, String passwordStr) {
        loginBox.sendKeys(userNameStr);
        passwordBox.sendKeys(passwordStr);
        submit.click();
    }


}


