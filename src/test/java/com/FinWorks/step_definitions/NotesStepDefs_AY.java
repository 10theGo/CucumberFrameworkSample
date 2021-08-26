package com.FinWorks.step_definitions;

import com.FinWorks.pages.DashboardPage;
import com.FinWorks.pages.LoginPage_AY;
import com.FinWorks.pages.NotesPage_AY;
import com.FinWorks.utilities.ConfigurationReader;
import com.FinWorks.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NotesStepDefs_AY {

    NotesPage_AY notesPage_ay = new NotesPage_AY();

    DashboardPage dashboardPage = new DashboardPage();

    LoginPage_AY loginPage_ay = new LoginPage_AY();

    String username = ConfigurationReader.get("sales_manager_username");

    String password = ConfigurationReader.get("sales_manager_password");

    @Given("the user is already logged in to the app")
    public void the_user_is_already_logged_in_to_the_app() {

        Driver.get().get(ConfigurationReader.get("url"));

        loginPage_ay.login(username,password);
    }

    @When("the user clicks on the Notes tab")
    public void the_user_clicks_on_the_Notes_tab() {

        notesPage_ay.clickingNotesTab();

        dashboardPage.waitUntilLoaderScreenDisappear();

    }

    @When("the Create button on the Notes page")
    public void the_Create_button_on_the_Notes_page() {

        notesPage_ay.clickingCreateButton();

        dashboardPage.waitUntilLoaderScreenDisappear();
    }

    @Then("the user should land on Notes\\/New page")
    public void the_user_should_land_on_Notes_New_page() {

        Assert.assertEquals("New - Odoo", Driver.get().getTitle());

    }





}
