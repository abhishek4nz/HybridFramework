package com.hybrid.testCases;

import com.hybrid.pageObjects.Logout;
import org.testng.annotations.Test;

public class TC_Logout extends BaseClass{

    @Test
    void logout()   {

        //CREATE THE PAGE OBJECT AND SEND THE DRIVER ARGUMENT IN THE CONSRUCTOR
        Logout lt = new Logout(driver);

        //CLICK ON LOGOUT BUTTON
        lt.setLogout();

        System.out.println(driver.switchTo().alert().getText());
        //ACCEPT THE BROWSER ALERT
        driver.switchTo().alert().accept();

    }
}
