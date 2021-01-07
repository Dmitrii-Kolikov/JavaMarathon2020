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
        for (User x: subscriptions) {
           if (x.getUserName().equals(user.getUserName())) {
                return  true;
            }
        }
        return false;
        //возвращает True, если пользователь подписан на пользователя user и False, если не подписан.
    }

    public boolean isFriend(User user) {
        for (User x: subscriptions) {  //подписки user2
            for (User y: user.getSubscriptions()) {  // подписки user2
                if(y.getUserName().equals(getUserName()) && x.getUserName().equals(user.getUserName()) ) {
                    return true;                                    //user1 подписан на user2 проверяем
                }
            }
        }
        return false;
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(new User (getUserName()), new User(user.getUserName()), text);
        //отправляет сообщение с текстом text пользователю user. Здесь должен использоваться статический метод из MessageDatabase.
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
