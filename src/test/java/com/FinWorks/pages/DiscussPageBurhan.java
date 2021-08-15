package com.FinWorks.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiscussPageBurhan extends BasePage {
    @FindBy(xpath = "//span[.='Inbox']")
    public WebElement inboxTab;
}
