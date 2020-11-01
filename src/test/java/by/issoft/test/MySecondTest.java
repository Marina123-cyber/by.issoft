package by.issoft.test;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class MySecondTest {
    @Test
    public void userCanLoginByUsername() {
        open("https://e-dostavka.by/");

        $x("//body/div[@id='body']/div[1]/div[3]/div[2]/div[1]/nav[1]/ul[1]/li[9]/a[1]/i[1]").click();
        $x("//input[@id='searchtext']").setValue("Кофе молотый «Dallmayr» classic, 250 г.");
        $x("//body/div[@id='body']/div[1]/div[3]/div[2]/div[1]/nav[1]/ul[1]/li[9]/a[1]/i[1]").click();
        $x("//body/div[@id='body']/div[1]/div[3]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]").click();

        String price = $x("//span[contains(text(),'54.2')]").getText();


        System.out.println("Цена за кг. : " + price);
        System.out.println("-------------");





        //ystem.out.println(--------------------);


    }
}
