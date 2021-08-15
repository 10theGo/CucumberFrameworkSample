package com.FinWorks.step_definitions;

import com.FinWorks.pages.LoginPageBagty;
import com.FinWorks.pages.LoginPage_Onurcan;
import com.FinWorks.utilities.BrowserUtils;
import com.FinWorks.utilities.ConfigurationReader;
import com.FinWorks.utilities.Driver;
import com.sun.xml.internal.ws.policy.AssertionSet;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs_Onurcan {
    @Given("the user should be on the login page")
    public void the_user_should_be_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("the user enter valid {string} and {string}")
    public void the_enter_valid_and(String username, String password) {
        new LoginPage_Onurcan().login(username, password);

    }

    @Then("the user should be able to log in")
    public void the_user_should_be_able_to_log_in() {
        BrowserUtils.waitFor(5);
        Assert.assertEquals("#Inbox - Odoo", Driver.get().getTitle());
    }

    @When("the user enters invalid  {string} or {string}")
    public void the_user_enters_invalid_or(String username, String password) {
        new LoginPage_Onurcan().login(username, password);
    }

    @Then("the user should not be able to log in")
    public void the_user_should_not_be_able_to_log_in() {
        BrowserUtils.waitFor(5);
        LoginPage_Onurcan loginPage_onurcan = new LoginPage_Onurcan();
        Assert.assertEquals("Wrong login/password", loginPage_onurcan.errorMessage.getText());
    }

    @When("the user enters empty {string} or {string}")
    public void the_user_enters_empty_or(String username, String password) {
        new LoginPage_Onurcan().login(username, password);


    }

    @Then("the user should not be able to login and see {string} message")
    public void the_user_should_not_be_able_to_login_and_see_message(String expectedMessage) {
        LoginPage_Onurcan loginPage_onurcan = new LoginPage_Onurcan();
        String actualMessage="";
        //getting message from either boxes
        if(loginPage_onurcan.loginBox.getAttribute("validationMessage").equals("")){
             actualMessage = loginPage_onurcan.passwordBox.getAttribute("validationMessage");
        }else {
            actualMessage = loginPage_onurcan.loginBox.getAttribute("validationMessage");
        }

        Assert.assertEquals(expectedMessage,actualMessage);
    }


}
