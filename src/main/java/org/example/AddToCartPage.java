package org.example;

import org.openqa.selenium.By;

public class AddToCartPage extends Utils {
    public void addToCart(){

        //click on add to art
        driver.findElement(By.xpath("//h2[@class=\"product-title\"]/a[@href=\"/build-your-own-computer\"]")).click();


    }
}
