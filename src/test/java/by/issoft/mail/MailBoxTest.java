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

    @Test(dataProvider = "inputMailData", dataProviderClass = MailDataProvider.class)

    public void mail(String username, String password, String address, String subject) {


        open("https://mail.tut.by/");
        loginPage.login(username, password);
        newMailPage.waitUntil(appears, 7000);
        Assert.assertTrue(loginPage.loginSuccessful());


        newMailPage.createMail(address, subject);
        Assert.assertTrue(newMailPage.letterIsSent());

    }

}
