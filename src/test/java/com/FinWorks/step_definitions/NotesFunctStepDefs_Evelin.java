package com.FinWorks.step_definitions;

import com.FinWorks.pages.LoginPageEvelin;
import com.FinWorks.pages.NotesFunctPage_Evelin;
import com.FinWorks.utilities.BrowserUtils;
import com.FinWorks.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class NotesFunctStepDefs_Evelin {

    @When("user_Evelin clicks on Notes module")
    public void user_evelinClicksOnModule() {
        new LoginPageEvelin().getNotesBtn().click();
    }

    @And("user_Evelin navigates to {string} page")
    public void user_evelinNavigatesToStringPage(String exectedTitle) {
        BrowserUtils.waitFor(2);
        String actualTitle =Driver.get().getTitle();
        Assert.assertEquals(exectedTitle,actualTitle);
    }

    @Then("user_Evelin sees {string} button under Notes subtitle")
    public void users_evelinSeesButtonUnderNotesSubtitle(String expectedCreateBtnText) {

        String actualCreateBtnText= new NotesFunctPage_Evelin().getCreateBtn().getText();
        Assert.assertEquals(expectedCreateBtnText,actualCreateBtnText);
    }


    @When("user_Evelin clicks on Create module")
    public void user_evelinClicksOnCreateModule() {
        new NotesFunctPage_Evelin().getCreateBtn().click();
     //   BrowserUtils.waitFor(2);
    }

    @Then("user_Evelin navigates to Note {string} page")
    public void user_evelinNavigatesToNotePage(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
