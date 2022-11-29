package com.marat.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CodeExistingTests {

    @Test
    void codeExistingCheck() {
        open("https://github.com/");
        $("[name='q']").setValue("Selenide").pressEnter();
        $("[href='/search?q=Selenide&type=wikis']").click();
        $("[title='SoftAssertions']").shouldHave(text("SoftAssertions")).click();
        $("[start='3']").shouldHave(text("Using JUnit5 extend test class:"));
        $(".markdown-body").$$(".highlight").get(4).$$(byTagName("span")).get(4).shouldHave(text("class"));
        $(".markdown-body").$$(".highlight").get(4).$$(byTagName("span")).get(5).shouldHave(text("Tests"));
        $(".markdown-body").$$(".highlight").get(4).$$(byTagName("span")).get(6).shouldHave(text("@"));
        $(".markdown-body").$$(".highlight").get(4).$$(byTagName("span")).get(7).shouldHave(text("Test"));
    }
}
