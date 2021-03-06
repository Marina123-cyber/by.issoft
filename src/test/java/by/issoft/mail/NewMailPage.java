package by.issoft.mail;


import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.appears;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class NewMailPage extends BasePage{
    Faker faker = new Faker();
    SelenideElement composeButton = $(".mail-ComposeButton");
    SelenideElement composeWindow = $x("//div[@class = 'ComposePopup-Content']");
    SelenideElement toField = $x("//div[@class='MultipleAddressesDesktop ComposeRecipients-MultipleAddressField tst-field-to']//div[@class='composeYabbles']");
    SelenideElement subjectField = $(By.cssSelector(".composeTextField"));
    SelenideElement enterMailBody = $(".cke_wysiwyg_div");
    SelenideElement sendButton = $(By.cssSelector(".ComposeControlPanelButton-Button_action"));
    SelenideElement sentNotification = $(By.xpath("//div[@class = 'ComposeDoneScreen-Title']"));



    public void createMail(String address, String subject) {
        composeButton.waitUntil(appears, 6000);

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
