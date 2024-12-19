package com.testPages;

import com.TestBase.TestBase;
import com.pageLayer.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    public LoginPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() throws Exception {
        initialization();
        loginPage = new LoginPage();

        Thread.sleep(20000);
    }

    @Test
    public void testLogin() throws Exception {

        Thread.sleep(4000);
        loginPage.login(prop.getProperty("userName"), prop.getProperty("passWord"));

    }

   @Test
   public void TestForgotPassword() throws InterruptedException {
       Thread.sleep(5000);

       loginPage.forgotPassword();

   }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();

    }

}
