
package com.FinWorks.pages;


import com.FinWorks.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class LoginPage {


        public LoginPage(){
            PageFactory.initElements(Driver.get(), this);
        }

        @FindBy(id="login")
        public WebElement userName;



        @FindBy(id="password")
        public WebElement password;

        @FindBy(xpath = "//*[@id='wrapwrap']/main/div/form/div[3]/button")
        public WebElement submit;

        @FindBy (xpath = "//li[text()='#Inbox']")
        public WebElement inboxPageSubtitle;

        @FindBy (xpath = "//p[@class]")
        public WebElement loginErrorMsg;

        public void login(String userNameStr, String passwordStr) {
            userName.sendKeys(userNameStr);
            password.sendKeys(passwordStr);
            submit.click();
            // verification that we logged
        }
        public WebElement getPageSubtitleText(String subtitleName){
            WebElement element = Driver.get().findElement(By.xpath("//li[text()='" + subtitleName + "']"));
            return element;
        }


    }