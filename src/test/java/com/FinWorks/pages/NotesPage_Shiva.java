package com.FinWorks.pages;

import com.FinWorks.utilities.BrowserUtils;
import com.sun.org.apache.xpath.internal.XPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class NotesPage_Shiva {

    @FindBy(xpath = "//li[text()='Notes']")
    private WebElement NotesButton;

    @FindBy(xpath = "//button[normalize-space()='Create']")
    private WebElement CreateButton;

    @FindBy(xpath = "//div[@class='note-editable panel-body']")
    private WebElement NoteBox;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    private WebElement SaveButton;

    @FindBy(xpath = "//input[@id='o_field_input_1019']")
    private WebElement Tags;

    @FindBy(xpath = "//a[normalize-space()='Create and Edit...']")
    private WebElement createTags;

    @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input']")
    private WebElement tagsInputBox;

    @FindBy(xpath = "//li[@class='o_m2o_dropdown_option ui-menu-item']")
    private WebElement createTagInsideDD;


    @FindBy(xpath = "//li[@class='ui-menu-item']")
    public List<WebElement> allTags;

    public NotesPage_Shiva() {
    }

    public void clickNotesButton() {
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.waitForVisibility(CreateButton, 6);

        NotesButton.click();
    }

    public void clickCreatButton() {
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.waitForVisibility(CreateButton, 5);
        CreateButton.click();
    }

    public void clickNotBox(String note) {
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.waitForVisibility(NoteBox, 5);
        NoteBox.click();
        NoteBox.sendKeys(note);

    }
    public void ClickSaveButton() {
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.waitForVisibility(SaveButton, 5);
        SaveButton.click();

    }
    public void ClickTagsMenu() {
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.waitForVisibility(Tags, 5);
        Tags.click();

    }

    public void CreatAndEditTag(String string){
        BrowserUtils.waitForPageToLoad(10);
        createTags.click();
        tagsInputBox.sendKeys(string);
        createTagInsideDD.click();

    }


    public List<String> getAllTags() {
        List<String> tagNames = new ArrayList<>();
        for (WebElement eachTag : allTags) {
            tagNames.add(eachTag.getAttribute("innerHTML"));
        }
        return tagNames;
    }



}