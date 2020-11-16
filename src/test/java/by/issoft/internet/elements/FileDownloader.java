package by.issoft.internet.elements;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class FileDownloader {


@Test
    public void downloadTest(){
        open("https://the-internet.herokuapp.com/download");

    SelenideElement file = $x("//a[contains(text(),'fileupload.ts')]");

    file.click();
    }
}
