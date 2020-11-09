package by.issoft.mail;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    String userNameField = "//input[@id='Username']";
    String passwordField = "//input[@id='Password']";
    SelenideElement enterButton = $(By.xpath("//div[@class = 'wrap loginWrap']//input[@class='button loginButton gradientforbutton']"));

    public void login(String username, String password){
        $x(userNameField).setValue("username");
        $x(passwordField).setValue("password");
        enterButton.click();
        Configuration.timeout = 6000;
    }
}
