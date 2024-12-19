package com.testPages;

import com.TestBase.TestBase;
import com.pageLayer.HomePage;
import com.pageLayer.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpPageTest extends TestBase {
    SignUpPage signUpPage;
    HomePage homePage;


    @BeforeMethod
    public void setUp() throws Exception {
        initialization();
        signUpPage = new SignUpPage();
    }





    @Test
    public void signUpTest() throws InterruptedException {
        Thread.sleep(20000);

        signUpPage.signUpEmail();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        Thread.sleep(6000);
        driver.quit();
    }


}
