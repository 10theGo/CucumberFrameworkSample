package com.FinWorks.pages;

import com.FinWorks.utilities.BrowserUtils;
import com.FinWorks.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
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

    //*********************MUSTAFA
//    @FindBy(xpath = "//button[contains(text(),'Create')]")
//    private WebElement createNote;
//
//    public void createNewNote() {
//        new WebDriverWait(Driver.get(), 4).until(ExpectedConditions.titleIs("Notes - Odoo"));
//        createNote.click();
//    }

    //***************************************
    //LOCATORS BELONG TO CREATE TAG TAB
    @FindBy (xpath = "//li[contains(text(),'New')]")
    private WebElement NewSubtitle;

    public WebElement getNewSubtitle() {
        return NewSubtitle;
    }

    @FindBy (css = ".o_input.ui-autocomplete-input")
    private WebElement tagsBox;

    public WebElement getTagsBox() {
        return Driver.get().findElement(By.cssSelector(".o_input.ui-autocomplete-input"));
    }

    @FindBy (xpath = "//a[text()='color']")
    private WebElement colorOption;

    public WebElement getColorOption() {
        return  Driver.get().findElement(By.xpath("//a[text()='color']"));
    }
    @FindBy (xpath = "//span[@title='color']")
    private WebElement colorTagsBox;

    public WebElement getColorTagsBox() {
        return Driver.get().findElement(By.xpath("//span[@class='o_badge_text']"));
    }//span[@title='color']

    //DOES NOT WORK WHEN I USE THEM IN STEP DEFS
//    @FindBy (xpath = "//div[@aria-expanded='true']\"")
//    private WebElement coloursAvailables;
//
//    public WebElement getColoursAvailables() {
//        return coloursAvailables;
//    }

    public WebElement coloursSelected() {
        WebElement element = Driver.get().findElement(By.xpath("//div[@aria-expanded='true']"));
        return element;
    }

    @FindBy (xpath = ".note-editable.panel-body")
    private WebElement panelEditor;

    public WebElement getPanelEditor() {
        WebElement element = Driver.get().findElement(By.cssSelector(".note-editable.panel-body"));
        return element;
    }

    public void editedText() {
       getPanelEditor().sendKeys("This is a text for checking editor text box");
    }
    @FindBy (xpath = "//pre[@style]")
    private WebElement textEdited;

    public WebElement getTextEdited() {
        WebElement element = Driver.get().findElement(By.xpath("//p[text()='This is a text for checking editor text box']"));
        return element;
    }
    @FindBy (xpath = "(//*[@class='btn btn-default btn-sm dropdown-toggle'])[1]")
    private WebElement StyleBtb;

    public WebElement getStyleBtb() {
        WebElement element = Driver.get().findElement(By.xpath("(//*[@class='btn btn-default btn-sm dropdown-toggle'])[1]"));
        return element;
    }
    @FindBy (css = "[data-event='formatBlock']")
    private List<WebElement> typingStyle;

    public void getTypingStyle() {
        List<WebElement> style = Driver.get().findElements(By.cssSelector("[data-event='formatBlock']"));

        for (WebElement element : style) {
            element.click();
            getStyleBtb().click();
            BrowserUtils.waitFor(1);
        }
    }

        public List<String> getTypingStyleText() {
            List<WebElement> styleTextElements = Driver.get().findElements(By.cssSelector("[data-event='formatBlock']"));

            List<String> styleText = new ArrayList<>();
            for (WebElement elementText : styleTextElements) {
               styleText.add(elementText.getText());
               }
            return styleText;
    }

}

