package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartSuccessPage extends Utils
{
    public void userShouldAbleToSuccessAddToCartInShoppingCart()
    {
        //Assert for Shopping cart
    String expectedMessage = "Shopping cart";
    String actualMessage = driver.findElement(By.xpath("//h1 [contains (text (),'Shopping cart')]")).getText();
        Assert.assertEquals(actualMessage,expectedMessage,"Shopping cart");
        try
    {
        Thread.sleep(5000);
    } catch(
    InterruptedException e)
    {
        e.printStackTrace();
    }
    //Assert Build your own computer
    String actualMessage1 = driver.findElement(By.className("product-name")).getText();
        try
    {
        Thread.sleep(5000);
    } catch(
    InterruptedException e)
    {
        e.printStackTrace();
        String expectedMessage1 = "Build your own computer";
        Assert.assertEquals(actualMessage1, expectedMessage1, "Build your own computer");
    }
    }
}
