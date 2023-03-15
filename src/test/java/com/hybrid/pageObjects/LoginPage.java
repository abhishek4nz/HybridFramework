package com.hybrid.pageObjects;

import com.hybrid.testCases.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

//    WebDriver ldriver;          //CREATING A LOCAL WEBDROVER OBJECT
    //CREATE A CONSTRUCTOR TO BE CALLED FROM TEST CASE CLASS
//    DRIVER IS INHERITED FROM THE BASE CLASS
    public LoginPage(WebDriver driver) {

//        this.driver = driver;                //ASSIGNING REMOTE WEBDRIVER OBJECT TO LOCAL WEBDRIVER
        PageFactory.initElements(driver, this);
    }

    //FIRST WE HAVE TO LOCATE THE ELEMENTS IN THE PAGE AND STORE THEM IN MEMEORY FOR LATER USAGE
    @FindBy(name = "uid")    @CacheLookup           //USING LOCATIORS TO LOCATE ELEMENTS IN THE LOGIN PAGE
    WebElement txtUserName;         //STORING THE USERNAME FIELD AS A WEBELEMENT

    @FindBy(name = "password")    @CacheLookup
    WebElement txtPassword;

    @FindBy(name = "btnLogin")    @CacheLookup
    WebElement btnLogin;

    //SECONDLY CREATE ACTION METHODS TO PERFORM ACTION ON THE WEB ELEMENTS

    public void setUserName(String uname) {          //CREATING AN ACTION METHOD FOR USERNAME ACTION
        txtUserName.sendKeys(uname);        //PERFORMING ACTION FOR USERNAME FIELD WITH DATA COMING FROM PARAMETER
    }

    public void setPassword(String pwd) {
        txtPassword.sendKeys(pwd);
    }

    public void clickSubmit() {
        btnLogin.submit();          //PERFORMING SUBMIT ACTION ON THE BUTTON
    }
}
