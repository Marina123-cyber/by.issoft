package by.issoft.mail;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class MailBox {


LoginPage loginPage = new LoginPage();
NewMailPage newMailPage = new NewMailPage();

    @Test(dataProvider = "inputMailData", dataProviderClass = MailData.class)

    public void mail(String username, String password, String address, String subject) {


        open("https://mail.tut.by/");
        loginPage.login(username, password);

        newMailPage.createMail(address, subject);


        SelenideElement inboxTab = $(By.xpath("//a[contains(@class, 'ns-view-folder ns-view-id-50')]"));
        inboxTab.click();

        String receivedEmailLocator = "//div[contains(@class, 'ns-view-messages ns-view-id-73')]//div[contains(@class, 'ns-view-messages-item-wrap ns-view-id-201')]";

        String receivedEmailSubject = $(By.xpath(receivedEmailLocator)).getText();


        Assert.assertEquals(subject, receivedEmailSubject, "Email with given subject is not found");
        System.out.println(22);
    }


    }

