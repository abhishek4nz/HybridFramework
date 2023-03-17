package com.hybrid.pageObjects;

import com.hybrid.testCases.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer extends BaseClass {

    public AddCustomer(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "New Customer")
    @CacheLookup
    WebElement link;

    @FindBy(name = "name")
    @CacheLookup
    WebElement name;

    @FindBy(name = "dob")
    @CacheLookup
    WebElement dob;

    @FindBy(name = "addr")
    @CacheLookup
    WebElement address;

    @FindBy(name = "city")
    @CacheLookup
    WebElement city;

    @FindBy(name = "state")
    @CacheLookup
    WebElement state;

    @FindBy(name = "pinno")
    @CacheLookup
    WebElement pin;

    @FindBy(name = "telephoneno")
    @CacheLookup
    WebElement no;

    @FindBy(name = "emailid")
    @CacheLookup
    WebElement email;

    @FindBy(name = "password")
    @CacheLookup
    WebElement password;

    @FindBy(name = "sub")   @CacheLookup
    WebElement sub;


    public void openLink() {
        link.click();
    }

    public void setName(String name) {
        this.name.sendKeys(name);
    }

    public void setDob(String dob) throws InterruptedException {
        this.dob.sendKeys(dob);
    }
    public void setAddress(String address) {
        this.address.sendKeys(address);
    }
    public void setCity(String city)    {
        this.city.sendKeys(city);
    }
    public void setState(String state)    {
        this.state.sendKeys(state);
    }
    public void setPin(String pin)    {
        this.pin.sendKeys(pin);
    }
    public void setNo(String no)    {
        this.no.sendKeys(no);
    }
    public void setEmail(String email)    {
        this.email.sendKeys(email);
    }
    public void setPassword(String password)    {
        this.password.sendKeys(password);
    }
    public void submitBtn() {
        sub.click();
    }
}
