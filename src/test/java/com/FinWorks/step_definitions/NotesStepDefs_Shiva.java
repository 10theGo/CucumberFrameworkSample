package com.FinWorks.step_definitions;

import com.FinWorks.pages.LoginPage;
import com.FinWorks.pages.NotesPage_Shiva;
import com.FinWorks.utilities.BrowserUtils;
import com.FinWorks.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class NotesStepDefs_Shiva {

    NotesPage_Shiva notesPage_shiva = new NotesPage_Shiva();
    String CreateTagName = "Test Tag";


    @When("the User should be able to Login with {string} and {string} _shiva")
    public void the_User_should_be_able_to_Login_with_and_shiva(String username, String password) {
        new LoginPage().login(username, password);


    }

    @Given("the user click Notes module_shiva")
    public void the_user_click_Notes_moudle_shiva() {
        notesPage_shiva.clickNotesButton();
    }

    @Given("the user should click Create button_shiva")
    public void the_user_should_click_Create_button_shiva() {
        BrowserUtils.waitFor(5);
        notesPage_shiva.clickCreatButton();
    }

    @Then("User able to see {string} on Title_shiva")
    public void user_able_to_see_on_Title_shiva(String Tiltle) {
        BrowserUtils.waitForPageToLoad(10);
        String ActualTiltle = Driver.get().getTitle();
        Assert.assertEquals("New - Odoo",ActualTiltle);


    }

    @When("the user clicks tags_shiva")
    public void the_user_clicks_tags_shiva() {
        BrowserUtils.waitForPageToLoad(10);
        notesPage_shiva.ClickTagsMenu();
    }

    @Then("the user can create tag_shiva")
    public void the_user_can_create_tag_shiva() {
        notesPage_shiva.CreatAndEditTag(CreateTagName);


    }

    @Then("the user can select tag_shiva")
    public void the_user_can_select_any_tag_shiva() {
        List<String> allTags = notesPage_shiva.getAllTags();
        String actualText = allTags.toString();
        Assert.assertTrue("my added tag is there?",actualText.contains(CreateTagName));

    }

    @Then("the user type any note_shiva")
    public void the_user_type_any_note_shiva() {
        notesPage_shiva.clickNotBox("Hello Guys Its a test Message");

    }

    @Then("the user can save_shiva")
    public void the_user_can_save_shiva() {
       notesPage_shiva.ClickSaveButton();
    }


}
