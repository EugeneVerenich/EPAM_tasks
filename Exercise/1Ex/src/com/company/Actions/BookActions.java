package com.company.Actions;

import com.company.Library.Author;
import com.company.Library.Book;
import com.company.Library.EBook;
import com.company.Library.Publisher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.out;

public class BookActions {

    private static int Id_counter = 0;

    private List<Book> books;
    private File file;

    public BookActions(){
        createBook();
    }

    private void createBook(){
        books = new ArrayList<>();

        file = new File("src/com/company/Book");

        if (file.canRead() && file.exists()) {
            try(Scanner in = new Scanner(new FileReader(file))) {

                while (in.hasNextLine()){
                    String bookType = in.nextLine();
                    String title = in.nextLine();
                    String author = in.nextLine();
                    String publisher = in.nextLine();
                    int year = in.nextInt();
                    in.nextLine();

                    if (bookType.toLowerCase().equals("e")){
                        String location = in.nextLine();
                        EBook eBook = new EBook(0,title,new Author(author),new Publisher(publisher),year,location);
                        addBook(eBook);
                    }else {
                        Book book = new Book(0,title,new Author(author),new Publisher(publisher),year);
                        addBook(book);
                    }
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void saveToFile(){
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (file.setWritable(true)){
            try(PrintWriter printWriter = new PrintWriter(file)){
                for (Book book: books) {
                    out.println(book instanceof EBook ? "e" : "p");
                    out.println(book.getTitle());
                    out.println(book.getAuthor());
                    out.println(book.getPublisher());
                    out.println(book.getYearOfPublishing());
                    if (book instanceof EBook){
                        out.println(((EBook) book).getLocation());
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }else {
            out.println("Unable to save file!!!");
        }
    }

    public Book findById(int Id){
        for (Book book: books) {
            if (book.getId() == Id){
                return book;
            }
        }
        return null;
    }

    public List<Book> sortByTitle(String title){
        List<Book> sortedBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getTitle().toLowerCase(Locale.ROOT).equals(title.toLowerCase(Locale.ROOT))){
                sortedBooks.add(book);
            }
        }

        return (sortedBooks.size() > 0 ? sortedBooks : null);
    }

    public List<Book> sortByAuthor(String author){
        List<Book> sortedBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getAuthor().getName().toLowerCase(Locale.ROOT).equals(author.toLowerCase(Locale.ROOT))){
                sortedBooks.add(book);
            }
        }

        return (sortedBooks.size() > 0 ? sortedBooks : null);
    }

    public List<Book> sortByPublisher(String publisher){
        List<Book> sortedBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getPublisher().getName().toLowerCase(Locale.ROOT).equals(publisher.toLowerCase(Locale.ROOT))){
                sortedBooks.add(book);
            }
        }

        return (sortedBooks.size() > 0 ? sortedBooks : null);
    }

    public List<Book> sortByYear(int start, int end){
        List<Book> sortedBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getYearOfPublishing() >= start && book.getYearOfPublishing() <= end){
                sortedBooks.add(book);
            }
        }

        return (sortedBooks.size() > 0 ? sortedBooks : null);
    }

    public boolean removeBook(Book book){
        return books.remove(book);
    }

    public boolean removeBook(int Id){
        return books.remove(findById(Id));
    }

    public void addBook(Book book) {
        book.setId(Id_counter++);
        books.add(book);
    }

    public static int getId_counter() {
        return Id_counter;
    }

    public static void setId_counter(int id_counter) {
        Id_counter = id_counter;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
