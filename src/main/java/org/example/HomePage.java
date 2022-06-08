package org.example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.*;
import static org.testng.Assert.assertTrue;



public class HomePage extends Utils {

  public void clickOnRegisterButton() {
    // click on register button
    clickOnElement(By.className("ico-register"));
  }

  public void clickOnComputer() {
    //click on computer
    clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']"));
  }

  public void clickOnDesktop() {
    //click on deskTop
    clickOnElement(By.xpath("//img[@alt=\"Picture for category Desktops\"]"));
  }
//======================================================================================================================
//@Test
//public void userShouldBeAbleToChangeTheCurrencyToEuro(){
//
//  //Verify if build your own computer price is display in Dollar (Assert Point)
//  homePage.verifyCurrencyIsDoller();
//
//  //Change the Dollar into Euro sign
//  homePage.selectEuro();
//
//  //Verify if price is display in Euro on home page (Assert Point)
//  homePage.verifyCurrancyIsEuro();
//}
//=====================================================================================================================
public void clickOnCurrency() {


  Select USDollar = new Select(driver.findElement(By.xpath("//select[@name=\"customerCurrency\"]")));
  USDollar.selectByValue("https://demo.nopcommerce.com/changecurrency/1?returnUrl=%2F");

  String expectedMessage7 = driver.findElement(By.xpath("//span[contains(text(),'$1,200.00')]")).getText();
  assertTrue(expectedMessage7.contains("$"));

  //select Euro

  Select Euro = new Select(driver.findElement(By.id("customerCurrency")));
  Euro.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");

  String expectedMessage3 = driver.findElement(By.xpath("//span [contains (text (),'€1032.00')]")).getText();
  assertTrue(expectedMessage3.contains("€"));
}

  public void verifyIfNonRegisteredUserIsAbleToVote() {
    //click on radio button good
    clickOnElement(By.id("pollanswers-2"));

    //click on vote
    clickOnElement(By.xpath("//button[@id=\"vote-poll-1\"]"));
    //verify user is not able to vote without being registered
    // delays until message appears
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
    }
    String actualMessage = driver.findElement(By.xpath("//*[@id=\"block-poll-vote-error-1\"]")).getText();
    Assert.assertEquals(actualMessage.contains("Only registered users can vote."), "Only registered users can vote");
  }

  public void verifyRegisteredUserIsAbleToVote() {
    clickOnElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
    //click on radio button good
    clickOnElement(By.xpath("//input[@id=\"pollanswers-2\"]"));
    //click on vote
    clickOnElement(By.className("ico-register"));
    clickOnElement(By.xpath("//*[@id=\"vote-poll-1\"]"));
    //verify registered user should be able to vote
    String actualMessage = driver.findElement(By.xpath("//*[@id=\"poll-block-1\"]/span")).getText();
//  Assert.assertTrue("\"//assertTrue(actualMessage.contains(\\\"vote(s)...\\\"), \\\"non registerd user is able to vote\\\")");
    Assert.assertEquals(actualMessage.contains("vote(s)..."), "vote(s)...");
  }



  //AlertMessage==========================================================================================
  public void userShouldBeAbleToReceiveAlertMessage() {
    //Click vote button
    clickOnElement(By.xpath("//button[@class=\"button-2 vote-poll-button\"]"));
    //Switch to alert
    Alert simpleAlert = driver.switchTo().alert();
    //Get text for alert
    String alertMessage = driver.switchTo().alert().getText();
    String actualMessageForVote = "Please select an answer";
    Assert.assertEquals(actualMessageForVote, alertMessage);
    //Accept alert
    driver.switchTo().alert().accept();
  }
//Facebook=====================================================================================================================
  public void clickOnFacebookButton() {
    String MainWindow = driver.getWindowHandle();
    //click on facebook button//
    clickOnElement(By.className("facebook"));
    //To handle all new opened window.
    Set<String> s1 = driver.getWindowHandles();
    Iterator<String> i1 = s1.iterator();

    while (i1.hasNext()) {
      String ChildWindow = i1.next();
      if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
        //Switching to child window
        driver.switchTo().window(ChildWindow);
        // verify user is on correct Facebook page
        String expectedFacebookUrl = "https://www.facebook.com/nopCommerce";
        String actualFacebookUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualFacebookUrl, expectedFacebookUrl);
        driver.close();
      }
      //Switching to Parent window
      driver.switchTo().window(MainWindow);
      // verify user is on correct homepage
      String expectedHomeUrl = "https://demo.nopcommerce.com/";
      String actualHomeUrl = driver.getCurrentUrl();
      Assert.assertEquals(actualHomeUrl, expectedHomeUrl);
    }
  }
//SearchTextBox========================================================================================================================

  public void verifyUserOnHomepage(){
    String expectedUrl="https://demo.nopcommerce.com/";
    String actualUrl=driver.getCurrentUrl();
    Assert.assertEquals(actualUrl,expectedUrl);
}
  public void enterWordInSearchTextBox(String product) {
  // enter text in searchTextBox//
  typeText(By.id("small-searchterms"), product);
  //verify url//
  String expectedsearchUrl = "https://demo.nopcommerce.com/search?q=" + product;
  String actualsearchUrl = driver.getCurrentUrl();
  Assert.assertEquals(actualsearchUrl, expectedsearchUrl);
  //click on search
  clickOnElement(By.className("search-box-button"));
  //check all products
  List<WebElement> productTitles = driver.findElements
          (By.xpath("//div[contains(@class,'product-grid')]//div[@class='item-box']//h2"));
  for (WebElement e : productTitles) {
    System.out.println(e.getText());
  }
}

public void clickOnDetailsButtons(){
    clickOnElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[5]/div[2]/div[2]/div[3]/a"));
}

  public void searchStore (){
    clickOnElement(By.xpath("//*[@id=\"small-searchterms\"]"));

  }

  }





