package com.FinWorks.step_definitions;

import com.FinWorks.pages.BasePage;
import com.FinWorks.pages.VehiclesPage_Burhan;
import com.FinWorks.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class VehiclesStepDefs_Burhan {
    VehiclesPage_Burhan vehiclesPage = new VehiclesPage_Burhan();

    @Then("The user should be on the Vehicles Page_brhn")
    public void the_user_should_be_on_the_Vehicles_Page_brhn() {
        BrowserUtils.waitForVisibility(vehiclesPage.createVehicleButton, 2);
        String pageSubTitle = vehiclesPage.getPageSubTitle();
        Assert.assertEquals("Vehicles", pageSubTitle);
    }
}
