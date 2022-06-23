package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationSuccessPage extends Utils
{
    private By _clickOnContinueButton = By.xpath("//a[@class='button-1 register-continue-button']");

    public void verifyUserRegistrationSuccessfully()
    {
        String actualMassage = driver.findElement(By.className("result")).getText();
        String expectedMassage = "Your registration completed";
        Assert.assertEquals(actualMassage,expectedMassage,"Your registration completed");
    }
    public void clickOnContinueButton(){
        //click on continue//
        clickOnElement(_clickOnContinueButton);
}
}