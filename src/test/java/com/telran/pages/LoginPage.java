package com.telran.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends PageBase{

    private By loginTab = By.xpath("//a[.='LOGIN']");
    private By emailLocator = By.cssSelector("[placeholder='Email']");
    private By passwordLocator = By.cssSelector("[placeholder='Password']");
    private By loginButton = By.xpath("//button[contains(.,'Login')]");
    private By signOutTab = By.xpath("//button[contains(.,'Sign Out')]");
    private By errorLocator = By.cssSelector(".login_login__3EHKB>div");
    public void clickOnLoginTab() {
        $(loginTab).click();
    }


    public void with(String email, String password) {
        $(emailLocator).val(email);
        $(passwordLocator).val(password);
        $(loginButton).click();
    }

    public void validLogin() {
        $(signOutTab).shouldBe(Condition.visible);
      //  screenshot("screenshots/file");
    }

    public void invalidLogin() {
        confirm();
        $(errorLocator).shouldBe(Condition.visible);
        System.out.println($(errorLocator));
    }
}
