package org.example;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Utils extends BasePage
{
    //static reusable methods

    //1 method-----------------------------------
    public static void clickOnElement(By by)
    {                      //driver.findElement(By.xpath("//button[@id='register-button']")).click();
        driver.findElement(by).click();
    }
    //2Method-----------------------------------
    public static void getURL(int time, String url)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.urlToBe(url));
    }
    //3 method------------------------------------
    public static void typeText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
        driver.findElement(by).getText();
    }
    //4 method----------------------------------
    public static String randomDate()
    {
        Date date = new Date();  //2
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy/HH/mm/ss");
        return formatter.format(date);

        //Date date = new Date();  //1
        //SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy/HH/mm/ss");
        //String strDate = formatter.format(date);
        //System.out.println(strDate);
    }
    //5 method----------------------------------
    public String getTextFormElement(By by)
    {
        return driver.findElement(by).getText();
    }
    //6 method----------------------------------
    public static String timeStamp()
    {
        SimpleDateFormat date = new SimpleDateFormat("yyMMddHHmmss");
        return timeStamp();
    }
    //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    //7 method----------------------------------
    public static void driverWaitsUntilURLToBe(int time, String url)
    {
        WebDriverWait wait01 = new WebDriverWait(driver, Duration.ofSeconds(time));
        //wait.until(ExpectedCondition.elementToBeClickable(By.Xpath("//button[@name='register-button']")));
        wait01.until(ExpectedConditions.urlToBe("https://demo.nopcommerce.com/"));
    }
    public static void driverWaitsUntilURLTobeClickable(By by, int time)
    { //1
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }                                                                                             //1driverWait commands
    public static void driverWait(int time, String urlFraction)
    { //2
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.urlContains(urlFraction));
    }                                                                                             //3driverWait commands
    public static void driveWait(int time, String Attribute, String value, By by)
    { //3
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.attributeContains(by, Attribute, value));
    }                                                                                           //4driverWait commands
    public static void driverWaitUrlContains(int time, By by, String urlName)
    { //4
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.urlContains(urlName));
    }                                                                                          //5driverWait commands
    public static void DriverWaitSelectElement(int time, By by)
    { //5
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
    }                                                                                           //6driverWait commands
    public static void DriverWaitPresenceOfAllElementsLocatedBy(int time, By by)
    { //6
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }                                                                                            //7driverWait commands
    public static void DriverWaitVisibilityOf(int time, WebElement element)
    { //7
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOf(element));
    }                                                                                             //8driverWait commands
    public static void DriverWaituntilinvisibilityOfWebElement(int time, WebElement element) { //8
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }                                                                                             //9driverWait commands
    public static void DriverWaitElementToBeSelected(int time, By by)
    { //9
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeSelected(by));
    }                                                                                            //10driverWait commands
    public static void DriverWait(int time, String name)
    { //10
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.titleIs(name));
    }
    public static void click(By by)
    {
        driver.findElement(by).click();
    }
    public static void sendKeys(By by, String text)
    { //enter firstname
        driver.findElement(by).sendKeys(text);
    }

//6 method----------------------------------

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
//Screenshot code-----------
//<<<<<<<<<<<<<<<


    public static void takeSnapShot(String a)
    {
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        //Call getScreenShots method to create image file
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);

        // copy file at destination

        try
        {
            FileUtils.copyFile(srcFile, new File("Screenshots\\" + a + randomDate() + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//====================================================================================
//7 method----------------------------------

//
//    public static void verifyEqual(By by, String expectedText)
//    {
//        Assert.assertEquals(getTextFromElement(by), expectedText);
//    }
//}