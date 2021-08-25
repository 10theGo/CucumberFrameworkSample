package com.FinWorks.pages;

import com.FinWorks.utilities.BrowserUtils;
import com.FinWorks.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class NotesFunctPage_Evelin extends BasePage {

    @FindBy (xpath = "//li[text()='Notes']")
    private WebElement notesPageSubtitle;

    public WebElement getNotesPageSubtitle() {
        return notesPageSubtitle;
    }

    public WebElement dynamicSubtitleWebElement(String subtitleName){
        return notesPageSubtitle;
    }

    @FindBy (xpath = "//button[contains(text(),'Create')]" )
    private WebElement createBtn;

    public WebElement getCreateBtn() {
        return createBtn;
    }

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
        return  tagsBox;
    }

    @FindBy (xpath = "//a[text()='color']")
    private WebElement colorOption;

    public WebElement getColorOption() {
        return colorOption;
    }

    @FindBy (xpath = "//span[@title='color']")
    private WebElement colorTagsBox;

    public WebElement getColorTagsBox() {
        return colorTagsBox;
    }

    public WebElement coloursSelected() {
        WebElement element = Driver.get().findElement(By.xpath("//div[@aria-expanded='true']"));
        return element;
    }

    //***************************************
    //LOCATORS FOR TEXT EDITION

    @FindBy (css = ".note-editable.panel-body")
    private WebElement panelEditor;

    public WebElement getPanelEditor() {
        return panelEditor;
    }

    public void editedText() {
       getPanelEditor().sendKeys("This is a text for checking editor text box");
    }

    @FindBy (xpath = "//p[text()='This is a text for checking editor text box']")
    private WebElement textEdited;

    public WebElement getTextEdited() {
        return textEdited;
    }
    @FindBy (xpath = "(//*[@class='btn btn-default btn-sm dropdown-toggle'])[1]")
    private WebElement styleBtb;

    public WebElement getStyleBtb() {
        return styleBtb;
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

    @FindBy (css = "[data-event='formatBlock']")
    private List<WebElement> eachStyle;

        public List<String> getTypingStyleText() {
            List<WebElement> styleTextElements = eachStyle;

            List<String> styleText = new ArrayList<>();
            for (WebElement elementText : styleTextElements) {
               styleText.add(elementText.getText());
               }
            return styleText;
    }
    //***************************************
    //LOCATORS FOR SELECT DIFFERENT TABS OF THE PAGE

    @FindBy (xpath = "//*[@class='btn btn-sm o_arrow_button btn-default']")
    private List<WebElement> tabsData_Type;

    public void getTabsData_Type() {

                try {
                    List<WebElement> tabs = tabsData_Type;
                    for (WebElement tab : tabs) {
                        for(int i = 0; i < 5; i++){
                            i++;
                       tab.click() ;
                       BrowserUtils.waitForPageToLoad(5);
                        }
                     }
                }catch (StaleElementReferenceException ex){
                    System.out.println("Stale element detected"+ ex.toString());
            }
    }
    @FindBy (css = "[accesskey='s']")
    private WebElement saveBtn;

    public WebElement getSaveBtn() {
        return saveBtn;
    }

    @FindBy (xpath = "(//li[@class='active'])[2]")
    private WebElement savedTitleNote;

    public WebElement getSavedTitleNote() {
        return savedTitleNote;
    }
}

