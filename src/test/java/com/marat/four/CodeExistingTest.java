package com.marat.four;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CodeExistingTest {

    @Test
    void codeExistingCheck() {
        open("https://github.com/");
        $(byAttribute("name", "q")).setValue("Selenide").pressEnter();
        $(byAttribute("href", "/search?q=Selenide&type=wikis")).click();
        $(byAttribute("href", "/YuriKopshev/selenide/wiki/SoftAssertions")).shouldHave(text("SoftAssertions")).click();
        $(byAttribute("start", "3")).shouldHave(text("Using JUnit5 extend test class:"));
        $(".markdown-body")
                .$$(".highlight").get(4)
                .$("pre")
                .$(byTagName("span")).shouldHave(text("@"))
                .sibling(0).shouldHave(text("ExtendWith"))
                .sibling(0).shouldHave(text("SoftAssertsExtension"))
                .sibling(0).shouldHave(text("class"))
                .sibling(0).shouldHave(text("class"))
                .sibling(0).shouldHave(text("Tests"))
                .sibling(0).shouldHave(text("@"))
                .sibling(0).shouldHave(text("Test"))
                .sibling(0).shouldHave(text("void"))
                .sibling(0).shouldHave(text("test"))
                .sibling(0).shouldHave(text("Configuration"))
                .sibling(0).shouldHave(text("assertionMode"))
                .sibling(0).shouldHave(text("SOFT"))
                .sibling(0).shouldHave(text("open"))
                .sibling(0).shouldHave(text("\"page.html\""))
                .sibling(0).shouldHave(text("$"))
                .sibling(0).shouldHave(text("\"#first\""))
                .sibling(0).shouldHave(text("should"))
                .sibling(0).shouldHave(text("visible"))
                .sibling(0).shouldHave(text("click"))
                .sibling(0).shouldHave(text("$"))
                .sibling(0).shouldHave(text("\"#second\""))
                .sibling(0).shouldHave(text("should"))
                .sibling(0).shouldHave(text("visible"))
                .sibling(0).shouldHave(text("click"));
    }
}
