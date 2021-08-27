package com.FinWorks.pages;

import com.FinWorks.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class TakingNotesPage_AY {

    public TakingNotesPage_AY() {

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//input[contains(@id,'o_field_input')]")
    private WebElement tagDropDownButton;

    @FindBy(xpath = "//span[contains(@class,'o_tag_color_')]")
    private List<WebElement> tagChoices;


    public void clickTagDropDown() {

        tagDropDownButton.click();

    }

    public List<String> getTagDropDownChoices() {

        List<String> listTags = new ArrayList();

        for (WebElement choice : tagChoices) {

            listTags.add(choice.getText());

        }

        System.out.println("Tags = " + listTags.size());
        System.out.println("Tag Choices = " + listTags);

        return listTags;
    }


}
