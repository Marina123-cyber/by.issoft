package by.issoft.internet.elements;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.appears;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class KeyPresses {


    @Test(dataProvider = "entry", dataProviderClass = ValuesDataProvider.class)
    public void keyPressTest(String value){

        open("https://the-internet.herokuapp.com/key_presses");
        SelenideElement enterField = $("#target");

        enterField.waitUntil(appears, 5000);
        enterField.setValue(value);



        System.out.println("---+++---");


    }
}
