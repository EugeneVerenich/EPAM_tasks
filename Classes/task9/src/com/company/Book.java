package com.company;

import java.util.Scanner;

public class Book {

    private int id;
    private String title, authors, publishing;
    private String pages, price, cover, year;

    public Book(int id,String title, String authors, String publishing, String year, String pages,String price, String cover){
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publishing = publishing;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.cover = cover;
    }

    public Book(){}

    public static Book getBook(){
        Scanner in = new Scanner(System.in);
        Book book = new Book();

        System.out.print("Title : ");
        book.title = in.nextLine();

        System.out.print("Authors : ");
        book.authors = in.nextLine();

        System.out.print("Publishing : ");
        book.publishing = in.nextLine();

        System.out.print("Year : ");
        book.year = in.nextLine();

        System.out.print("Pages : ");
        book.pages = in.nextLine();

        System.out.print("Price : ");
        book.price = in.nextLine();

        System.out.print("Cover : ");
        book.cover = in.nextLine();

        return book;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString(){
        return id+". "+title+", "+authors+", "+year+"\n"
                +"Издательство : "+publishing+"\n"
                +"Количество страниц : " + pages+"\n"
                +"Переплет : " + cover+"\n"
                +"Цена : " + price;
    }

    public void print(){
        System.out.println(toString());
    }

}
