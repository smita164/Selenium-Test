package org.example;
import org.junit.Assert;
import org.openqa.selenium.By;

public class RegistrationSuccessPage extends Utils{
    public void verifyUserRegistrationSuccessfully(){
        String actualMassage = driver.findElement(By.className("result")).getText();
        String expectedMassage = "Your registration completed";
        Assert.assertEquals(actualMassage,expectedMassage,"Your registration completed");
    }
}
