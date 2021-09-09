package com.FinWorks.pages;

import com.FinWorks.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class NavBarPage_Burhan extends BasePage {

    @FindBy(className = "oe_menu_text")
    private List<WebElement> navBarTabs;

    @FindBy(xpath = "//li[@id = 'menu_more_container']/a")
    private WebElement menuTab;


    public void clickOnNavBarTab(String tabName) {
        BrowserUtils.waitForPageToLoad(3);
        if (menuTab.isDisplayed() && !navBarTabTexts().contains(tabName)) {
            menuTab.click();
        }
        for (WebElement navBarTab : navBarTabs) {
            if (navBarTab.getText().trim().equals(tabName)) {
                navBarTab.click();
            }
        }
    }

    private List<String> navBarTabTexts() {
        List<String> textList = new ArrayList<>();
        for (WebElement navBarTab : navBarTabs) {
            textList.add(navBarTab.getText().trim());
        }
        return textList;
    }

}
