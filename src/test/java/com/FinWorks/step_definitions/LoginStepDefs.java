package com.FinWorks.step_definitions;

import com.FinWorks.pages.LoginPage;
import com.FinWorks.utilities.BrowserUtils;
import com.FinWorks.utilities.ConfigurationReader;
import com.FinWorks.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.SplittableRandom;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        //WebDriver driver = Driver.get();
        Driver.get().get(url);
    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {
        String username = ConfigurationReader.get("sales_manager_username");
        String password = ConfigurationReader.get("sales_manager_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @Then("the user should be able to Login")
    public void the_user_should_be_able_to_Login() {
        BrowserUtils.waitFor(5);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("#Inbox - Odoo", actualTitle);
    }



}
