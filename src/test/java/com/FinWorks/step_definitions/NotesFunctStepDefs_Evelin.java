package com.FinWorks.step_definitions;

import com.FinWorks.pages.LoginPageEvelin;
import com.FinWorks.pages.NotesFunctPage_Evelin;
import com.FinWorks.utilities.BrowserUtils;
import com.FinWorks.utilities.Driver;
import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;


public class NotesFunctStepDefs_Evelin {

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
        String actualCreateBtnText= new NotesFunctPage_Evelin().getCreateBtn().getText();
        Assert.assertEquals(expectedCreateBtnText,actualCreateBtnText);
    }


    @When("user_Evelin clicks on Create module")
    public void user_evelinClicksOnCreateModule() {
        new NotesFunctPage_Evelin().getCreateBtn().click();
    }

    @Then("user_Evelin navigates to Note {string} page")
    public void user_evelinNavigatesToNotePage(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("user_Evelin clicks on Tags box")
    public void user_evelinClicksOnTagsBox() {
        new NotesFunctPage_Evelin().getTagsBox().click();
    }

    @And("user_Evelin clicks on color option")
    public void user_evelinClicksOnColorOption() {
        new NotesFunctPage_Evelin().getColorOption().click();
        BrowserUtils.waitFor(2);
    }

    @Then("color tag is displayed in Tags box")
    public void colorTagIsDisplayedInTagsBox() {
        WebElement colorTagsBox = new NotesFunctPage_Evelin().getColorTagsBox();
        Assert.assertTrue(colorTagsBox.isDisplayed());
    }
    @When("user_Evelin clicks on color displayed in tag box")
    public void user_evelinClicksOnColorDisplayedIcTagBox() {
        new NotesFunctPage_Evelin().getColorTagsBox().click();

    }
    @Then("user_Evelin can select a color available")
    public void user_evelinCanSelectAColorAvailable() {
        WebElement element = new NotesFunctPage_Evelin().coloursSelected();
        Assert.assertTrue(element.isDisplayed() );

        //GETTING FROM @FINDBY DOES NOT WORK
//        WebElement coloursAvailables = new NotesFunctPage_Evelin().getColoursAvailables();
//        Assert.assertTrue(coloursAvailables.isDisplayed());


    }


    @And("user_Evelin clicks on panel editor module")
    public void user_evelinClicksOnPanelEditorModule() {
        new NotesFunctPage_Evelin().getPanelEditor().click();
    }

    @When("user_Evelin write some text")
    public void user_evelinWriteSomeText() {
        new NotesFunctPage_Evelin().editedText();
    }

    @Then("{string} is displayed on screen")
    public void textIsDisplayedOnScreen(String expectedText) {
        String actualText = new NotesFunctPage_Evelin().getTextEdited().getText();
        Assert.assertEquals(expectedText,actualText);
    }

    @When("user_Evelin clicks on Style button")
    public void user_evelinClicksOnStyleButton() {
        new NotesFunctPage_Evelin().getStyleBtb().click();
    }

    @And("user_Evelin can select a typing style available")
    public void user_evelinCanSelectATypingStyleAvailable() {
       new NotesFunctPage_Evelin().getTypingStyle();
    }

    @Then("user_Evelin can change typing style text")
    public void user_evelinCanChangeTypingStyleText(List<String> expectedText) {
        List<String> actualText = new NotesFunctPage_Evelin().getTypingStyleText();
        Assert.assertEquals(expectedText,actualText);
    }
}
