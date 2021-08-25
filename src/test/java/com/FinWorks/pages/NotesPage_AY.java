package com.FinWorks.pages;

import com.FinWorks.utilities.BrowserUtils;
import com.FinWorks.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotesPage_AY extends BasePage{

    DashboardPage dashboardPage = new DashboardPage();

    public NotesPage_AY() {

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//a/span[contains(text(),'Notes')]")
    private WebElement notesTab;

    @FindBy(xpath = "//button[@accesskey='c']")
    private WebElement createButton;

    public void clickingNotesTab() {

        notesTab.click();

        dashboardPage.waitUntilLoaderScreenDisappear();

    }

    public void clickingCreateButton() {

        createButton.click();

        dashboardPage.waitUntilLoaderScreenDisappear();
    }



}
