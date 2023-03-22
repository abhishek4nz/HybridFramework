package com.hybrid.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.hybrid.testCases.BaseClass;
import org.testng.annotations.BeforeTest;

public class ExtenReport  {

  static ExtentReports extent;


    @BeforeTest
    public void startReport()  {
//         extent = new ExtentReports(System.getProperty("user.dir")+"MyFIrstReport.html", true);

    }
}
