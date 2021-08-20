package com.FinWorks.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage_Shiva extends DashboardPage{

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    private  WebElement NameOfUser;

    @FindBy(linkText = "Log out")
    private WebElement logOut;

    @FindBy (xpath = "(//a[@aria-expanded='true'])[1]")
    private WebElement DisplayDropdawnMenu;

    public WebElement getNameOfUser() {
        return NameOfUser;
    }
    public WebElement getLogOut() {
        return logOut;
    }
    public WebElement getDisplayDropdawnMenu() {
        return DisplayDropdawnMenu;
    }



}
