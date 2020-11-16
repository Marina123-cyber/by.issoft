package by.issoft.mail;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    SelenideElement avatarButton = $(By.xpath("//a[@href='https://passport.yandex.ru']//img[@src='https://avatars.mds.yandex.net/get-yapic/0/0-0/islands-middle']"));
    SelenideElement logoutButton = $(By.cssSelector(".legouser__menu-item_action_exit"));


    public void logout() {

        avatarButton.click();
        logoutButton.click();

    }

}
