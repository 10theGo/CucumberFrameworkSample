package com.FinWorks.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage_Evelin extends DashboardPage {

    @FindBy (xpath = "//*[@class='img-circle oe_topbar_avatar']")
    private WebElement logoutAvatarButton;

    @FindBy (xpath =  "//*[@class='oe_topbar_name']")
    private WebElement logoutNameButton;

    @FindBy (xpath = "(//ul)[4]/li")
    private WebElement nameAvatarDropdawnMenuOptions;

    @FindBy (xpath = "(//a[@aria-expanded='false'])[1]")
    private WebElement dropdawnMenu;

    @FindBy (css = "[data-menu='logout']")
    private WebElement logoutButton;

    public WebElement getLogoutButton() {
        return logoutButton;
    }

    public WebElement getDropdawnMenu() {
        return dropdawnMenu;
    }

    public WebElement getWebelementNameAvatarDropdawnMenu() {
        return nameAvatarDropdawnMenuOptions;
    }

    public WebElement getLogoutNameButton() {
        return logoutNameButton;
    }

    public WebElement getLogoutAvatarButton(){
        return logoutAvatarButton;
    }
}
