package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    public static List<Message> messages = new ArrayList<>();

    public static List<Message> getMessages() {
        return  messages;
    }

    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
        //возвращает список всех сообщений в “базе данных”.
    }

    public static void showDialog(User u1, User u2) {
        for (Message x: messages) {
            if (x.getSender().getUserName().equals(u1.getUserName()))
            System.out.println(u1.getUserName() + ": " +  x.getText());
            else
            System.out.println(u2.getUserName() + ": " +  x.getText());
        }
    }
}
