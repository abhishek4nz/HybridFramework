package com.hybrid.utilities;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter {

    @Override
    public void onTestStart(ITestResult iTestResult) {
        super.onTestStart(iTestResult);
        System.out.println("Test started");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        super.onFinish(iTestContext);
        System.out.println("Test ended");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        super.onTestFailure(iTestResult);
        System.out.println("Test failed");
    }
}
