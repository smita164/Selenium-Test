package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationSuccessPage extends Utils
{
    public void verifyUserRegistrationSuccessfully()
    {
        String actualMassage = driver.findElement(By.className("result")).getText();
        String expectedMassage = "Your registration completed";
        Assert.assertEquals(actualMassage,expectedMassage,"Your registration completed");
    }
}
