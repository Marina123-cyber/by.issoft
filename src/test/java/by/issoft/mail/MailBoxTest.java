package by.issoft.mail;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Condition.appears;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MailBoxTest {
    LoginPage loginPage = new LoginPage();
    NewMailPage newMailPage = new NewMailPage();

    @Test(dataProvider = "sender", dataProviderClass = MailDataProvider.class)

    public void loginTest(String username, String password) {


        open("https://mail.tut.by/");

        loginPage.login(username, password);
        Assert.assertTrue(loginPage.loginSuccessful());


    }

    @Test(dataProvider = "message", dataProviderClass = MailDataProvider.class)

    public void sendMessageTest(String address, String subject) {

        newMailPage.createMail(address, subject);

        Assert.assertTrue(newMailPage.letterIsSent());

    }

}
