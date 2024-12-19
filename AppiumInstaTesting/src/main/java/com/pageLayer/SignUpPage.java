package com.pageLayer;

import com.TestBase.TestBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends TestBase {
     @FindBy(xpath="\t\n" +
             "//android.widget.Button[@content-desc=\"Create new account\"]/android.view.ViewGroup")
     WebElement createAccount;

    @FindBy(xpath="\t\n" +
            "//android.view.View[@content-desc=\"Sign up with email\"]")
    WebElement signUpEmail;


    @FindBy(xpath="\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
     WebElement email;

    @FindBy(xpath="//android.widget.Button[@content-desc=\"Next\"]/android.view.ViewGroup")
    WebElement nextButton;




    public SignUpPage(){

        PageFactory.initElements(driver, this);
    }




    public void signUpEmail() throws InterruptedException {
        Thread.sleep(30000);
        createAccount.click();
        Thread.sleep(10000);
        signUpEmail.click();
        Thread.sleep(20000);
        email.sendKeys(prop.getProperty("email"));
        Thread.sleep(20000);
        nextButton.click();
        Thread.sleep(10000);







    }

}
