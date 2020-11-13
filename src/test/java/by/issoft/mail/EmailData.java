package by.issoft.mail;

import lombok.Data;

import java.util.List;

@Data
public class EmailData {
    String username;
    String password;
    List<Message> message;



}
