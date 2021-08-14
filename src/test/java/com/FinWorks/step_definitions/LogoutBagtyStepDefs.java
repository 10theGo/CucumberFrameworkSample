package com.FinWorks.step_definitions;
import com.FinWorks.pages.DashboardPage;
import com.FinWorks.pages.LoginPageBagty;
import com.FinWorks.utilities.BrowserUtils;
import com.FinWorks.utilities.ConfigurationReader;
import com.FinWorks.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LogoutBagtyStepDefs {

    @Given("the Sales Manager is logged in")
    public void the_Sales_Manager_is_logged_in() {

        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
        new LoginPageBagty().login(ConfigurationReader.get("sales_manager_username"),ConfigurationReader.get("sales_manager_password"));
    }

    @When("the user clicks the logout button")
    public void the_user_clicks_the_logout_button() {
        BrowserUtils.waitForPageToLoad(3);
        new DashboardPage().logOut();
    }

    @Then("the user should be logged out")
    public void the_user_should_be_logged_out() {
        BrowserUtils.waitFor(1);
        Assert.assertEquals("Login | Best solution for startups",Driver.get().getTitle());
    }

    @Given("the Point of Sales Manager is logged in")
    public void the_Point_of_Sales_Manager_is_logged_in() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
        new LoginPageBagty().login(ConfigurationReader.get("Point_of_Sales_Manager_username"),ConfigurationReader.get("Point_of_Sales_Manager_password"));
        BrowserUtils.waitFor(5);
    }

    @Given("the Inventory Manager is logged in")
    public void the_Inventory_Manager_is_logged_in() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
        new LoginPageBagty().login(ConfigurationReader.get("Inventory_Manager_username"),ConfigurationReader.get("Inventory_Manager_password"));
        BrowserUtils.waitFor(5);
    }

    @Given("the Expenses Manager is logged in")
    public void the_Expenses_Manager_is_logged_in() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
        new LoginPageBagty().login(ConfigurationReader.get("Expenses_Manager_username"),ConfigurationReader.get("Expenses_Manager_password"));
        BrowserUtils.waitFor(5);
    }

    @Given("the Manufacturing User is logged in")
    public void the_Manufacturing_User_is_logged_in() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
        new LoginPageBagty().login(ConfigurationReader.get("Manufacturing_User_username"),ConfigurationReader.get("Manufacturing_User_password"));
        BrowserUtils.waitFor(5);
    }

}
