package com.hybrid.testCases;

import com.hybrid.utilities.Readconfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.Properties;

public class BaseClass {
    public static WebDriver driver;             //INITIALIZE A PUBLIC WEBDRIVER OBJECT

    //    public static Properties property;
    public String baseURL = new Readconfig().getURL();
    public String username = new Readconfig().getUserName();
    public String password = new Readconfig().getPassword();

    public static Logger logger;

    @Parameters("browser")
    @BeforeClass
    public void setup(String browser) {
        //CHECK WHAT BROWSER WE SHOULD OPEN
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();      //CHROME OPTIONS OBJECT EXTENDED FROM BASE CLASS
            options.addArguments("--remote-allow-origins=*");       //USE THE OBJECT TO PASS ARGUMENTS
            DesiredCapabilities cp = new DesiredCapabilities();       //DESIRED CAPABILITIES OBJECT EXTENDED FROM BASE CLASS
            cp.setCapability(ChromeOptions.CAPABILITY, options);    //SET THE CAPABILITY TO CHROME OPTIONS OBJECT
            options.merge(cp);
            driver = new ChromeDriver(options);
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        //        driver.manage().window().minimize();
        Logger logger = Logger.getLogger("HybridFramework");
        PropertyConfigurator.configure("Log4j.properties");

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }


}
