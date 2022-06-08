package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.BasePage.driver;

public class CurrencySuccessPage {
    LoadProp loadProp = new LoadProp(); //object

    private By _expectedMessage=By.id("$1,200.00");

    
    public void userCanSeeMessage(){
       // String expectedMessage  = "$1,200.00";
        String expectedMessage  = "$1,200.00";
        //String actualMessage = driver.findElement(By.xpath("//span[contains(text(),'$1,200.00')]")).getText();
        String actualMessage = driver.findElement(By.xpath("//span[contains(text(),'$1,200.00')]")).getText();
        //System.out.println("Actual message:" +actualMessage);
        System.out.println("Actual message:" +actualMessage);
        // Assert.assertEquals(actualMessage,expectedMessage,"price not matched");
        Assert.assertEquals(actualMessage,expectedMessage,"price not matched");
    }
}
