package com.testPages;

import com.TestBase.TestBase;
import com.pageLayer.HomePage;
import com.pageLayer.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class HomePageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    @BeforeMethod
    public void setup() throws InterruptedException, MalformedURLException {

        initialization();
        loginPage = new LoginPage();
        homePage = new HomePage();
        loginPage.login(prop.getProperty("userName"), prop.getProperty("passWord"));
        Thread.sleep(7000);


    }


    @Test
    public void homePageTest() throws InterruptedException {
        Thread.sleep(5000);

        homePage.getHomePage();

    }
    @Test
    public void reelsTest() throws InterruptedException {
        Thread.sleep(5000);
        homePage.getReels();

    }
    @Test
    public void profileTest() throws InterruptedException {
        Thread.sleep(5000);

        homePage.getProfile();

    }
    @Test
    public void searchTest() throws InterruptedException {
        Thread.sleep(5000);
        homePage.getSearch();
    }




    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();

    }
}
