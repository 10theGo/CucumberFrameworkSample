package com.FinWorks.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage_Evelin extends DashboardPage {

    @FindBy (css = "img-circle oe_topbar_avatar")
    private WebElement logoutAvatarButton;

    @FindBy (css =  "//*[@class='oe_topbar_name']")
    private WebElement logoutNameButton;

    public WebElement getLogoutNameButton() {
        return logoutNameButton;
    }

    public WebElement getLogoutAvatarButton(){
        return logoutAvatarButton;
    }
}
