package com.company;

import java.util.Scanner;

public class Directory {

    private String path;

    public Directory(String path){
        this.path = path;
    }

    public Directory(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите путь к файлу через '/' : ");
        path = in.next();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
