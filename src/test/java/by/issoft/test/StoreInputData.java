package by.issoft.test;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class StoreInputData {

    @DataProvider
    public Object[][] inputProductPrice() {
        Object[][] data = new Object[2][3];

        data[0][0] = "54.2";
        data[0][1] = $(By.xpath("//span[.='54.2']"));
        data[0][2] = "Кофе молотый «Dallmayr» classic, 250 г.";


        data[1][0] = "8.95";
        data[1][1] = $(By.xpath("//span[.='8.95']"));
        data[1][2] = "Конфеты «Сорванец» 200 г.";

//        data[0][1] = $(By.xpath("//span[.='6.33']"));
//        data[1][1] = "6.33";

        return new Object[][]{
                {"54.2"}, {"8.95"}, {"Кофе молотый «Dallmayr» classic, 250 г."}
        };
    }
}