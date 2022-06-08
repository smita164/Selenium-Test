package org.example;

import org.openqa.selenium.By;

public class EmailYourFriend extends Utils{
    public void userShouldBeAbleToEmailYourFriend(){

        //click on email friend button
        clickOnElement(By.xpath("//button[@class=\"button-2 email-a-friend-button\"]"));

        //enter your friend email
       typeText(By.xpath("//*[@id=\"FriendEmail\"]"),"ashmita164@yaoo.com");

        //enter your email address
        typeText(By.xpath("//*[@id=\"YourEmailAddress\"]")," ");

        // enter personal message
        typeText(By.xpath("//*[@id=\"PersonalMessage\"]"),"This computer is a very nice and good price.");

        //click on send email Button
       clickOnElement(By.name("send-email"));

    }
}
