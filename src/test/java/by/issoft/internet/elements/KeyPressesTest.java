package by.issoft.internet.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.appears;
import static com.codeborne.selenide.Selenide.*;

public class KeyPressesTest {

    SelenideElement inputField = $("#target");
    SelenideElement resultMessage = $x("//p[@id='result']");


    @Test

    public void keyPressTest() {
        open("https://the-internet.herokuapp.com/key_presses");
        String enteredSymbols = "45fr3";
        inputField.waitUntil(appears, 5000);
        inputField.setValue(enteredSymbols);
        String lastSymbol = enteredSymbols.substring(enteredSymbols.length()-1);
        System.out.println("The last entered symbol is " + lastSymbol);
        resultMessage.shouldHave(Condition.exactText("You entered :" + lastSymbol));

    }


}
