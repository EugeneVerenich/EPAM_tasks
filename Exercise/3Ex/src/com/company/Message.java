package com.company;

import java.awt.*;
import java.io.Serializable;

public class Message implements Serializable {

    private final TrayIcon.MessageType type;
    private final String data;

    public Message(TrayIcon.MessageType type){
        this.type = type;
        data = null;
    }

    public Message(TrayIcon.MessageType type, String data){
        this.type = type;
        this.data = data;
    }

    public TrayIcon.MessageType getType(){
        return type;
    }

    public String getData(){
        return data;
    }

}
