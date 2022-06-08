package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class BuildYourWonComputerPage extends Utils {

    public void userEnterComputerDetails(){

        //Select processor
        Select Processor = new Select(driver.findElement(By.name("product_attribute_1")));
        Processor.selectByIndex(1);

        //select rem
        Select Ram = new Select(driver.findElement(By.id("product_attribute_2")));
        Ram.selectByIndex(2);

//Select birtMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));//select on month
//        birtMonth.selectByIndex(6);

        //select HDD
        clickOnElement(By.xpath("//label[@for=\"product_attribute_3_6\"]"));

        //select softeare
        clickOnElement(By.xpath("//label[@for=\"product_attribute_4_9\"]"));
        clickOnElement(By.xpath("//label[@for=\"product_attribute_5_11\"] "));
        clickOnElement(By.xpath("//input[@value=\"12\"]"));

        //click add to cart button
        clickOnElement(By.xpath("//button[@id=\"add-to-cart-button-1\"]"));

        //open shopping card
        clickOnElement(By.xpath("//span[@class=\"cart-label\"]"));
    }


}
