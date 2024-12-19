package com.TestBase;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static AndroidDriver driver;
    public  static Properties prop;
//    public static Logger log = Logger.getLogger(TestBase.class);


    public TestBase() {
        try {

            prop = new Properties();
            FileInputStream ip = new FileInputStream("C:\\Users\\DELL\\IdeaProjects\\AppiumInstaTesting\\src\\main\\java\\com\\configration\\Config.Properties");
            prop.load(ip);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initialization() throws InterruptedException, MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("emulator-5554");
        options.setAppPackage("com.instagram.android");

        options.setAppActivity("com.instagram.mainactivity.LauncherActivity");

        options.setPlatformVersion("9.0");
        options.setPlatformName("Android");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);

        System.out.println("Instagram server Start Automation..............");
        Thread.sleep(2000);

    }



}
