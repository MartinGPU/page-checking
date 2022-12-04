package com.marat.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class DragAndDropFrameTests {

    @Test
    public void dragNDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        sleep(2000);
        $("#column-b").$(byTagName("header")).shouldHave(Condition.text("A"));
    }
}
