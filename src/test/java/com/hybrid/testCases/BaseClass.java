package com.hybrid.testCases;

import com.hybrid.utilities.Readconfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;             //INITIALIZE A PUBLIC WEBDRIVER OBJECT
    public String baseURL = new Readconfig().getURL();
    public String username = new Readconfig().getUserName();
    public String password = new Readconfig().getPassword();

    @DataProvider(name = "data")
    public String[][] getLoginData() {
        String loginData[][] = {
                {"Abhishek Debnath","01061989", "Tollygunge","Kolkata","West Bengal","700040","9674246082","abhishek@innofied.com","innofied"},
                {"Pradipta De","15101986", "Shibpur","Howrah","West Bengal","711102","9674215309","pradipto@innofied.com","123456"}
        };
        return loginData;
    }

    public static Logger logger;

    @Parameters("browser")
    @BeforeTest
    public void setup(String browser) {
        //CHECK WHAT BROWSER WE SHOULD OPEN
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        //        driver.manage().window().minimize();
        Logger logger = Logger.getLogger("HybridFramework");
//        PropertyConfigurator.configure("Log4j.properties");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    void delay() throws InterruptedException {
        Thread.sleep(2000);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }


}
