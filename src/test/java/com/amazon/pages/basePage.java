package com.amazon.pages;


import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class basePage {





    public basePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(id="nav-search-submit-button")
    public WebElement searchButton;

    @FindBy (css = ".a-spacing-top-small > span:nth-child(1)")
    public WebElement results;

    @FindBy(xpath = "//*[@id=\"search\"]//h2/a")
    public List <WebElement> itemList;

}
