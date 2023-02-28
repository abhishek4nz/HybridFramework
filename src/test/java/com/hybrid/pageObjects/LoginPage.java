package com.hybrid.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver ldriver;          //CREATING A LOCAL WEBDROVER OBJECT

    //CREATE A CONSTRUCTOR TO BE CALLED FROM TEST CASE CLASS
    LoginPage(WebDriver rdriver)    {

        ldriver=rdriver;                //ASSIGNING REMOTE WEBDRIVER OBJECT TO LOCAL WEBDRIVER
            PageFactory.initElements(rdriver,this);
    }

    @FindBy(name = "uid")
    @CacheLookup
    WebElement txtusername;         //STORING THE USERNAME FIELD AS A WEBELEMENT

    @FindBy(name = "password")
    @CacheLookup
    WebElement txtpassword;



}
