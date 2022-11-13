package com.telran.tests;

import com.telran.pages.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginTest {

    LoginPage login;

    @Before
    public void setUp(){
        login = new LoginPage();
    }

    @Test
    public void loginPositiveTest(){
        login.clickOnLoginTab();
        login.with("monketester13@gmail.com", "1q2W3e4R_");
        login.validLogin();
    }

    @Test
    public void loginNegativeTest(){
        login.clickOnLoginTab();
        login.with("monketester13@gmail.com", "1q2W3e4r");
        login.invalidLogin();
    }
}
