package org.example;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverManager extends Utils {



    String browserName = "Chrome";

    public  void openBrowser() {

        if   (browserName.equalsIgnoreCase("Chrome")) {

            System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/test/java/Drivers/geckodriver.exe");
            driver = new FirefoxDriver();

        }else if (browserName.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", "src/test/java/Drivers/msedgedriver.exe");
            driver = new EdgeDriver();

        }
        //Implicit wait method :
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Maximizing chrome window:
        driver.manage().window().maximize();

        //Driver to type URL :
        driver.get("https://demo.nopcommerce.com/");
    }

    public void closeBrowser() {
        driver.quit();

    }
}
