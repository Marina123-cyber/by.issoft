package by.issoft.internet.elements;


import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.appears;
import static com.codeborne.selenide.Selenide.*;


public class Dropdown {

    @Test
    public void dropdownTest(){
        open("https://the-internet.herokuapp.com/dropdown");
        SelenideElement dropdownField = $x("//select[@id='dropdown']");
        SelenideElement selectedOption = $x("//option[@value = '1']");

        dropdownField.waitUntil(appears,10000);
        dropdownField.click();
        selectedOption.waitUntil(appears,10000);
        selectedOption.click();

        System.out.println("-----");
    }


}
