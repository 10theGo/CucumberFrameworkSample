package com.FinWorks.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage_Evelin extends DashboardPage {

    @FindBy (xpath = "//*[@class='img-circle oe_topbar_avatar']")
    private WebElement logoutAvatarButton;

    @FindBy (xpath =  "//*[@class='oe_topbar_name']")
    private WebElement logoutNameButton;

    @FindBy (xpath = "(//ul)[4]/li")
    private WebElement nameAvatarDropdawnMEnu;

    public WebElement getWebelementNameAvatarDropdawnMenu() {
        return nameAvatarDropdawnMEnu;
    }

    public WebElement getLogoutNameButton() {
        return logoutNameButton;
    }

    public WebElement getLogoutAvatarButton(){
        return logoutAvatarButton;
    }
}
