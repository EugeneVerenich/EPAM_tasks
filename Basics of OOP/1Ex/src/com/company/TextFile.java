/*
Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.
 */
package com.company;

import java.util.Scanner;

public class TextFile {
    private File file;
    private Directory directory;
    private String text;

    public TextFile(File file, Directory directory){
        this.file = file;
        this.directory = directory;

        System.out.println("Введите текст : ");
        Scanner in = new Scanner(System.in);
        text = in.nextLine();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDirectory() {
        return directory.getPath();
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    public String getFile() {
        return file.getFile_name() + file.getFile_type();
    }

    public void setFile(String file) {
        this.file.setFile_name(file);
    }

    // переименовать файл
    public void rename(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите новое имя файла : ");
        setFile(in.next());
    }

    // вывод на консоль содержимого
    public void showInfo(){
        try{
        System.out.println("ПУТЬ : " + getDirectory() + "\n" + "ФАЙЛ : " + getFile() + "\n" + text);
        }catch (NullPointerException ex){
            System.out.println("Файл удален!!!");
        }
    }

    // добавление элемента
    public void add(){
        Scanner in = new Scanner(System.in);
        System.out.println("ПУТЬ : " + getDirectory() + "\n" + "ФАЙЛ : " + getFile() + "\n" + text);
        System.out.println("Введите текст : ");
        text += in.nextLine();
    }

    // удаление файла
    public void delete(){
        setFile(null);
        setText(null);
        setDirectory(null);
    }
}
