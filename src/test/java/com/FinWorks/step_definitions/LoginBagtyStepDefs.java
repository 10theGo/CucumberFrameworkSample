package com.FinWorks.step_definitions;
import com.FinWorks.pages.LoginPageBagty;
import com.FinWorks.utilities.BrowserUtils;
import com.FinWorks.utilities.ConfigurationReader;
import com.FinWorks.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginBagtyStepDefs {
    @Given("the User is on the Login page")
    public void the_user_is_on_the_login_page() {

        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
    }
    @When("the Sales Manager enters valid {string} and {string}")
    public void the_Sales_Manager_enters_valid_and(String username, String password) {

        new LoginPageBagty().login(username,password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(5);
        Assert.assertEquals("#Inbox - Odoo",Driver.get().getTitle());
    }

    @When("the Point of Sales Manager enters valid {string} and {string}")
    public void the_Point_of_Sales_Manager_enters_valid_and(String username, String password) {

        new LoginPageBagty().login(username,password);
    }

    @When("the Inventory Manager enters valid {string} and {string}")
    public void the_Inventory_Manager_enters_valid_and(String username, String password) {

        new LoginPageBagty().login(username,password);
    }

    @When("the Expenses Manager enters valid {string} and {string}")
    public void the_Expenses_Manager_enters_valid_and(String username, String password) {

        new LoginPageBagty().login(username,password);
    }

    @When("the Manufacturing User enters valid {string} and {string}")
    public void the_Manufacturing_User_enters_valid_and(String username, String password) {

        new LoginPageBagty().login(username,password);
    }
    @When("the Sales Manager enters invalid or empty {string} or {string}")
    public void the_Sales_Manager_enters_invalid_or_empty_or(String username, String password) {

        new LoginPageBagty().login(username,password);
    }

    @Then("the user should not be able to login")
    public void the_user_should_not_be_able_to_login() {
        BrowserUtils.waitFor(5);
        Assert.assertEquals("Login | Best solution for startups", Driver.get().getTitle());
    }

    @When("the Point of Sales Manager enters invalid or empty {string} or {string}")
    public void the_Point_of_Sales_Manager_enters_invalid_or_empty_or(String username, String password) {

        new LoginPageBagty().login(username,password);
    }

    @When("the Inventory Manager enters invalid or empty {string} or {string}")
    public void the_Inventory_Manager_enters_invalid_or_empty_or(String username, String password) {

        new LoginPageBagty().login(username,password);
    }

    @When("the Expenses Manager enters invalid or empty {string} or {string}")
    public void the_Expenses_Manager_enters_invalid_or_empty_or(String username, String password) {

        new LoginPageBagty().login(username,password);
    }

    @When("the Manufacturing User enters invalid or empty {string} or {string}")
    public void the_Manufacturing_User_enters_invalid_or_empty_or(String username, String password) {

        new LoginPageBagty().login(username,password);
    }

}
