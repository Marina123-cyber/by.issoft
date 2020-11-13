package by.issoft.mail;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import static com.codeborne.selenide.Selenide.open;

public class MailBoxTest {
    LoginPage loginPage = new LoginPage();
    NewMailPage newMailPage = new NewMailPage();


    @AfterMethod
    protected void logoutFromPage(){
        newMailPage.logout();
    }


    @BeforeMethod
    public void login(){
        open("https://mail.tut.by/");
        loginPage.login("greedypanda", "GreedyP@nd@");
    }

//    @Test(dataProvider = "sender", dataProviderClass = MailDataProvider.class)
//
//    public void loginTest(String username, String password) {
//
//
//        open("https://mail.tut.by/");
//
//        loginPage.login(username, password);
//        softAssert.assertTrue(loginPage.loginSuccessful());
//
//
//    }

    @Test(dataProvider = "message", dataProviderClass = MailDataProvider.class)

    public void sendMessageTest(Message message) {

        newMailPage.createMail(message.getAddress(), message.getSubject());
        Assert.assertTrue(newMailPage.letterIsSent());


    }


}
