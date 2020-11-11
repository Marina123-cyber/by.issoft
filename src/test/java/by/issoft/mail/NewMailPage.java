package by.issoft.mail;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.appears;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class NewMailPage {
    Faker faker = new Faker();
    SelenideElement composeButton = $x("//span[@class='mail-ComposeButton-Text']");
    SelenideElement composeWindow = $x("//div[@class = 'ComposePopup-Content']");
    SelenideElement toField = $(By.cssSelector("div.tst-field-to .composeYabbles"));
    SelenideElement subjectField = $(By.cssSelector("[name='subject']"));
    SelenideElement enterMailBody = $(By.xpath("//div[contains(@class, 'cke_wysiwyg_div cke_reset cke_enable_context_menu')]"));
    SelenideElement sendButton = $(By.cssSelector(".ComposeControlPanelButton-Button_action"));
    SelenideElement sentNotification = $(By.xpath("//div[@class = 'ComposeDoneScreen-Title']"));



    public void createMail(String address, String subject) {
        composeButton.click();

        composeWindow.waitUntil(appears, 7000);

        toField.setValue(address);

        subjectField.setValue(subject);

        enterMailBody.setValue(faker.dog().breed());

        sendButton.click();

    }

    public boolean letterIsSent() {
        return sentNotification.isDisplayed();
    }
}
