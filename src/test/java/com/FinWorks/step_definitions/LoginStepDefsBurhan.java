package com.FinWorks.step_definitions;

import com.FinWorks.pages.DiscussPageBurhan;
import com.FinWorks.pages.LoginPageBurhan;
import com.FinWorks.utilities.BrowserUtils;
import com.FinWorks.utilities.ConfigurationReader;
import com.FinWorks.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefsBurhan {
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user logs in as {string}")
    public void the_user_logs_in_as(String userType) throws Exception {
        String username;
        String password;
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

        LoginPageBurhan loginPageBurhan = new LoginPageBurhan();
        loginPageBurhan.email.sendKeys(username);
        loginPageBurhan.password.sendKeys(password);
        loginPageBurhan.loginButton.click();
    }


    @Then("The user should be on the {string} page")
    public void the_user_should_be_on_the_page(String page) {
        BrowserUtils.waitForVisibility(new DiscussPageBurhan().inboxTab, 5);
        Assert.assertTrue("Verify that \tActual page title: " + Driver.get().getTitle() + " contains \tExpected page title = " + page, Driver.get().getTitle().contains(page));
    }


}
