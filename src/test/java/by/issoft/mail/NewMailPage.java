package by.issoft.mail;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NewMailPage {
    SelenideElement composeButton = $(By.xpath("//a[@class = 'mail-ComposeButton js-main-action-compose']"));
    String toField = "div.tst-field-to .composeYabbles";
    String subjectField = "[name='subject']";
    SelenideElement sendButton = $(By.cssSelector(".ComposeControlPanelButton-Button_action"));

public void createMail(String address, String subject){
    composeButton.click();
    $(By.cssSelector(toField)).setValue(address);
    $(By.cssSelector(subjectField)).setValue(subject);
    Configuration.timeout = 6000;
    sendButton.click();
}

}
