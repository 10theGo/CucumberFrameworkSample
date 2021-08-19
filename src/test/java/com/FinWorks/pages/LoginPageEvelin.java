package com.FinWorks.pages;

import com.FinWorks.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageEvelin extends BasePage{

    @FindBy(xpath = "//li[text()='#Inbox']")
    public WebElement inboxPageSubtitle;

    @FindBy (xpath = "//p[@class]")
    public WebElement loginErrorMsg;

    @FindBy (css = "[required ='required']")
    public WebElement usernameAndPasswordInputBoxes;


    public WebElement dynamicSubtitleWebElement(String subtitleName){
        WebElement element = Driver.get().findElement(By.xpath("//li[text()='" + subtitleName + "']"));
        return element;
    }
}
