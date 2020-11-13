package by.issoft.mail;


import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.appears;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class NewMailPage {
    Faker faker = new Faker();
    SelenideElement composeButton = $(".mail-ComposeButton");
    SelenideElement composeWindow = $x("//div[@class = 'ComposePopup-Content']");
    SelenideElement toField = $x("//div[@class='MultipleAddressesDesktop ComposeRecipients-MultipleAddressField tst-field-to']//div[@class='composeYabbles']");
    SelenideElement subjectField = $(By.cssSelector(".composeTextField"));
    SelenideElement enterMailBody = $(".cke_wysiwyg_div");
    SelenideElement sendButton = $(By.cssSelector(".ComposeControlPanelButton-Button_action"));
    SelenideElement sentNotification = $(By.xpath("//div[@class = 'ComposeDoneScreen-Title']"));
    SelenideElement avatarButton = $(By.xpath("//a[@href='https://passport.yandex.ru']//img[@src='https://avatars.mds.yandex.net/get-yapic/0/0-0/islands-middle']"));
    SelenideElement logoutButton = $(By.cssSelector(".legouser__menu-item_action_exit"));


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

    public void logout() {

        avatarButton.click();
        logoutButton.click();

    }
}
