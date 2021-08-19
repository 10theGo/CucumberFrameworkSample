package com.FinWorks.step_definitions;

import com.FinWorks.pages.DiscussPageBurhan;
import com.FinWorks.pages.LoginPage_Burhan;
import com.FinWorks.utilities.BrowserUtils;
import com.FinWorks.utilities.ConfigurationReader;
import com.FinWorks.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs_Burhan {

    LoginPage_Burhan loginPageBurhan = new LoginPage_Burhan();
    String username;
    String password;

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user logs in as {string}")
    public void the_user_logs_in_as(String userType) throws Exception {

        switch (userType) {
            case "salesmanager":
                username = ConfigurationReader.get("sales_manager_username");
                password = ConfigurationReader.get("sales_manager_password");
                break;
            case "posmanager":
                username = ConfigurationReader.get("Point_of_Sales_Manager_username");
                password = ConfigurationReader.get("Point_of_Sales_Manager_password");
                break;
            case "inventorymanager":
                username = ConfigurationReader.get("Inventory_Manager_username");
                password = ConfigurationReader.get("Inventory_Manager_password");
                break;
            case "expensesmanager":
                username = ConfigurationReader.get("Expenses_Manager_username");
                password = ConfigurationReader.get("Expenses_Manager_password");
                break;
            case "manufuser":
                username = ConfigurationReader.get("Manufacturing_User_username");
                password = ConfigurationReader.get("Manufacturing_User_password");
                break;
            default:
                throw new Exception("Wrong usertype!!!");
        }

        loginPageBurhan.loginWith(username, password);
    }


    @Then("The user should be on the Inbox page")
    public void the_user_should_be_on_the_Inbox_page() {
        BrowserUtils.waitForVisibility(new DiscussPageBurhan().inboxTab, 5);
        Assert.assertTrue("Verify that \tActual page title: " + Driver.get().getTitle() + " contains Inbox", Driver.get().getTitle().contains("Inbox"));
    }

    @When("The user enters {string} username and {string} password")
    public void the_user_enters_username_and_password(String username, String password) {
        Faker faker = new Faker();
        switch (username) {
            case "valid":
                this.username = ConfigurationReader.get("sales_manager_username");
                break;
            case "invalid":
                this.username = faker.internet().emailAddress();
                break;
            case "empty":
                this.username = "";
                break;
        }

        switch (password) {
            case "valid":
                this.password = ConfigurationReader.get("sales_manager_password");
                break;
            case "invalid":
                this.password = faker.internet().password(true);
                break;
            case "empty":
                this.password = "";
                break;
        }
        loginPageBurhan.loginWith(this.username, this.password);

    }

    @Then("Wrong login-password message should be displayed")
    public void wrong_login_password_message_should_be_displayed() {
        Assert.assertEquals("verify that wrong login-password message is displayed", "Wrong login/password", loginPageBurhan.wrongCredentialsMessage.getText().trim());
    }

    @Then("The user should be on the Login page")
    public void the_user_should_be_on_the_Login_page() {
        BrowserUtils.waitForVisibility(loginPageBurhan.wrongCredentialsMessage, 5);
        Assert.assertTrue("Verify that \tActual page title: " + Driver.get().getTitle() + " -contains-> Login", Driver.get().getTitle().contains("Login"));
    }

    @Then("Please fill out this field message should be displayed for {string} or {string}")
    public void please_fill_out_this_field_message_should_be_displayed_for_or(String username, String password) {
        String expectedMessage = "Please fill out this field.";
        if (username.equals("empty")){
            Assert.assertEquals(expectedMessage, loginPageBurhan.email.getAttribute("validationMessage"));
        }

        if (password.equals("empty")){
            Assert.assertEquals(expectedMessage, loginPageBurhan.password.getAttribute("validationMessage"));
        }
    }

}
