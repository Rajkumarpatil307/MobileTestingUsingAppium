package com.pageLayer;

import com.TestBase.TestBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//android.widget.FrameLayout[@content-desc=\"Home\"]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")
    WebElement home;


    @FindBy (xpath="//android.widget.FrameLayout[@content-desc=\"Reels\"]/android.widget.ImageView\n")
    WebElement reels;

    @FindBy (xpath="//android.widget.FrameLayout[@content-desc=\"Profile\"]/android.view.ViewGroup\n")
    WebElement   profile;

    @FindBy (xpath ="//android.widget.FrameLayout[@content-desc=\"Search and explore\"]/android.widget.ImageView\n")
    WebElement search;


    public void  getHomePage() throws InterruptedException {
        home.click();
        Thread.sleep(4000);

    }

    public void  getReels() throws InterruptedException {
        reels.click();
        Thread.sleep(4000);

    }


    public void getProfile() throws InterruptedException {
        profile.click();
        Thread.sleep(4000);
    }
    public void getSearch() throws InterruptedException {
        search.click();
        Thread.sleep(4000);
    }
}
