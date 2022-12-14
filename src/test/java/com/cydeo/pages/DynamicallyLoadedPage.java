package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicallyLoadedPage {

    public DynamicallyLoadedPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//strong[.='Done!']")
    public WebElement doneMsg;

    @FindBy (xpath = "//img[@class='rounded mx-auto d-block']")
    public WebElement image;



}
