package com.mobileApiumTesting;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculator_EmulatorVirtual {

        public AndroidDriver driver;

        @BeforeMethod
        public void setUp() throws MalformedURLException {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("appium:deviceName", "emulator-5554");
            capabilities.setCapability("appium:appPackage", "com.android.calculator2");
            capabilities.setCapability("appium:appActivity", "com.android.calculator2.Calculator");
            capabilities.setCapability("appium:platformVersion", "9.0");
            capabilities.setCapability("platformName", "Android");
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            System.out.println("Start Automation..............");
        }

        @Test
        public void testCalPlus() {
            WebElement two = driver.findElement(By.id("digit_2"));
            two.click();
            WebElement plus = driver.findElement(By.id("op_add"));
            plus.click();
            WebElement four = driver.findElement(By.id("digit_4"));
            four.click();
            WebElement equalTo = driver.findElement(By.id("eq"));
            equalTo.click();
            WebElement results = driver.findElement(By.id("result"));
            String actualResult = results.getText();
            System.out.println("Actual Result: " + actualResult);

            // Verify the result
            Assert.assertEquals(actualResult, "6", "Calculation result is incorrect!");
        }



    @Test
    public void testCalsub() {
        WebElement two = driver.findElement(By.id("digit_4"));
        two.click();
        two.click();

        WebElement plus = driver.findElement(By.id("op_add"));
        plus.click();


        WebElement four = driver.findElement(By.id("digit_2"));
        four.click();
        four.click();
        WebElement equalTo = driver.findElement(By.id("eq"));
        equalTo.click();
        WebElement results = driver.findElement(By.id("result"));
        String actualResult = results.getText();
        System.out.println("Actual Result: " + actualResult);

        // Verify the result
        Assert.assertEquals(actualResult, "2", "Calculation result is incorrect!");
    }

    @Test
    public void testCalmul() {
        WebElement two = driver.findElement(By.id("digit_2"));
        two.click();
        two.click();

        WebElement plus = driver.findElement(By.id("op_mul"));
        plus.click();


        WebElement four = driver.findElement(By.id("digit_4"));
        four.click();
        four.click();
        WebElement equalTo = driver.findElement(By.id("eq"));
        equalTo.click();
        WebElement results = driver.findElement(By.id("result"));
        String actualResult = results.getText();
        System.out.println("Actual Result: " + actualResult);

        // Verify the result
        Assert.assertEquals(actualResult, "8", "Calculation result is incorrect!");
    }
    @Test
    public void testCaldiv() {
        WebElement two = driver.findElement(By.id("digit_2"));
        two.click();
        two.click();

        WebElement plus = driver.findElement(By.id("op_div"));
        plus.click();


        WebElement four = driver.findElement(By.id("digit_4"));
        four.click();
        four.click();
        WebElement equalTo = driver.findElement(By.id("eq"));
        equalTo.click();
        WebElement results = driver.findElement(By.id("result"));
        String actualResult = results.getText();
        System.out.println("Actual Result: " + actualResult);

        // Verify the result
        Assert.assertEquals(actualResult, "0.5", "Calculation result is incorrect!");
    }
        @AfterMethod
      public void tearDown() {
            driver.quit();
        }




}
