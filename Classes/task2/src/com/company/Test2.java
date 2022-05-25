package com.company;

public class Test2 {

    private String first_name;
    private int age;

    public Test2(){}

    public Test2(String first_name, int age){
        this.first_name = first_name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
}
