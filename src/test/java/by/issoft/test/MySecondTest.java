package by.issoft.test;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;


public class MySecondTest {

    @BeforeMethod
    protected void beforeTestPrecondition() {
        System.out.println("Welcome to e-dostavka online store! ");
    }



    @Test(dataProvider = "inputProductPrice", dataProviderClass = StoreInputData.class)

    public void eDostavka(String expectedPrice, String productName) {


        open("https://e-dostavka.by/");

        String searchLocator = "//div[@class='main_menu__inner']//i[@class='fa fa-search']";

        $(By.xpath(searchLocator)).click();


        $(By.xpath("//input[@id='searchtext']")).setValue(productName);


        $(By.xpath(searchLocator)).click();


        $(By.xpath("//a[.='" + productName + "']")).click();

        String actualPriceLocator = "//ul[@class = \"description\"]/li[last()]/span";

        String actualPrice = $(By.xpath(actualPriceLocator)).getText();

        Assert.assertEquals(expectedPrice, actualPrice,"The price is different from expected");

        System.out.println("-------------The price is correct!");


    }
}