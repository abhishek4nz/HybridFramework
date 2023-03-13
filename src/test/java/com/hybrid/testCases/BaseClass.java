package com.hybrid.testCases;

import com.hybrid.utilities.Readconfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    public static WebDriver driver;             //INITIALIZE A PUBLIC WEBDRIVER OBJECT
    public String baseURL=new Readconfig().getURL();
    public String username=new Readconfig().getUserName();
    public String password=new Readconfig().getPassword();

    public static Logger logger;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
//        driver.manage().window().minimize();
         Logger logger = Logger.getLogger("HybridFramework");
//        PropertyConfigurator.configure("Log4j.properties");

    }

    @AfterClass
    public void tearDown()  {
        driver.quit();
    }


}
