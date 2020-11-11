package by.issoft.mail;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MailDataProvider {

    public static EmailData getEmailData() throws IOException {

        Path path = Paths.get("src/test/resources/mailCreds.json");
        String fileContent = new String(Files.readAllBytes(path));

        ObjectMapper mapper = new ObjectMapper();
        EmailData emailData = mapper.readValue(fileContent, EmailData.class);

        return emailData;


    }
    @DataProvider
    public Object[][] sender() throws IOException {

        EmailData emailData = getEmailData();

        Object[][] loginData = new Object[1][2];
        loginData[0][0] = emailData.getUsername();
        loginData[0][1] = emailData.getPassword();

        return loginData;

    }
    @DataProvider
    public Object[][] message() throws IOException {

        EmailData emailData = getEmailData();
        Object[][] messageData = new Object[emailData.getMessage().size()][1];
        for (int i = 0; i < emailData.getMessage().size(); i++) {
            Message m = (Message) emailData.getMessage().get(i);
            messageData[i][0] = m;
        }

        return messageData;
    }
}