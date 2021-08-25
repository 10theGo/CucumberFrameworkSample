package com.FinWorks.step_definitions;

import com.FinWorks.pages.NavBarPage_Burhan;
import com.FinWorks.pages.NotesPage_Burhan;
import com.FinWorks.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class NotesStepDefs_Burhan {

    NotesPage_Burhan notesPage = new NotesPage_Burhan();

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

    @When("The user selects {string} tag_brhn")
    public void the_user_selects_tag_brhn(String tagName) {
        notesPage.clickOnTagsDD();
        notesPage.waitUntilLoaderScreenDisappear();
        notesPage.clickOnTag(tagName);
        notesPage.waitUntilLoaderScreenDisappear();
    }

    @Then("{string} tag should be selected_brhn")
    public void tag_should_be_selected_brhn(String expectedTagName) {
        List<String> actualTagsNameList = notesPage.getTagNamesList();
        boolean isTagDisplayed = actualTagsNameList.contains(expectedTagName);
        Assert.assertTrue("verify that expected tag name is in the tags list", isTagDisplayed);
    }


}
