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

    @When("user enters valid {string} and {string}")
    public void userEntersValidAnd(String validUsername, String validPassword) {
        new LoginPage().login(validUsername,validPassword);

    }

    @Then("user enters to {string} page")
    public void userEntersToPage(String expectedTitle) {
        String actualTitle = new LoginPage().getPageSubtitleText(expectedTitle).getText();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("user enters invalid username {string} or password {string}")
    public void userEntersInvalidUsernameOrPassword(String username, String password) {
        if(password.equals("salesmanager") || password.equals("posmanager") || password.equals("expensesmanager")
            || password.equals("inventorymanager") || password.equals("manufuser")){
        System.out.println("Incorrect username: " + username);
    } else{
        System.out.println("Incorrect password: " + password);
    }
        new LoginPage().login(username,password);
    }

    @Then("user sees {string} error message")
    public void userSeesAErrorMessage(String expectedErrorMsg) {
        String actualErrorMsg = new LoginPage().loginErrorMsg.getText();
        Assert.assertEquals(expectedErrorMsg,actualErrorMsg);


    }

    @When("any login input box is empty {string} {string}")
    public void anyLoginInputBoxIsEmpty(String username, String password) {
        new LoginPage().login(username,password);
        if(username.equals("")){
            System.out.println("username input box is emtpy");
        }else if(password.equals("")) {
            System.out.println("password input box is emtpy");
        }else{
            System.out.println("username and password are empty");
        }

    }

    @Then("user sees {string} error message in {string} {string}")
    public void userSeesErrorMessageIn(String expectedErrorMsg, String username, String password) {String actualUsernameErrorMsg = Driver.get().findElement(By.cssSelector("#login")).getAttribute("validationMessage");
        String actualPasswordErrorMsg = Driver.get().findElement(By.cssSelector("#password")).getAttribute("validationMessage");

        if(username.equals("")){
            Assert.assertEquals(expectedErrorMsg,actualUsernameErrorMsg);
        }else if(password.equals("")) {
            Assert.assertEquals(expectedErrorMsg,actualPasswordErrorMsg);
        }else{
            Assert.assertEquals(expectedErrorMsg,actualUsernameErrorMsg);
        }
    }


}
