package com.michaelhsieh.seleniumdemo;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SampleTest {

    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("deviceName", "5554");
        desiredCapabilities.setCapability("ensureWebviewsHavePages", true);

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void sampleTest() {
//        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Andy");
//        el1.click();
        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Type a message...");
        el4.click();
        el4.sendKeys("Hello");
        MobileElement el5 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"send\"]/android.widget.TextView");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("Type a message...");
        el6.click();
        el6.sendKeys("My name is Michael");
        MobileElement el7 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"send\"]/android.widget.TextView");
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("Type a message...");
        el8.sendKeys("What is your favorite movie?");
        MobileElement el9 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"send\"]/android.widget.TextView");
        el9.click();

        MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("Type a message...");
        el10.sendKeys("No i have not");
        MobileElement el11 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"send\"]/android.widget.TextView");
        el11.click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}