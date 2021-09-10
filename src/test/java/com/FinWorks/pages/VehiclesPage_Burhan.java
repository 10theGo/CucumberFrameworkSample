package com.FinWorks.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehiclesPage_Burhan extends BasePage {
    @FindBy(xpath = "//ol[@class = 'breadcrumb']/li")
    private WebElement subText;

    @FindBy (xpath = "//button[@accesskey='c']")
    public WebElement createVehicleButton;
}
