package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends Utils {
    LoadProp loadProp = new LoadProp(); //object

    private By _genderFemale = By.id("gender-female");
    private By _firstname = By.id("FirstName");
    private By _lastname = By.id("LastName");
    private By _dateOfBirthDay = By.name("DateOfBirthDay");
    private By _dateOfBirthMonth = By.name("DateOfBirthMonth");
    private By _dateOfBirthYear = By.name("DateOfBirthYear");
    private By _Email = By.id("Email");
    private By _Password = By.id("Password");
    private By _ConfirmPassword = By.id("ConfirmPassword");
    private By _registerbutton = By.id("registerbutton");

    public void verifyUserRegistrationPage() {
        //select gender male or female Radio button

        try {
            Thread.sleep(300);
        }catch(InterruptedException e) {
        }
        clickOnElement(_genderFemale); //adio button

        //Enter First Name------------------------
        //
        //typeText(By.id("firstName"),"smita");
        typeText(_firstname, loadProp.getProperty("firstName"));

        //Enter Last Name-------------------------
        //typeText(By.id("LastName"), "Patel");
        typeText(_lastname, loadProp.getProperty("LastName"));

        //Date of birth day----------------------
        Select birthDay = new Select(driver.findElement(By.name("DateOfBirthDay")));//select on the day
        birthDay.selectByIndex(28);

        //Date of birth month---------------------
        Select birtMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));//select on month
        birtMonth.selectByIndex(6);

        //Date of birth year--------------------
        Select birthYear = new Select(driver.findElement(By.name("DateOfBirthYear")));//select on year
        birthYear.selectByVisibleText("1990");

        //Enter Email----------------------------
        System.out.println(randomDate());
        //typeText(By.id("Email"), "smita.mpatel164" + randomDate() + "@gmail.com");//without locater
        typeText(_Email, loadProp.getProperty("smita.mpatel164" + randomDate() + "@gmail.com"));


        //Enter Email----------------------------
        //
        typeText(_Password, loadProp.getProperty("mpatel164"));

        //Enter your confirm password-------------
        //
        typeText(_ConfirmPassword, loadProp.getProperty("mpatel164"));

        //Click on register button------------------------
        //
        clickOnElement(By.id("register-button"));
    }
}