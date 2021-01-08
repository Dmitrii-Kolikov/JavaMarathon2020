package day13;

import java.util.Date;

public class Message {
    private User sender;  //отправитель сообщения
    private User receiver;  //получатель сообщения
    private String text;  //текст сообщения
    private Date date = new Date();   //дата отправки сообщения

    //Также, конструктор должен назначать полю date текущее время (то есть время создания объекта Message).
    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "FROM: " + sender.getUserName() +"\n" + "TO: " + receiver.getUserName() + "\n" + "ON: " + date + "\n" + text;
        //*в поле ON должна быть дата создания объекта класса Message
    }
}
