package com.FinWorks.step_definitions;

import com.FinWorks.pages.InboxPage_Onurcan;
import com.FinWorks.pages.LoginPage_Onurcan;
import com.FinWorks.utilities.BrowserUtils;
import com.FinWorks.utilities.ConfigurationReader;
import com.FinWorks.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutStepDefs_Onurcan {
LoginPage_Onurcan loginPage_onurcan = new LoginPage_Onurcan();
InboxPage_Onurcan inboxPage_onurcan= new InboxPage_Onurcan();

    @Given("the user should be logged in with valid {string} and {string}")
    public void theShouldBeLoggedInWithValidAnd(String username, String password) {
        Driver.get().get(ConfigurationReader.get("url"));
        loginPage_onurcan.login(username, password);
        
    }

    @When("the User clicks topBar menu")
    public void the_clicks_logout_button() {
        BrowserUtils.waitForPageToLoad(5);
        inboxPage_onurcan.getTopbarButton().click();

      
    }

    @And("the User clicks Logout button")
    public void theUserClicksLogoutButton() {
        BrowserUtils.waitFor(5);
        inboxPage_onurcan.getLogoutButton().click();
    }

    @Then("the User should be logged out")
    public void the_should_be_logged_out() {
     BrowserUtils.waitForPageToLoad(5);

        System.out.println("Driver.get().getTitle() = " + Driver.get().getTitle());
        Assert.assertEquals("Login | Best solution for startups",Driver.get().getTitle());
    }



}
