package com.company.Library;

import java.io.Serializable;
import java.util.Date;

public class Author implements Serializable {

    private String name;
    private Date birthday;
    private int Id;

    public Author(String name, Date birthday, int Id){
        this.birthday = birthday;
        this.Id = Id;
        this.name = name;
    }

    public Author(){}

    public Author(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String toString(){
        return "{"+"Id: " + Id + "; Initials: " + name +"; Birthday: " + birthday+"}";
    }
}
