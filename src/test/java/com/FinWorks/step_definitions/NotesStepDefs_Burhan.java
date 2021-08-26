package com.FinWorks.step_definitions;

import com.FinWorks.pages.NavBarPage_Burhan;
import com.FinWorks.pages.NotesPage_Burhan;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class NotesStepDefs_Burhan {

    NotesPage_Burhan notesPage = new NotesPage_Burhan();
    private final String tagName = new Faker().color().name();
    private final String someNotes = new Faker().shakespeare().romeoAndJulietQuote();

    @Given("The user navigates to {string} tab_brhn")
    public void the_user_navigates_to_tab_brhn(String tabName) {
        new NavBarPage_Burhan().clickOnNavBarTab(tabName);
    }

    @Given("The user clicks on Create button_brhn")
    public void the_user_clicks_on_Create_button_brhn() {
        notesPage.clickOnCreateNoteButton();
    }

    @Then("Note Editing Box should be appear_brhn")
    public void note_Editing_Box_should_be_appear_brhn() {
        Assert.assertTrue("verify that note editing box appeared", notesPage.isNoteBoxDisplayed());
    }

    @When("The user clicks on Tags Dropdown_brhn")
    public void the_user_clicks_on_Tags_Dropdown_brhn() {
        notesPage.clickOnTagsDD();
        notesPage.waitUntilLoaderScreenDisappear();
    }

    @When("The user selects {string} tag_brhn")
    public void the_user_selects_tag_brhn(String tagName) {
        notesPage.clickOnTag(tagName);
        notesPage.waitUntilLoaderScreenDisappear();
    }

    @Then("{string} tag should be selected_brhn")
    public void tag_should_be_selected_brhn(String expectedTagName) {
        List<String> actualTagsNameList = notesPage.getTagNamesList();
        boolean isTagDisplayed = actualTagsNameList.contains(expectedTagName);
        Assert.assertTrue("verify that expected tag name is in the tags list", isTagDisplayed);
    }

    @When("The user writes a tag name and saves_brhn")
    public void the_user_writes_a_tag_name_and_saves_brhn() {
        System.out.println("tagName = " + tagName);
        notesPage.writeTagNameForCreateTag(tagName);
        notesPage.clickOnCreateTag_Save();
        notesPage.waitUntilLoaderScreenDisappear();
    }

    @Then("Tag name should be selected_brhn")
    public void tag_name_should_be_selected_brhn() {
        tag_should_be_selected_brhn(tagName);
    }

    @When("The user types some notes on Note Panel Body_brhn")
    public void the_user_types_some_notes_on_Note_Panel_Body_brhn() {
        notesPage.writeSomeNotesOnPanel(someNotes);
        System.out.println("someNotes = " + someNotes);
    }

    @Then("Typed notes should be on the panel body_brhn")
    public void typed_notes_should_be_on_the_panel_body_brhn() {
        String actualText = notesPage.getNoteText();
        String expectedText = someNotes;
        Assert.assertEquals(expectedText, actualText);
    }

    @When("The User selects {string} as date type_brhn")
    public void the_User_selects_as_date_type_brhn(String dateType) {
        notesPage.selectDateType(dateType);
        notesPage.waitUntilLoaderScreenDisappear();
    }

    @Then("{string} should be selected_brhn")
    public void should_be_selected_brhn(String dateType) {
        boolean isDisabled = notesPage.isDateTypeDisabled(dateType);
        Assert.assertTrue(isDisabled);
    }

    @When("The user saves the note_brhn")
    public void the_user_saves_the_note_brhn() {
        notesPage.clickOnSaveNote();
        notesPage.waitUntilScheduleActivityAppears();
    }

    @Then("The note should be saved_brhn")
    public void the_note_should_be_saved_brhn() {
        Assert.assertTrue(notesPage.isNotePageDisplayed());
    }


}
