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
            if (x.getSender() == u1 && x.getReceiver() == u2 ) {
                System.out.println(u1.getUserName() + ": " + x.getText());
            }

            else if (x.getSender() == u2 && x.getReceiver() == u1)
                System.out.println(u2.getUserName() + ": " +  x.getText());
        }
    }
}
