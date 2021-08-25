package com.FinWorks.pages;

import com.FinWorks.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NavBarPage_Burhan extends BasePage {

    @FindBy(className = "oe_menu_text")
    private List<WebElement> navBarTabs;


    public void clickOnNavBarTab(String tabName) {
        BrowserUtils.waitForPageToLoad(3);
        for (WebElement navBarTab : navBarTabs) {
            if (navBarTab.getText().trim().equals(tabName)) {
                navBarTab.click();
            }
        }
    }

}
