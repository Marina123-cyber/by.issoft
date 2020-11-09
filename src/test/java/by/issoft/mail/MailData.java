package by.issoft.mail;

import org.testng.annotations.DataProvider;

public class MailData {

    @DataProvider

    public Object[][] inputMailData() {
        Object[][] data = new Object[1][4];

        data[0][0] = "greedypanda";
        data[0][1] = "GreedyP@nd@";
        data[0][2] = "greedypanda@tut.by";
        data[0][3] = "abracadabra";

        return data;

    }
}
