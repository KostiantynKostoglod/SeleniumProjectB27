package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicallyLoadedPage1 {
    public DynamicallyLoadedPage1(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//button[.='Start']")
    public WebElement startBtn;

    @FindBy (id = "loading")
    public WebElement loadinfBar;

    @FindBy (css = "input#username")
    public WebElement inUserName;

    @FindBy (id = "pwd")
    public WebElement inPassword;

    @FindBy (partialLinkText = "Submit")
    public WebElement submitBtn;

    // @FindBy (xpath = "//div[id=flash]")
    // public void
}
