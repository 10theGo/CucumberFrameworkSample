package com.FinWorks.pages;

import com.FinWorks.utilities.BrowserUtils;
import com.FinWorks.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class NotesPage_Burhan extends BasePage {
    @FindBy(xpath = "//button[contains(text(),'Create')]")
    private WebElement createNoteButton;

    @FindBy(css = ".o_form_sheet")
    private WebElement noteEditingBox;

    @FindBy(css = ".o_input_dropdown")
    private WebElement tagsDropdown;

    @FindBy(xpath = "//span[contains(@class,'badge dropdown')]")
    private List<WebElement> tagsList;

    @FindBy(name = "name")
    private WebElement createTagNameBox;

    @FindBy(xpath = "//span[.='Save']/..")
    private WebElement createTagSaveButton;

    @FindBy(css = ".note-editable.panel-body")
    private WebElement noteEditablePanelBody;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    private WebElement NoteSaveButton;

    @FindBy(className = "o_form_sheet")
    private WebElement savedNoteSheet;

    @FindBy(xpath = "//button[@title='Log or schedule an activity']")
    private WebElement scheduleActivity;


    public void clickOnCreateNoteButton() {
        createNoteButton.click();
        BrowserUtils.waitForVisibility(noteEditingBox, 3);
    }

    public boolean isNoteBoxDisplayed() {
        return noteEditingBox.isDisplayed();
    }

    public void clickOnTagsDD() {
        tagsDropdown.click();
    }

    public void clickOnTag(String tagName) {
        String dynamicTagXpath = "//li[contains(@class,'ui-menu-item')][.='" + tagName + "']";
        WebElement tag = Driver.get().findElement(By.xpath(dynamicTagXpath));
        tag.click();
    }

    public List<String> getTagNamesList() {
        List<String> tagNamesList = new ArrayList<>();
        for (WebElement eachTag : tagsList) {
            tagNamesList.add(eachTag.getText());
        }
        return tagNamesList;
    }

    public void writeTagNameForCreateTag(String tagName) {
        createTagNameBox.sendKeys(tagName);
    }

    public void clickOnCreateTag_Save() {
        createTagSaveButton.click();
    }

    public void writeSomeNotesOnPanel(String someNotes) {
        noteEditablePanelBody.sendKeys(someNotes);
    }

    public String getNoteText() {
        return noteEditablePanelBody.getText();
    }


    public void selectDateType(String dateType) {
        WebElement dateTypeButton = Driver.get().findElement(By.xpath("//button[contains(text(),'" + dateType + "')][contains(@class,'o_arrow_button')]"));
        dateTypeButton.click();
    }

    public boolean isDateTypeDisabled(String dateType) {
        WebElement dateTypeButton = Driver.get().findElement(By.xpath("//button[contains(text(),'" + dateType + "')][contains(@class,'o_arrow_button')]"));
        String disabledValue = dateTypeButton.getAttribute("disabled");
        System.out.println("disabledValue = " + disabledValue);
        return disabledValue.equals("true");
    }

    public void clickOnSaveNote() {
        NoteSaveButton.click();
    }

    public boolean isNotePageDisplayed() {
        return savedNoteSheet.isDisplayed();
    }

    public void waitUntilScheduleActivityAppears() {
        try {
            BrowserUtils.waitForVisibility(scheduleActivity, 3);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

}
