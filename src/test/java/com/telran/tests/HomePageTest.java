package com.telran.tests;

import com.telran.pages.HomePage;
import org.junit.Before;
import org.junit.Test;

public class HomePageTest {

    HomePage home;

    @Before
    public void setUp(){
        home = new HomePage();
    }

    @Test
    public void getHomePage(){
        home.isHomeComponentPresent();
    }
}
