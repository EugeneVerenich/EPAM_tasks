package com.company.Library;

public class Publisher {

    private String name;
    private int Id;

    public Publisher(String name, int Id){
        this.Id = Id;
        this.name = name;
    }

    public Publisher(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String toString(){
        return "{Id: "+Id +"; Name: " + name+"}";
    }
}
