package com.hybrid.pageObjects;

import com.hybrid.testCases.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout extends BaseClass {

    //CREATE CONSTRUCTOR FOR INITIALIZING PAGE FACTORY WITH WEBDRIVER
    public Logout(WebDriver driver)    {

        //CREATE A PAGEFACTORY TO INITIALIZE WEBDRIVER WITH PAGE OBJECTS
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Log out") @CacheLookup
    WebElement logout;

    public void setLogout()    {
        logout.click();
    }

}
