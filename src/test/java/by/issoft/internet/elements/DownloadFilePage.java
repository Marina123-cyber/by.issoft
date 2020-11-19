package by.issoft.internet.elements;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$$;

public class DownloadFilePage {

    public SelenideElement findFile(String fileName){
        ElementsCollection filesAll = $$(By.xpath("//div[@class='example']/*"));
        for(SelenideElement filesList : filesAll){
            String fileFromList = filesList.getText();
            if (fileFromList.equals(fileName)){
                SelenideElement foundFile = filesList;
                return foundFile;
            }
        }
        return null;
    }

    public boolean downloadFile(String folder, SelenideElement foundFile) throws FileNotFoundException {
        Configuration.reportsFolder = folder;
        File downloadedFile = foundFile.download(3000);
        System.out.println(downloadedFile.getAbsolutePath());
        return downloadedFile.exists() && downloadedFile.length()>0;

    }
}
