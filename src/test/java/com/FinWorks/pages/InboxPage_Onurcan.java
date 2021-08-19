package com.FinWorks.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InboxPage_Onurcan extends BasePage {

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    private WebElement topbarButton;

    public WebElement getTopbarButton() {
        return topbarButton;
    }

    public void setTopbarButton(WebElement topbarButton) {
        this.topbarButton = topbarButton;
    }

    @FindBy(css= "[data-menu='logout']")
    private WebElement logoutButton;

    public WebElement getLogoutButton() {
        return logoutButton;
    }

    public void setLogoutButton(WebElement logoutButton) {
        this.logoutButton = logoutButton;
    }
}
