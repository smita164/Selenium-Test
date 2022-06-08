package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest extends Utils {
    //Before method
DriverManager driverManager = new DriverManager(); //object driver

    @BeforeMethod
    public void setUp() {
        driverManager.openBrowser();
    }
    //Before method
    @AfterMethod
    public void tearDown(ITestResult result) {
        driverManager.closeBrowser();
    }
}
