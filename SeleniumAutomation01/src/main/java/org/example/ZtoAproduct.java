package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ZtoAproduct extends Utils{

    public void getProductTitle() {
        Select select = new Select(driver.findElement(By.id("products-orderby")));
        select.selectByVisibleText("Name: Z to A");
        List<WebElement> productList = driver.findElements(By.xpath("//div[@class='products-container']/descendant::a"));

        for (WebElement element : productList) {

            System.out.println(element.getText());
        }
    }



}
