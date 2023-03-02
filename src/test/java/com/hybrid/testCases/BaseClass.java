package com.hybrid.testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    public static WebDriver driver;             //INITIALIZE A PUBLIC WEBDRIVER OBJECT
    public String baseURL="https://demo.guru99.com/v3/";
    public String username="mngr482409";
    public String password="amAgymu";

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
