package com.pageLayer;

import com.TestBase.TestBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends TestBase {

    @FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
    WebElement userName;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText")
    WebElement password;

    @FindBy(xpath = "\t\n" +
            "//android.widget.Button[@content-desc=\"Log in\"]/android.view.ViewGroup")
    WebElement  loginButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Forgot password?\"]/android.view.ViewGroup")
    WebElement forgotPassword;



    @FindBy(xpath="//android.widget.Button[@content-desc=\"Not now\"]/android.view.ViewGroup")
    WebElement notNow;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Skip\"]")
    WebElement skip;

    public LoginPage() {
        //super();
        PageFactory.initElements(driver, this);
    }


    public void forgotPassword()  throws InterruptedException {
        forgotPassword.click();
        Thread.sleep(20000);

    }

    public void login(String username, String passwords)  throws InterruptedException {
        Thread.sleep(2000);
     userName.sendKeys(username);
     Thread.sleep(1000);
     password.sendKeys(passwords);
     Thread.sleep(1000);
     loginButton.click();
     Thread.sleep(10000);
     notNow.click();
     Thread.sleep(20000);
//skip.click();
   //  Thread.sleep(5000);

    }

}
