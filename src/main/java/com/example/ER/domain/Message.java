package com.example.ER.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique=true)
    private long id;
    private long sender;
    private long recipient;
    private Date date;
    private String text;
    //TODO: add files as adding

    public Message(){
    }

    public Message(long sender, long recipient, Date date, String text){
        this.sender = sender;
        this.recipient = recipient;
        this.date = date;
        this.text = text;
    }

    public long getSender() {
        return sender;
    }

    public long getRecipient() {
        return recipient;
    }

    public Date getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", sender=" + sender +
                ", recipient=" + recipient +
                ", date=" + date +
                ", text='" + text + '\'' +
                '}';
    }
}
