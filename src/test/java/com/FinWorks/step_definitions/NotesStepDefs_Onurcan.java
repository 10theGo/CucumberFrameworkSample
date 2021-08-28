package com.FinWorks.step_definitions;

import com.FinWorks.pages.LoginPage_Onurcan;
import com.FinWorks.pages.NotesPage_Onurcan;
import com.FinWorks.utilities.BrowserUtils;
import com.FinWorks.utilities.ConfigurationReader;
import com.FinWorks.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import com.github.javafaker.Faker;


import java.util.List;

public class NotesStepDefs_Onurcan {

    LoginPage_Onurcan loginPage_onurcan = new LoginPage_Onurcan();
    NotesPage_Onurcan notesPage_onurcan = new NotesPage_Onurcan();
    String expectedTagStringMessage = "Test Tag";
    Faker faker = new Faker();
    String fakeMessage = faker.lordOfTheRings().character();


    @Given("the user_onurcan should be logged in with valid credentials")
    public void the_user_onurcan_should_be_logged_in_with_valid_and() {
        Driver.get().get(ConfigurationReader.get("url"));
        loginPage_onurcan.login(ConfigurationReader.get("sales_manager_username"), ConfigurationReader.get("sales_manager_password"));

    }

    @And("the user_onurcan click Notes tab")
    public void theUser_onurcanClickNotesTab() {
        notesPage_onurcan.clickNotesButton();
    }

    @And("the user_onurcan should click Create button")
    public void theUser_onurcanShouldClickCreateButton() {
        notesPage_onurcan.clickCreateButton();

    }

    @Then("the user_onurcan should see the note editing box")
    public void the_user_onurcan_should_see_the_note_editing_box() {
        BrowserUtils.waitForPageToLoad(10);
        Assert.assertTrue("Verify the note panel is displayed", notesPage_onurcan.getEditingBox().isDisplayed());
    }


    @When("the user_onurcan clicks tags")
    public void theUser_onurcanClicksTags() {
        BrowserUtils.waitForPageToLoad(10);
        notesPage_onurcan.clickTagDropDownButton();
    }

    @Then("the user_onurcan can create tag")
    public void theUser_onurcanCanCreateTag() {
        BrowserUtils.waitForPageToLoad(10);
        notesPage_onurcan.createTag(expectedTagStringMessage);

    }

    @And("the user_onurcan can select tag")
    public void theUser_onurcanCanSelectTag() {
        List<String> allTags = notesPage_onurcan.getAllTheTags();
        String actualText = allTags.toString();
        Assert.assertTrue("Verify new tag is inside the all tags", actualText.contains(expectedTagStringMessage));

    }

    @Then("the user_onurcan type any note.")
    public void theUser_onurcanTypeAnyNote() {
        notesPage_onurcan.typeNote(fakeMessage);
        String noteInsideTheEditableBox = notesPage_onurcan.getEditingBox().getAttribute("textContent");
        BrowserUtils.waitForPageToLoad(4);

        Assert.assertTrue("verify that input text is held in the box", noteInsideTheEditableBox.contains(fakeMessage));

    }

    @When("the user_onurcan clicks {string}")
    public void theUser_onurcanClicks(String date) {
        notesPage_onurcan.selectSchedule(date);
        notesPage_onurcan.waitUntilLoaderScreenDisappear();

    }

    @Then("the {string} should be selected")
    public void theUser_onurcanSelect(String dateType) {
        notesPage_onurcan.waitUntilLoaderScreenDisappear();
        boolean isDisabled = notesPage_onurcan.isDateTypeDisabled(dateType);
        Assert.assertTrue(isDisabled);
    }

    @Then("the user_onurcan can save")
    public void theUser_onurcanCanSave() {
        notesPage_onurcan.clickSaveButton();
        notesPage_onurcan.waitUntilLoaderScreenDisappear();
        String savedText = notesPage_onurcan.getSavedText().getAttribute("textContent");
        System.out.println("savedText = " + savedText);

    }



}

