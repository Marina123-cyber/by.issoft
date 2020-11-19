package by.issoft.internet.elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DropdownPage {

SelenideElement dropdownField = $(By.id("dropdown"));
SelenideElement selectedElement = $(By.xpath("//select[@id='dropdown']//@selected"));

public List<String> getDropdownOptions(){

    List<String> result = new ArrayList<>();

    ElementsCollection dropdownList = $$(By.xpath("//select[@id='dropdown']/*"));

    for(SelenideElement dropdownValues : dropdownList){
        result.add(dropdownValues.getText());
    }
    return result;
}

public String selectInDropdown(String options){
    dropdownField.selectOptionContainingText(options);
    return selectedElement.getText();
}
}
