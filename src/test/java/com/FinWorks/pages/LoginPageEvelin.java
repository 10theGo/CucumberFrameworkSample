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

    @FindBy(css="#login")
    public WebElement userName;


    @FindBy(css="#password")
    public WebElement password;

    @FindBy(xpath = "//*[@id='wrapwrap']/main/div/form/div[3]/button")
    public WebElement submit;

    @FindBy (xpath = "//*[@data-action-id='220']")
    private WebElement notesBtn;

    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
    }

    public WebElement dynamicSubtitleWebElement(String subtitleName){
        WebElement element = Driver.get().findElement(By.xpath("//li[text()='" + subtitleName + "']"));
        return element;
    }

    public WebElement getNotesBtn() {
        return notesBtn;
    }
}
