package com.FinWorks.step_definitions;

import com.FinWorks.utilities.ConfigurationReader;
import com.FinWorks.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs_AY {
    
    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {

        Driver.get().get(ConfigurationReader.get("url"));
            
        }

    @When("the user enters valid {string} and {string}")
    public void the_user_enters_valid_and(String string, String string2, String string3) {


    }

    @Then("the {string} should be able to login to the app")
    public void the_should_be_able_to_login_to_the_app(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}

