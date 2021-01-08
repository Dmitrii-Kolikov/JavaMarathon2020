package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    List<User> subscriptions = new ArrayList<>();  //должны храниться те пользователи, на которых подписан пользователь

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {  //подписывает пользователя на пользователя user
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        return subscriptions.contains(user) && user.isSubscribed(this);

    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
        //отправляет сообщение с текстом text пользователю user. Здесь должен использоваться статический метод из MessageDatabase.
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }
}