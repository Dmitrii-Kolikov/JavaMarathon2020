package day13;

public class Task1 {
    public static void main(String[] args) {
        User user3 = new User("Dmitrii");
        User user4 = new User("Nina");
        user3.sendMessage(user4, "Hello!");
        user3.sendMessage(user4, "How are you?");
        MessageDatabase.showDialog(user3, user4);
        user4.sendMessage(user3, "Hello. i'm fine and you?");
        MessageDatabase.showDialog(user4, user3);

        Message message = new Message(user3, user4, "I'm also OK. \n" +
                "Let's meet today?");
        System.out.println(message);
    }
}
