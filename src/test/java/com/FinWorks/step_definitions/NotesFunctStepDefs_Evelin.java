package com.FinWorks.step_definitions;

import com.FinWorks.pages.LoginPageEvelin;
import com.FinWorks.pages.NotesFunctPage_Evelin;
import com.FinWorks.utilities.BrowserUtils;
import com.FinWorks.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;


public class NotesFunctStepDefs_Evelin {

    NotesFunctPage_Evelin notesPageMethod = new NotesFunctPage_Evelin();

    @When("user_Evelin clicks on Notes module")
    public void user_evelinClicksOnModule() {
        new LoginPageEvelin().getNotesBtn().click();
    }

    @And("user_Evelin navigates to {string} page")
    public void user_evelinNavigatesToStringPage(String exectedTitle) {
        String actualTitle =  new LoginPageEvelin().dynamicSubtitleWebElement(exectedTitle).getText();
        Assert.assertEquals(exectedTitle,actualTitle);
    }

    @Then("user_Evelin sees {string} button under Notes subtitle")
    public void users_evelinSeesButtonUnderNotesSubtitle(String expectedCreateBtnText) {
        String actualCreateBtnText= notesPageMethod.getCreateBtn().getText();
        Assert.assertEquals(expectedCreateBtnText,actualCreateBtnText);
    }

    @When("user_Evelin clicks on Create module")
    public void user_evelinClicksOnCreateModule() {
      notesPageMethod.getCreateBtn().click();
    }

    @Then("user_Evelin navigates to Note {string} page")
    public void user_evelinNavigatesToNotePage(String expectedTitle) {
        String actualTitle = new LoginPageEvelin().dynamicSubtitleWebElement(expectedTitle).getText();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("user_Evelin clicks on Tags box")
    public void user_evelinClicksOnTagsBox() {
        notesPageMethod.getTagsBox().click();
    }

    @And("user_Evelin clicks on color option")
    public void user_evelinClicksOnColorOption() {
        notesPageMethod.getColorOption().click();
        BrowserUtils.waitFor(2);
    }

    @Then("color tag is displayed in Tags box")
    public void colorTagIsDisplayedInTagsBox() {
        WebElement colorTagsBox = notesPageMethod.getColorTagsBox();
        Assert.assertTrue(colorTagsBox.isDisplayed());
    }

    @When("user_Evelin clicks on color displayed in tag box")
    public void user_evelinClicksOnColorDisplayedIcTagBox() {
       notesPageMethod.getColorTagsBox().click();
    }

    @Then("user_Evelin can select a color available")
    public void user_evelinCanSelectAColorAvailable() {
        WebElement element = notesPageMethod.coloursSelected();
        Assert.assertTrue(element.isDisplayed() );

        //HERE IS THE PROOF: GETTING FROM @FINDBY DOES NOT WORK
//        WebElement coloursAvailables = new NotesFunctPage_Evelin().getColoursAvailables();
//        Assert.assertTrue(coloursAvailables.isDisplayed());
    }

    @And("user_Evelin clicks on panel editor module")
    public void user_evelinClicksOnPanelEditorModule() {
       notesPageMethod.getPanelEditor().click();
    }

    @When("user_Evelin write some text")
    public void user_evelinWriteSomeText() {
       notesPageMethod.editedText();
    }

    @Then("{string} is displayed on screen")
    public void textIsDisplayedOnScreen(String expectedText) {
        String actualText = notesPageMethod.getTextEdited().getText();
        Assert.assertEquals(expectedText,actualText);
    }

    @When("user_Evelin clicks on Style button")
    public void user_evelinClicksOnStyleButton() {
        notesPageMethod.getStyleBtb().click();
    }

    @And("user_Evelin can select a typing style available")
    public void user_evelinCanSelectATypingStyleAvailable() {
       notesPageMethod.getTypingStyle();
    }

    @Then("user_Evelin can change typing style text")
    public void user_evelinCanChangeTypingStyleText(List<String> expectedText) {
        List<String> actualText = notesPageMethod.getTypingStyleText();
        Assert.assertEquals(expectedText,actualText);
    }

    @Then("user_Evelin clicks on data-type tabs")
    public void user_evelinClicksOnDataTypeTabs() {
        notesPageMethod.getTabsData_Type();
    }

    @And("user_Evelin clicks on Save button")
    public void user_evelinClicksOnSaveButton() {
        notesPageMethod.getSaveBtn().click();
    }

    @Then("user_Evelin can see the saved note display ont the page")
    public void user_evelinCanSeeTheSavedNoteDisplayOntThePage() {
        WebElement textEdited = notesPageMethod.getTextEdited();
        Assert.assertTrue(textEdited.isDisplayed());
        BrowserUtils.waitFor(2);
    }

    @And("the first line wrote: {string} as Subtitle")
    public void theFirstLineWroteAsSubtitle(String expectedText) {
        String actualText = notesPageMethod.getSavedTitleNote().getText();
        Assert.assertEquals(expectedText,actualText);
    }
}
