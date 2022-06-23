package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.URL;

public class MyStepDefs {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccessPage registrationSuccessPage = new RegistrationSuccessPage();

//Registration==========================================================================================================
    @Given("I am on registration page")
    public void i_am_on_registration_page() {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnRegisterButton();
    }
    @When("I enter registration details")
    public void i_enter_registration_details() {
        // Write code here that turns the phrase above into concrete actions
        registrationPage.userEnterRegistrationDetails();
    }
    @Then("I should able to registered successfully")
    public void i_should_able_to_registered_successfully() {
        // Write code here that turns the phrase above into concrete actions
        registrationSuccessPage.verifyUserRegistrationSuccessfully();
    }
//Category==============================================================================================================
    @Given("I am on homepage")
    public void i_am_on_homepage() {
        // Write code here that turns the phrase above into concrete actions
        homePage.verifyUserOnHomepage();
    }
//    @When("I click on \"<category_name>\"link from top menu header")
//    public void i_click_on_category_name_link_from_top_menu_header(String category_name) {
//        // Write code here that turns the phrase above into concrete actions
//        homePage.clickOnCategoryLink(category_name);
//    }
//    @Then("I should able to successfully navigate to related <category_url>with same category page")
//    public void i_should_able_to_successfully_navigate_to_related_category_url_with_same_category_page(String category_url) {
//        // Write code here that turns the phrase above into concrete actions
//    Utils.verifyCurrentUrl(category_url);
//    }

    @When("I click on {string}link from top menu header")
    public void iClickOnLinkFromTopMenuHeader(String category_name)
    {
        homePage.clickOnCategoryLink(category_name);
    }

    @Then("I should able to successfully navigate to related {string}with same category page")
    public void iShouldAbleToSuccessfullyNavigateToRelatedWithSameCategoryPage(String category_url) {
        Utils.verifyCurrentUrl(category_url);
    }
//======================================================================================================================
}


