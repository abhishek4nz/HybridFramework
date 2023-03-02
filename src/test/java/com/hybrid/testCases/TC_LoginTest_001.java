package com.hybrid.testCases;

import com.hybrid.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_001 extends BaseClass {

    @Test
    public void loginTest() {
        driver.get(baseURL);
//        logger.info("Browser opened");

        //INSTANTIATING THE LOGIN PAGE OBJECT WITH A WEBDRIVER OBJECT CONSTRUCTOR
        LoginPage lp = new LoginPage(driver);

        //NOW CALLING ACTION METHODS OF THE LOGIN PAGE OBJECT
        lp.setUserName(username);

        lp.setPassword(password);
        lp.clickSubmit();

        //NOW RUNGING THE ACTUAL ASSERTION TEST
        if (driver.getTitle().contains("Guru99"))
            Assert.assertTrue(true);
        else
            Assert.assertFalse(false);
    }
}
