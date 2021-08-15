package com.FinWorks.step_definitions;

import com.FinWorks.pages.LoginPage_Shiva;
import com.FinWorks.utilities.BrowserUtils;
import com.FinWorks.utilities.ConfigurationReader;
import com.FinWorks.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs_Shiva {


    @When("the user enters the valid information {string} {string}")
    public void the_user_enters_the_valid_information(String username, String password) {
        new LoginPage_Shiva().login(username, password);

    }

    @When("the user enters the invalid information {string} or {string}")
    public void theUserEntersTheInvalidInformationOr(String username, String password) {
        new LoginPage_Shiva().login(username, password);

    }

    @Then("the user should not be able to Login")
    public void theUserShouldNotBeAbleToLogin() {
        BrowserUtils.waitFor(4);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Login | Best solution for startups", actualTitle);
    }


}






