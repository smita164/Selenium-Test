package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.BasePage.driver;

public class EmailYourFriendSuccessPage {
    public void userShouldBeAbleToEmailYourFriendSuccessfully()
    {
        String actualMessage = driver.findElement(By.className("result")).getText();
        String expectedMessage = "Your message has been sent.";
        Assert.assertEquals(actualMessage,expectedMessage,"Your message has been sent.");
    }
}
