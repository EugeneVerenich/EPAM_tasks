package com.company.Library;

import java.io.Serializable;

public class Book implements Serializable {

    private String title;
    private int Id;
    private Author author;
    private int yearOfPublishing;
    private Publisher publisher;

    public Book(int Id, String title, Author author, Publisher publisher, int yearOfPublishing){
        this.Id = Id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String toString(){
        return "Book{"+"\nTitle: "+title+"\nAuthor:"+
                author.toString()+"\nPublishing: "+ publisher.toString()+
                "\nYear: "+ yearOfPublishing+"}";
    }
}
