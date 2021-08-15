package com.FinWorks.pages;

import com.FinWorks.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Onurcan extends BasePage{

    public LoginPage_Onurcan(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (css="#login")
    public WebElement loginBox;

    @FindBy (css= "#password")
    public WebElement passwordBox;

    @FindBy (xpath = "//*[@type='submit']")
    public WebElement submitButton;


}
