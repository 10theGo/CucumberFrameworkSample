package com.FinWorks.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageBurhan extends BasePage {

    @FindBy(id = "login")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;

    @FindBy(css =".alert.alert-danger")
    public WebElement wrongCredentialsMessage;

    public void loginWith(String username, String password) {
        this.email.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
    }

}
