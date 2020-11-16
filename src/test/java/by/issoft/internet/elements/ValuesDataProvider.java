package by.issoft.internet.elements;

import by.issoft.mail.Message;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ValuesDataProvider {

    public static Values getValues() throws IOException{

        Path path = Paths.get("src/test/resources/enterValues.json");
        String fileContent = new String(Files.readAllBytes(path));

        ObjectMapper mapper = new ObjectMapper();
        Values values = mapper.readValue(fileContent, Values.class);
        return values;
    }

    @DataProvider

    public Object[][] entry() throws IOException{

        Values values = getValues();
        Object[][] entryData = new Object[1][1];
        entryData[0][0]= values.getValue();

        return entryData;
    }
}
