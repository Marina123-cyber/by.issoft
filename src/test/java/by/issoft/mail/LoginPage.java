package by.issoft.mail;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.appears;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    SelenideElement userNameField = $(By.xpath("//input[@id='Username']"));
    SelenideElement passwordField = $(By.xpath("//input[@id='Password']"));
    SelenideElement enterButton = $(By.xpath("//div[@class = 'wrap loginWrap']//input[@class='button loginButton gradientforbutton']"));
    SelenideElement mailPage = $(By.xpath("//div[@id='js-mail-app']"));

    public void login(String username, String password) {
        userNameField.setValue(username);
        passwordField.waitUntil(appears, 4000);

        passwordField.setValue(password);
        enterButton.click();

    }

    public boolean loginSuccessful() {
        return mailPage.isDisplayed();
    }
}
