package Util;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.Reporter;

import java.util.Properties;

public class Hooks {

    AppiumDriver driver;
    Properties properties;

    @Before
    public void before(){
        //String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("Android");
        properties = ConfigReader.initialize_Properties();
        driver = DriverFactory.initialize_Driver("Android");
    }

    @After
    public void after(){
    //    driver.quit();
    }
}
