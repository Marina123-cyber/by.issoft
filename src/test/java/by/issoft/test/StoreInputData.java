package by.issoft.test;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class StoreInputData {

    @DataProvider
    public Object[][] inputProductPrice() {

        Object[][] data = new Object[2][2];

        data[0][0] = "7.95";
        data[0][1] = "Конфеты «Сорванец» 200 г.";


        data[1][0] = "52.2";;
        data[1][1] = "Кофе молотый «Dallmayr» classic, 250 г.";


        return data;
    }

}

