package com.telran.pages;

import static com.codeborne.selenide.Selenide.open;

public class PageBase {
    public PageBase() {
        open("https://contacts-app.tobbymarshall815.vercel.app");
    }
}
