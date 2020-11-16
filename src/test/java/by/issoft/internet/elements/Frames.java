package by.issoft.internet.elements;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class Frames {

    @Test
    public void framesTest(){

        open("https://the-internet.herokuapp.com/frames");
    }
}
