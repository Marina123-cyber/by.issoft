package by.issoft.internet.elements;


import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static com.codeborne.selenide.Condition.appears;
import static com.codeborne.selenide.Selenide.*;


public class DropdownTest {

    DropdownPage dropdownPage = new DropdownPage();
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void dropdownDefaultTest(){
        open("https://the-internet.herokuapp.com/dropdown");
        List<String> ddAllOptions = dropdownPage.getDropdownOptions();
        softAssert.assertTrue(ddAllOptions.contains("Please select an option"), "There is no such option");
        softAssert.assertTrue(ddAllOptions.contains("Option1"), "There is no such option");
        softAssert.assertTrue(ddAllOptions.contains("Option2"), "There is no such option");
        softAssert.assertAll();

    }

@Test

    public void selectValue(){
    open("https://the-internet.herokuapp.com/dropdown");
    Assert.assertEquals(dropdownPage.selectInDropdown("Option1"), "Option1", "No such value found");
}
}
