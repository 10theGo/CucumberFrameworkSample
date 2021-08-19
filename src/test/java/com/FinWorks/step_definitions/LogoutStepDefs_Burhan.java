package com.FinWorks.step_definitions;

import com.FinWorks.pages.DashboardPage;
import com.FinWorks.utilities.BrowserUtils;
import com.FinWorks.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutStepDefs_Burhan {

    DashboardPage dashboardPage = new DashboardPage();

    @When("The user clicks on user menu")
    public void the_user_clicks_on_user_menu() {
        BrowserUtils.waitForClickablility(dashboardPage.userName, 5);
        dashboardPage.userName.click();
    }

    @When("The user clicks on logout")
    public void the_user_clicks_on_logout() {
        BrowserUtils.waitForClickablility(dashboardPage.logOutLink, 5);
        dashboardPage.logOutLink.click();
    }

    @Then("The user should be successfully logout")
    public void the_user_should_be_successfully_logout() {
        Assert.assertTrue("Verify that \tActual page title: " + Driver.get().getTitle() + " -contains-> Login", Driver.get().getTitle().contains("Login"));
    }
}
