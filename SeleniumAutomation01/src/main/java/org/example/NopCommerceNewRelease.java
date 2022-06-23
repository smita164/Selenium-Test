package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class NopCommerceNewRelease extends Utils {
    public void checkURLOfThePage() {
        //Verify that user is on the nopcommerce new release page (Assert Point - verify URL)
        String expectedUrl = "https://demo.nopcommerce.com/nopcommerce-new-release";
        String actualNopCommerceNewReleaseUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualNopCommerceNewReleaseUrl.contains("release"), "your register url does not contain release word");
    }

    public void checkTitleOfThePage() {
        String expectedTitle = "nopCommerce new release!";
        String actualTitle = getTextFormElement(By.className("page-title"));
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    public void enterTitle() {
        typeText(By.id("AddNewComment_CommentTitle"), "123Asmita");
    }
    public void enterComment()
    {
        typeText(By.id("AddNewComment_CommentText"), "Nice Product");
        clickOnElement(By.xpath("//button[@name=\"add-comment\"]"));
    }

    public void clickOnCommentButton()
    {
        clickOnElement(By.name("add-comment"));
    }
    public void verifyCommentAddedMessage()
    {
        String actualMessage = getTextFormElement(By.className("result"));
        String expectedMessage = "News comment is successfully added.";
        Assert.assertEquals(actualMessage, expectedMessage, "Comment not added");
    }
    public void verifyCommentHasBeenAddedToTheCommentList()
    {
        //Verify that user's comment has been added to the comments list (Assert Point - Comment has been added to the list)
        String title = "Like Product List";
        List<WebElement> comments = driver.findElements(By.xpath("//div[@class='comment-title']"));
        List<String> listOfComments = new ArrayList<>();
        for (WebElement we:comments){
            listOfComments.add(we.getText());
        }
        Assert.assertTrue(listOfComments.contains(title));
        String lastComment = listOfComments.get(listOfComments.size()-1);
        System.out.println(lastComment);
        Assert.assertEquals(lastComment, title, "Comments are not listed in order");
    }
}
