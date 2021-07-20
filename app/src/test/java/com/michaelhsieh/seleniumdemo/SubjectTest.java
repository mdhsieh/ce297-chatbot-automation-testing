package com.michaelhsieh.seleniumdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SubjectTest {

    private AndroidDriver driver;

    /**
     * Appium configurations to connect to emulator
     */
    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("deviceName", "5554");
        desiredCapabilities.setCapability("ensureWebviewsHavePages", true);

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    /**
     * Assumes Appium server is running,
     * emulator is running, and
     * English with Andy app is open on emulator.
     *
     * Execute subject test cases.
     *
     */
    @Test
    public void subjectTest() {
        // Questions about subjects user asks chat bot
        String[] inputs = {
                // american food
                "What is your favorite American lunch food?",
                // burger
                "What is burger?",
                "What kinds of burger have you eaten?",
                "Do you like California cheeseburger?",
                "Have you eaten California cheeseburger?",
                // pizza
                "What is pizza?",
                "What kinds of pizza have you eaten?",
                "Do you like New York pepperoni pizza?",
                "Have you eaten New York pepperoni pizza?",
                // fruit
                "What is your favorite fruit?",
                // apple
                "What is apple?",
                "What kinds of apple have you eaten?",
                "Do you like California fuji apples?",
                "Have you eaten fuji apples?",
                // kiwi
                "What is kiwi?",
                "What kinds of kiwi have you eaten?",
                "Do you like Hawaiian green kiwis?",
                "Have you eaten Hawaiian green kiwis?",
                // mango
                "What is mango?",
                "What kinds of mango have you eaten?",
                "Do you like Hawaiian yellow mangoes?",
                "Have you eaten Hawaiian yellow mangoes?",
                // orange
                "What is orange?",
                "What kinds of orange have you eaten?",
                "Do you like California sweet oranges?",
                "Have you eaten California sweet oranges?",
                // movie
                "Are there any recent movies you watched?",
                "What is your favorite movie genre?",
                "What is your favorite movie?",
                // The Walk
                "Have you watched the movie \"The Walk\"?",
                "Do you like the movie \"The Walk\"?",
                "Tell me about the movie \"The Walk\".",
                // Ex Machina
                "Have you watched the movie \"Ex Machina\"?",
                "Do you like the movie \"Ex Machina\"?",
                "Tell me about the movie \"Ex Machina\".",
                // Limitess
                "Have you watched the movie \"Limitless\"?",
                "Do you like the movie \"Limitless\"?",
                "Tell me about the movie \"Limitless\".",
                // music
                "What is your favorite music?",
                "What is your favorite music genre?",
                "Who is your favorite music artist?",
                "What is your favorite song?",
                // Requiem by Mozart
                "Have you listened to the song \"Requiem\" by Mozart?",
                "Why do you like the song \"Requiem\" by Mozart?",
                "Tell me about the song \"Requiem\" by Mozart.",
                // Imagine by John Lennon
                "Have you listened to the song \"Imagine\" by John Lennon?",
                "Why do you like the song \"Imagine\" by John Lennon?",
                "Tell me about the song \"Imagine\" by John Lennon.",
                // Personal
                "How's your day?",
                "What do you do?",
                "Where do you work?",
        };

        // Find opened Andy app window and click to access chat input box
        MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView");
        el1.click();

        MobileElement el2;
        MobileElement el3;
        // focus on chat input box. type questions about subject
        // then click send button
        for (int i = 0; i < inputs.length; i++) {
            el2 = (MobileElement) driver.findElementByAccessibilityId("Type a message...");
            el2.click();
            el2.sendKeys(inputs[i]);
            el3 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"send\"]/android.widget.TextView");
            el3.click();
        }
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}