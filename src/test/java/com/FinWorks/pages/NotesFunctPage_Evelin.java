package com.FinWorks.pages;

import com.FinWorks.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.WeakHashMap;

public class NotesFunctPage_Evelin {

    @FindBy (xpath = "//li[text()='Notes']")
    private WebElement notesPageSubtitle;

    //IT IS NOT WORKING THROUGH FINDBY TAG SO I CREATE A METHOD LOCATING IT WITH DRIVER DIRECTLY
//    @FindBy (xpath = "//button[contains(text(),'Create')]")
//    private WebElement createBtn;



    public WebElement getNotesPageSubtitle() {
        return notesPageSubtitle;
    }

    public WebElement dynamicSubtitleWebElement(String subtitleName){
        WebElement element = Driver.get().findElement(By.xpath("//li[text()='" + subtitleName + "']"));
        return element;
    }

    public WebElement getCreateBtn() {
        WebElement element = Driver.get().findElement(By.xpath("//button[contains(text(),'Create')]"));
        return element;
    }
}

