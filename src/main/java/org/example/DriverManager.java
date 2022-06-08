package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;

public class DriverManager extends Utils {
    //open browser methode
    String browserName ="chrome";
    public void openBrowser() {

        if (browserName.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");

            driver = new ChromeDriver(); //impoert chrome web driver dependency(in pomfile)

        } else if (browserName.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.gecko.diver", "src/test/java/Drivers/geckodriver.exe");

            driver = new FirefoxDriver();
           //DesiredCapabilities capabilities = DesiredCapabilities;

    }
        //Duration to be wait
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //duration to be wait
            //screen maximize
            driver.manage().window().maximize(); //maximizing screen
            //type URL opening web page
            driver.get("https://demo.nopcommerce.com/");
    }
    //close browser methode
    public void closeBrowser() {
        driver.quit();

    }


}
