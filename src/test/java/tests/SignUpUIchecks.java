package tests;

import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

public class SignUpUIchecks extends BaseClass {

    @Test
    public void testOne() {

        MobileElement el1 = driver.findElementByAccessibilityId("More languages…");
        el1.click();
        MobileElement el2 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button");
        el2.click();
        MobileElement el3 = driver.findElementByAccessibilityId("No, Create New Facebook Account");
        el3.click();
        MobileElement el4 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button");
        el4.click();
        MobileElement el5 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button[2]");
        el5.click();

        System.out.println("Completed test One...");

    }

}
