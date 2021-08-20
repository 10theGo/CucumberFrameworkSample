package com.FinWorks.step_definitions;

import com.FinWorks.pages.LoginPage_Onurcan;
import com.FinWorks.pages.LoginPage_Shiva;
import com.FinWorks.pages.LogoutPage_Shiva;
import com.FinWorks.utilities.BrowserUtils;
import com.FinWorks.utilities.ConfigurationReader;
import com.FinWorks.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutStepDefs_Shiva {


    LoginPage_Shiva loginPage_shiva = new LoginPage_Shiva();
    LogoutPage_Shiva logoutPage_shiva = new LogoutPage_Shiva();

    @Given("the user enters the valid information {string} {string}")
    public void the_user_enters_the_valid_information(String username, String password) {
        Driver.get().get(ConfigurationReader.get("url"));
        loginPage_shiva.login(username,password);

    }

    @And("the user clicks on avatar or name")
    public void the_user_clicks_on_avatar_or_name() {
        logoutPage_shiva.getNameOfUser().click();

    }



    @When("user clicks on Logout button")
    public void user_clicks_on_Logout_button() {
        BrowserUtils.waitFor(5);
        logoutPage_shiva.getLogOut().click();

    }

    @Then("the User is on the Login page")
    public void the_User_is_on_the_Login_page() {
        BrowserUtils.waitForPageToLoad(5);
        String actualTitle = Driver.get().getTitle();
        System.out.println(actualTitle);
        BrowserUtils.waitFor(5);

        Assert.assertEquals("Login | Best solution for startups", actualTitle);

    }





}
