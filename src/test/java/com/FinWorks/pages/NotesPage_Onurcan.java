package com.FinWorks.pages;

import com.FinWorks.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class NotesPage_Onurcan extends BasePage {


    @FindBy(xpath = "//span[normalize-space()='Notes']")
    private WebElement notes;

    @FindBy(xpath = "//button[normalize-space()='Create']")
    private WebElement createButton;

    @FindBy(xpath = "//button[normalize-space()='Import']")
    private WebElement importButton;

    @FindBy(xpath = "//div[@class='note-editable panel-body']")
    private WebElement editingBox;

    @FindBy(xpath =   "//div[@class='o_input_dropdown']")
    private WebElement tagsDropDownButton;

    @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input']")
    private WebElement tagsInputBox;

    @FindBy(xpath="//a[normalize-space()='Create and Edit...']")
    private WebElement createTagButtonInTheTagsDropDown;

    @FindBy(xpath = "//li[@class='ui-menu-item']")
    private List<WebElement> allTheTags;

    @FindBy(xpath = "//button[@data-value='508']")
    private WebElement newButtonStatusBar;

    @FindBy(xpath = "//button[@data-value='509']")
    private WebElement todayButtonStatusBar;

    @FindBy(xpath = "//button[@data-value='510']")
    private WebElement thisWeekButtonStatusBar;

    @FindBy(xpath = "//button[@data-value='511']")
    private WebElement laterButtonStatusBar;

    @FindBy(xpath = "//button[@data-value='512']")
    private WebElement notesButtonStatusBar;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    private WebElement saveButton;

    public WebElement getTagsInputBox() {
        return tagsInputBox;
    }

    public void setTagsInputBox(WebElement tagsInputBox) {
        this.tagsInputBox = tagsInputBox;
    }

    public WebElement getSavedText() {
        return savedText;
    }

    public void setSavedText(WebElement savedText) {
        this.savedText = savedText;
    }

    @FindBy(xpath = "//button[normalize-space()='Discard']")
    private WebElement discardButton;

    @FindBy(xpath = "//li[@class='o_m2o_dropdown_option ui-menu-item']")
    private WebElement createTagInsideDD;
    @FindBy(xpath= "(//li[@class='active'])[2]")
    private WebElement savedText;

    private Object NoSuchElementException;



    public void clickCreateTagIsideDD(){
        createTagInsideDD.click();
    }


    public void clickNotesButton() {
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.waitForVisibility(notes,5);
        notes.click();
    }

    public void clickCreateButton() {
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.waitForVisibility(createButton,5);
        createButton.click();
    }

    public void clickImportButton() {
        importButton.click();
    }

    public void clickTagDropDownButton() {
        tagsDropDownButton.click();
    }

    public WebElement getDiscardButton() {
        return discardButton;
    }

    public void setDiscardButton(WebElement discardButton) {
        this.discardButton = discardButton;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public void setSaveButton(WebElement saveButton) {
        this.saveButton = saveButton;
    }

    public void clickThisWeekButtonStatusBar() {
        thisWeekButtonStatusBar.click();
    }

   public void createTag(String str){
        tagsInputBox.sendKeys(str);
       BrowserUtils.waitForVisibility(createTagInsideDD,5);
        clickCreateTagIsideDD();
   }


    public void clickCreateButtonInTheTagsDropDown() {
        createTagButtonInTheTagsDropDown.click();
    }

    public void clickNewButtonStatusBar() {
        newButtonStatusBar.click();
    }

    public void clickTodayButtonStatusBar() {
        todayButtonStatusBar.click();
    }

    public void clickLaterButtonStatusBar() {
        laterButtonStatusBar.click();
    }

    public void clickNotesButtonStatusBar() {
        notesButtonStatusBar.click();
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void clickDiscardButton() {
        discardButton.click();
    }


    public WebElement getNotes() {
        return notes;
    }

    public void setNotes(WebElement notes) {
        this.notes = notes;
    }

    public WebElement getCreateButton() {
        return createButton;
    }

    public void setCreateButton(WebElement createButton) {
        this.createButton = createButton;
    }

    public WebElement getImportButton() {
        return importButton;
    }

    public void setImportButton(WebElement importButton) {
        this.importButton = importButton;
    }

    public WebElement getEditingBox() {
        return editingBox;
    }

    public void setEditingBox(WebElement editingBox) {
        this.editingBox = editingBox;
    }

    public WebElement getTagsDropDownButton() {
        return tagsDropDownButton;
    }


    public void setTagsDropDownButton(WebElement tagsDropDownButton) {
        this.tagsDropDownButton = tagsDropDownButton;
    }



    public WebElement getCreateTagButtonInTheTagsDropDown() {
        return createTagButtonInTheTagsDropDown;
    }

    public void setCreateTagButtonInTheTagsDropDown(WebElement createTagButtonInTheTagsDropDown) {
        this.createTagButtonInTheTagsDropDown = createTagButtonInTheTagsDropDown;
    }

    public List<String> getAllTheTags() {
        List<String> tagNames = new ArrayList<>();
        for (WebElement eachTag : allTheTags) {
            tagNames.add(eachTag.getAttribute("innerHTML"));
        }
        return tagNames;

    }

    public void setAllTheTags(List<WebElement> allTheTags) {
        this.allTheTags = allTheTags;
    }

    public WebElement getNewButtonStatusBar() {
        return newButtonStatusBar;
    }

    public void setNewButtonStatusBar(WebElement newButtonStatusBar) {
        this.newButtonStatusBar = newButtonStatusBar;
    }

    public WebElement getTodayButtonStatusBar() {
        return todayButtonStatusBar;
    }

    public void setTodayButtonStatusBar(WebElement todayButtonStatusBar) {
        this.todayButtonStatusBar = todayButtonStatusBar;
    }

    public WebElement getThisWeekButtonStatusBar() {
        return thisWeekButtonStatusBar;
    }

    public void setThisWeekButtonStatusBar(WebElement thisWeekButtonStatusBar) {
        this.thisWeekButtonStatusBar = thisWeekButtonStatusBar;
    }

    public WebElement getLaterButtonStatusBar() {
        return laterButtonStatusBar;
    }

    public void setLaterButtonStatusBar(WebElement laterButtonStatusBar) {
        this.laterButtonStatusBar = laterButtonStatusBar;
    }

    public WebElement getNotesButtonStatusBar() {
        return notesButtonStatusBar;
    }

    public void setNotesButtonStatusBar(WebElement notesButtonStatusBar) {
        this.notesButtonStatusBar = notesButtonStatusBar;
    }

    public void typeNote(String someNotes){
        editingBox.sendKeys(someNotes);

    }

    public boolean isClickDateDisabled(String date) throws Throwable {
        boolean isDateSelected;
        BrowserUtils.waitForPageToLoad(5);
        switch (date) {
            case "New":
                newButtonStatusBar.click();
                BrowserUtils.waitFor(3);
                isDateSelected = newButtonStatusBar.getAttribute("class").contains("disabled");
                System.out.println("newButtonStatusBar = " + newButtonStatusBar.getAttribute("class"));
                break;
            case "Today":
                todayButtonStatusBar.click();
                BrowserUtils.waitForVisibility(todayButtonStatusBar,5);
                isDateSelected = todayButtonStatusBar.getAttribute("class").contains("disabled");
                break;
            case "This Week":
                thisWeekButtonStatusBar.click();
                BrowserUtils.waitForVisibility(thisWeekButtonStatusBar,5);
                isDateSelected = thisWeekButtonStatusBar.getAttribute("class").contains("disabled");
                break;
            case "Later":
                laterButtonStatusBar.click();
                BrowserUtils.waitForVisibility(laterButtonStatusBar,5);
                isDateSelected = laterButtonStatusBar.getAttribute("class").contains("disabled");
                break;

            default:
                throw (Throwable) NoSuchElementException;

        }
        return isDateSelected;
    }
}
