package org.example;

import org.testng.annotations.*;

public class Testing
{
        @Test // This is a test method
        public void testMethod()
        {
            System.out.println("@Test - This is a test method");
        }
        @BeforeMethod // Executes before each test
        public void beforeMethod()
        {
            System.out.println("@BeforeMethod - Executes before each test method");
        }
        @AfterMethod
        public void afterMethod()
        {
            System.out.println("@AfterMethod - Executes after each test method");
        }
        @BeforeClass
        public void beforeClass()
        {
            System.out.println("@BeforeClass - Executes first in the class");
        }
        @AfterClass
        public void afterClass()
        {
            System.out.println("@AfterClass - Executes last in the class");
        }
        @BeforeTest
        public void beforeTest()
        {
            System.out.println("@BeforeTest - Executes before all test methods");
        }
        @AfterTest
        public void afterTest()
        {
            System.out.println("@AfterTest - Executes after all test methods");
        }
        @BeforeSuite
        public void beforeSuite()
        {
            System.out.println("@BeforeSuite - Executes first in the suite");
        }
        @AfterSuite
        public void afterSuite()
        {
            System.out.println("@AfterSuite - Executes last in the suite");
        }
    }

