package com.FinWorks.step_definitions;

import com.FinWorks.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @Before
    public void setUp(){
        System.out.println("\t this is coming from BEFORE");
    }

    @After
    public void tearDown(Scenario scenario) {
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }


        Driver.closeDriver();
    }


    @Before("@db")
    public void setUpdb(){
        System.out.println("\t connecting database ...");
    }
    @After("@db")
    public void tearDowndb(){
        System.out.println("\t disconnecting databas...");
    }
}
