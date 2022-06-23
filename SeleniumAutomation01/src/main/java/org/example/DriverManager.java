package org.example;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
package org.example;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.lang.model.element.Name;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

public class DriverManager extends Utils
{
    LoadProp loadProp = new LoadProp();
    DesiredCapabilities caps = new DesiredCapabilities();
    public final String AUTOMATE_USERNAME = loadProp.getProperty("bsUsername");// copy path insummery
    public final String AUTOMATE_ACCESS_KEY = loadProp.getProperty("bsAccessKey");
    public final String BrowserStackURL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
    //boolean cl0ud = false// if true this cloud will choose for browserstack
    //boolean cloud = Boolean.parseBoolean(System.getProperty("cloud"));
    boolean cloud = true;

    //Browser open & Close
    //String browserName = "chrome";
    String browserName =System.getProperty("Chrome");
    public void openBrowser()
    {
        //making decision cloud true or false
        //this will be run if cloud true (in cloud)
        if (cloud)
        {
            System.out.println("running cloud");
            //applying conditional loop for different browser options
            if (browserName.equalsIgnoreCase("Chrome")) {
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "11");
                caps.setCapability("browser", "Chrome");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "4.1.0");

//            } else if (browserName.equalsIgnoreCase("Safari")) {
//                caps.setCapability("os", "OS X");
//                caps.setCapability("os_version", "Catalina");
//                caps.setCapability("browser", "Safari");
//                caps.setCapability("browser_version", "13.1");
//                caps.setCapability("browserstack.local", "false");
//                caps.setCapability("browserstack.selenium_version", "4.1.0");

            } else if (browserName.equalsIgnoreCase("edge")) {
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "11");
                caps.setCapability("browser", "Edge");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "4.1.0");

            } else if (browserName.equalsIgnoreCase("Firefox")) {
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "11");
                caps.setCapability("browser", "Firefox");
                caps.setCapability("browser_version", "latest-beta");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "4.1.0");

            } else {
                System.out.println("");
            }
            try {
                driver = new RemoteWebDriver(new URL(BrowserStackURL), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

        }else{
            if (browserName.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");

                driver = new ChromeDriver(); //import chrome web driver dependency(in pomfile)

            } else if (browserName.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.diver", "src/test/java/Drivers/geckodriver.exe");

                driver = new FirefoxDriver();
                //DesiredCapabilities capabilities = DesiredCapabilities;

            } else {
                System.out.println("Your browserName is wrong");
            }

//Duration to be wait
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            //Maximizing chrome window:
            driver.manage().window().maximize();

            //Driver to type URL :
            driver.get("urt");
        }
    }
    public void closeBrowser ()
    {
        driver.quit();
    }


//======================================================================================================================
    //Old Method local drivers---------------------------------------------------------------------
//        if (browserName.equalsIgnoreCase("chrome"))
//        {
//            System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
//
//            driver = new ChromeDriver(); //import chrome web driver dependency(in pomfile)
//
//        } else if (browserName.equalsIgnoreCase("firefox"))
//        {
//            System.setProperty("webdriver.gecko.diver", "src/test/java/Drivers/geckodriver.exe");
//
//            driver = new FirefoxDriver();
//            //DesiredCapabilities capabilities = DesiredCapabilities;
//        }
//        //Duration to be wait
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        //Maximizing chrome window:
//        driver.manage().window().maximize();
//
//        //Driver to type URL :
//        driver.get("https://demo.nopcommerce.com/");
//    }
//    public void closeBrowser()
//    {
//        driver.quit();
//    }
//========================================================================================================================================================

}