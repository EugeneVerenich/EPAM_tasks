package com.company;

import java.util.Scanner;

public class BooksBase {

    private Book[] books;
    private int size;
    private int capacity;

    public BooksBase(int capacity){
        size = 0;
        this.capacity = capacity;
        books = new Book[capacity];
    }

    // запись клиента
    public void addBook(Book book) {
        if (size < capacity) {
            books[size] = book;
            books[size].setId(size);
            size++;
        } else {
            Book[] buffer = new Book[capacity * 2];
            for (int i = 0; i < size; ++i) {
                buffer[i] = books[i];
            }
            books = buffer;
            capacity = capacity * 2;
            books[size] = book;
            books[size].setId(size);
            size++;
        }
    }
    public void print() {
        for (int i = 0; i < size; ++i) {
            books[i].print();
        }
    }

    public void getClientPublishing(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите издательство : ");
        String my_publishing = in.nextLine();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPublishing().equals(my_publishing)){
                books[i].print();
            }
        }
    }

    public void afterYear(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год : ");
        String my_year = in.nextLine();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getYear().compareTo(my_year) > 0){
                books[i].print();
            }
        }
    }

    public void getAuthorBook(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите фамилию атвора : ");
        String my_author = in.nextLine();
        for (int i = 0; i < books.length; i++) {
            String[] authors = books[i].getAuthors().split("[ ,.]");
            for (String author : authors) {
                if (author.equals(my_author)){
                    books[i].print();
                }
            }
        }
    }

}
