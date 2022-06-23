//package org.example;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import org.testng.annotations.TestInstance;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.List;
//
//import static java.lang.System.getProperty;
//
//@Test
//public class TestSuit extends BaseTest
//{
//    //1------------------------------------
//    HomePage homePage = new HomePage();
//    RegistrationPage registrationPage = new RegistrationPage();
//    RegistrationSuccessPage registrationSuccessPage = new RegistrationSuccessPage();
//    //2---------------------------------
//    AddToCartPage addToCartPage = new AddToCartPage();
//    BuildYourWonComputerPage buildYourWonComputerPage = new BuildYourWonComputerPage();
//    ShoppingCartSuccessPage shoppingCartSuccessPage = new ShoppingCartSuccessPage();
//    //3---------------------------------
//    EmailYourFriend emailyourfriend = new EmailYourFriend();
//    EmailYourFriendSuccessPage emailYourFriendSuccessPage = new EmailYourFriendSuccessPage();
//    //4--------------------------------
//    //DeskTopPage deskTopPage = new DeskTopPage();
//    //5--------------------------------
//    CurrencySuccessPage currencySuccessPage = new CurrencySuccessPage();
//    NopCommerceNewRelease nopCommerceNewRelease =new NopCommerceNewRelease();
//    ZtoAproduct ztoAproduct=new ZtoAproduct();
//    NikeAndAppleProduct nikeAndAppleProduct =new NikeAndAppleProduct();
//    //======================================================================================================================
//    @Test(priority = 1)
//    public void ToBEVerifyUserShouldBeAbleTORegisterSuccessfully()
//    {
//        homePage.clickOnRegisterButton();
//        registrationPage.verifyUserRegistrationPage();
//        registrationSuccessPage.verifyUserRegistrationSuccessfully();
//    }
//    //====================================================================================================
//    @Test(priority = 2)
//    public void userShouldBeAbleToAddProductInAddToCart()
//    {
//        homePage.clickOnComputer();
//        homePage.clickOnDesktop();
//        addToCartPage.addToCart();
//        buildYourWonComputerPage.userEnterComputerDetails();
//        shoppingCartSuccessPage.userShouldAbleToSuccessAddToCartInShoppingCart();
//    }
//
//    //======================================================================================================================
//    @Test(priority = 3)
//    public void RegisterUerShouldReferProductToTheirFriends()
//    {
//        homePage.clickOnRegisterButton();
//        registrationPage.verifyUserRegistrationPage();
//        registrationSuccessPage.verifyUserRegistrationSuccessfully();
//        homePage.clickOnComputer();
//        homePage.clickOnDesktop();
//        addToCartPage.addToCart();
//        emailyourfriend.userShouldBeAbleToEmailYourFriend();
//        emailYourFriendSuccessPage.userShouldBeAbleToEmailYourFriendSuccessfully();
//    }
//    //================================================================================================================
//    @Test(priority = 4)
//    public void UserShouldBeAbleToClickVoteButtonCommunityPoll()
//    {
//        homePage.verifyIfNonRegisteredUserIsAbleToVote();
//        ToBEVerifyUserShouldBeAbleTORegisterSuccessfully();
//        homePage.verifyRegisteredUserIsAbleToVote();
//    }
//
//    //======================================================================================================================
//    @Test(priority = 5)
//    public void CurrencyForProduct() {
//        //select currency
//        homePage.clickOnCurrency();
//    }
//
//
//
//
//
//
//
//
//
//    //AlertMessage====================================================================================================================
//    @Test(priority = 6)
//    public void userShouldBeAbleToVote() {
//
//        homePage.userShouldBeAbleToReceiveAlertMessage();
//    }
//    //Facebook======================================================================================================================
//    @Test(priority = 7)
//    public void userShouldBeAbleToNavigateFaceBookPageSuccessfully()
//
//    {
//    homePage.clickOnFacebookButton();
//    }
//
//    //ZToA======================================================================================================================
//
//    @Test(priority = 8)
//    public void verifyProductListedInZToAFormat()
//    {
//       //click on Computer homepage
//        homePage.clickOnComputer();
//        //click on desktop
//        homePage.clickOnDesktop();
//        //select Z to A option in sort by
//      ztoAproduct.getProductTitle();
//    }
// //CommentList=====================================================================================================================
//
//    @Test(priority = 9)
//    public void verifyUserCommentHasSuccessfullyAddedToCommentList()
//    {
//        //NonCommerceNewRelease
//        homePage.clickOnDetailsButtons();
//        //nopcommerce new release assert Point
//        nopCommerceNewRelease.checkURLOfThePage();
//        //Enter Title
//        nopCommerceNewRelease.enterTitle();
//        //Enter comment
//        nopCommerceNewRelease.enterComment();
//        //Added NewComment is successefully added assert point
//        nopCommerceNewRelease.verifyCommentAddedMessage();
//        //Comment has been added to list
//        nopCommerceNewRelease.verifyCommentHasBeenAddedToTheCommentList();
//    }
//    //Nike==================================================================================================================
//    @Test(priority = 10)
//    public void userShouldBeAbleTo()
//    {
//        homePage.searchStore();
//     nikeAndAppleProduct.searchNike();
//    }
////======================================================================================================================
//@Test
//public void userShouldBeOnHomePageClickGiftCart()
//{
//    //Clock on gift Cart
//    // verify product name
//}
//    @Test
//    public void verifyMyLoadprop(){
//        System.out.println(getProperty("url"));
//}
//
////List=======================================================================================================
//@Test
//    public void getProductTitleFromHomePage(){
//homePage.getProductTitles();
//}
//@Test
//    public void m1(){
//    	List<String> list1=new ArrayList<String>();
//        list1.add("Mobile");
//        list1.add("camara");
//        list1.add("computer");
//        list1.add("LapTop");
//        System.out.println(list1);
//
//        //'making duplicat List
//    List<String> sortedlist=new ArrayList<String>(list1);
//    //sorting the list
//    Collections.sort(sortedlist);
//    System.out.println(sortedlist);
//    Assert.assertEquals(list1,sortedlist);
//}
////=======================================================================================================================
////    @Test
////    public void testHover(){
////        homePage.navigateToSubcategoryPageHover("computer","Desktop");
////    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
