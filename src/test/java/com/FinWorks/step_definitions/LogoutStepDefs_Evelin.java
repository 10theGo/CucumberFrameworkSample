package com.FinWorks.step_definitions;

import com.FinWorks.pages.LoginPageEvelin;
import com.FinWorks.pages.LogoutPage_Evelin;
import com.FinWorks.pages.LoginPage;
import com.FinWorks.utilities.BrowserUtils;
import com.FinWorks.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LogoutStepDefs_Evelin {
    @And("enter valid credentials {string} and {string}")
    public void enterValidCredentials(String username, String password) {
        new LoginPage().login(username, password);
    }
    @And("click on {string} button")
    public void clickOnDropdawnButton(String dropdawn) {
        new LogoutPage_Evelin().getDropdawnMenu().click();
    }

    @Then("a drop down many is displayed")
    public void aDropDownManyIsDisplayed() {
        Assert.assertTrue(new LogoutPage_Evelin().getDropdawnMenu().isDisplayed());
    }

    @And("user clicks on {string} button")
    public void userClicksTheLogoutButton(String login) {
        new LogoutPage_Evelin().getLogoutButton().click();
   }

    @Then("users navigate to {string} page")
    public void usersGoOutFromAplication(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

}
