package com.FinWorks.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_funtionalityStepDefs {
    @When("user enters valid {string} and {string}")
    public void userEntersValidAnd(String arg0, String arg1) {
    }

    @Then("user enters to {string} page")
    public void userEntersToPage(String arg0) {
    }

    @When("user enters invalid username {string} or password {string}")
    public void userEntersInvalidUsernameOrPassword(String arg0, String arg1) {
    }

    @Then("user sees a {string} error message")
    public void userSeesAErrorMessage(String arg0) {
    }

    @When("any login input box is empty {string} {string}")
    public void anyLoginInputBoxIsEmpty(String arg0, String arg1) {
    }

    @Then("user sees a login error message")
    public void userSeesALoginErrorMessage() {
    }
}
