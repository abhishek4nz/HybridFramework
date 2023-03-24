package com.hybrid.testCases;

import com.hybrid.pageObjects.AddCustomer;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_AddCustomer extends BaseClass{

    @Test(dataProvider="data")
    void addCustomer(String name, String dob, String address, String city, String state, String pin, String no, String email, String password) throws InterruptedException {
        AddCustomer add = new AddCustomer(driver);
        add.openLink();
        add.setName(name);
        add.setDob(dob);
        add.setAddress(address);
        add.setCity(city);
        add.setState(state);
        add.setPin(pin);
        add.setNo(no);
        add.setEmail(email);
        add.setPassword(password);
        add.submitBtn();

        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
    }

    @Test(dataProvider = "excel")
    void addCustomer(String name, String address)  {

        AddCustomer add2 = new AddCustomer(driver);
        add2.setName(name);
        add2.setAddress(address);

    }
}
