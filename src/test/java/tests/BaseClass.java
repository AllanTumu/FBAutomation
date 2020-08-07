package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URL;

public class BaseClass {

    //Create an Appium Driver Variable
    AppiumDriver<MobileElement> driver;

    //Things to run before the test
    @BeforeTest
    public void setup() {

        try {

            //Set the Desired Capabilities

            DesiredCapabilities caps = new DesiredCapabilities();

            //caps.setCapability("platformName","ANDROID");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Mea");
            caps.setCapability(MobileCapabilityType.UDID, "053332504L002607");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
            caps.setCapability(MobileCapabilityType.APP, "");
            caps.setCapability("appPackage", "com.facebook.katana");
            caps.setCapability("appActivity", ".LoginActivity");
            //caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
            //This is for Web Applications

            URL url = new URL("http://127.0.0.1:4723/wd/hub");

            driver = new AppiumDriver<MobileElement>(url,caps);
            //driver = new AndroidDriver<MobileElement>(url,caps);

        } catch (Exception exp) {
            System.out.println("Caused by : " +exp.getCause());
            System.out.println("Message is :" +exp.getMessage());
            exp.printStackTrace();
        }

    }

    @Test
    public void SampleTest() {
        System.out.println("I am inside Sample Test");
    }

    //Things to run after the test
    @AfterSuite
    public void teardown() {

        driver.close();
        driver.quit();

    }
}
