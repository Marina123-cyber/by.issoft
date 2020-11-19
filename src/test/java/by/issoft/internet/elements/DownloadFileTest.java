package by.issoft.internet.elements;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertNotNull;

public class DownloadFileTest {

    DownloadFilePage downloadFilePage = new DownloadFilePage();
    String fileName = "MY IP.txt";
    String folder = "C:\\Users\\marinatsitova\\Downloads";



    @Test
    public void downloadTest() throws FileNotFoundException {
        open("https://the-internet.herokuapp.com/download");

        SelenideElement fileElement = downloadFilePage.findFile(fileName);
        assertNotNull(fileElement, "The element found is null");
        downloadFilePage.downloadFile(folder, fileElement);
    }
}
