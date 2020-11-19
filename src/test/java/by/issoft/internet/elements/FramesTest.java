package by.issoft.internet.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.appears;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class FramesTest {
    SelenideElement iFrameLink = $x("//a[.='iFrame']");
    SelenideElement tinyMCEokButton = $x("//button[.='Ok']");
    SelenideElement iFrameInputField = $x("//iframe[@id='mce_0_ifr']");

    @Test
    public void framesTest(){

        open("https://the-internet.herokuapp.com/frames");
        iFrameLink.waitUntil(appears,5000);
        iFrameLink.click();
        tinyMCEokButton.click();
        iFrameInputField.setValue("Hello!");

        System.out.println("--++--");




    }
}
