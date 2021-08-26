package com.FinWorks.pages;

import com.FinWorks.utilities.BrowserUtils;
import com.FinWorks.utilities.Driver;
import org.openqa.selenium.By;
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
}
