package com.FinWorks.step_definitions;

import com.FinWorks.pages.LoginPageEvelin;
import com.FinWorks.pages.NotesFunctPage_Evelin;
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
    public void user_evelinNavigatesToStringPage(String exectedTextSubtitle) {
        String actualTextSubtitle = new LoginPageEvelin().dynamicSubtitleWebElement(exectedTextSubtitle).getText();
        Assert.assertEquals(exectedTextSubtitle,actualTextSubtitle);
    }

    @Then("user_Evelin sees {string} button under Notes subtitle")
    public void users_evelinSeesButtonUnderNotesSubtitle(String expectedCreateBtnText) {
        new NotesFunctPage_Evelin().getCreateBtn().click();
        String actualCreateBtnText= new NotesFunctPage_Evelin().getCreateBtn().getText();
        Assert.assertEquals(expectedCreateBtnText,actualCreateBtnText);
    }


}
