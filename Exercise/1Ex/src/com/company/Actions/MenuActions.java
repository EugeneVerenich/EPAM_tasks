package com.company.Actions;

import com.company.Library.*;

import java.awt.*;
import java.util.List;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

public class MenuActions {

    private static int choicePosition(int min, int max){
        Scanner in = new Scanner(System.in);
        int res = in.nextInt();
        if (res < min || res > max){
            System.out.println("Invalid input: try again!!!");
             return choicePosition(min, max);
        }else {
            return res;
        }
    }

    private static void printPage(List<Book> books){
        int index = 0;
        while (true){
            for (int i = index; i < Integer.min(books.size(),index + 4); i++) {
                System.out.println(books.get(i));
            }

            System.out.println("""
                    1 - print next page;\s
                    2 - print previous page;
                    3 - exit;""");

            int choice = choicePosition(1,3);
            if (choice == 1) {
                index += 4;
                if (index >= books.size()){
                    index -= 4;
                }
            }else if (choice == 2){
                index = Integer.max(0, index - 4);
            }else {
                return;
            }
        }

    }

    private static User getUser(boolean admin){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter login:");
        String login = in.nextLine();
        System.out.println("Enter e-mail:");
        String e_mail = in.nextLine();
        System.out.println("Enter password:");
        String password = in.nextLine();

        return new User(login,e_mail,password,admin);
    }

    private static void findBook(BookActions books){
        System.out.println("1 - search by Id");
        System.out.println("2 - search by title");
        System.out.println("3 - search by author");
        System.out.println("4 - search by publisher");
        System.out.println("5 - search by year of publishing");
        int choice = choicePosition(1,5);

        Scanner in = new Scanner(System.in);

        if (choice == 1){
            System.out.println("Enter book Id:");
            int id = choicePosition(0,Integer.MAX_VALUE);
            Book book = books.findById(id);
            System.out.println(book == null ? "book is not found" : book);
        }else if (choice == 2){
            System.out.println("Enter title:");
            String title = in.nextLine();
            List<Book> bookList = books.sortByTitle(title);
            printPage(bookList);
        }else if (choice == 3){
            System.out.println("Enter author:");
            String author = in.nextLine();
            List<Book> bookList = books.sortByAuthor(author);
            printPage(bookList);
        }else if (choice == 4){
            System.out.println("Enter publisher:");
            String publisher = in.nextLine();
            List<Book> bookList = books.sortByPublisher(publisher);
            printPage(bookList);
        }else {
            System.out.println("Enter range start year and finish year:");
            int start = in.nextInt();
            int end = in.nextInt();
            List<Book> bookList = books.sortByYear(start,end);
            printPage(bookList);
        }
    }

    private static void addBook(BookActions books){
        Scanner in = new Scanner(System.in);
        System.out.println("Adding new book...");
        System.out.println("Title:");
        String title = in.nextLine();
        System.out.println("Author:");
        String author = in.nextLine();
        System.out.println("Publisher:");
        String publisher = in.nextLine();
        System.out.println("Year of publishing:");
        int year = in.nextInt();

        Book book;
        System.out.println("Is it e-book?(1 - yes, 2 - no)");
        int choice = choicePosition(1,2);
        if (choice == 1){
            System.out.println("Enter web location of this book(URl or website)");
            String location = in.nextLine();
            book = new EBook(0,title,new Author(author),new Publisher(publisher),year,location);
        }else {
            book = new Book(0,title,new Author(author),new Publisher(publisher),year);
        }

        books.addBook(book);
    }

    private static void removeBook(BookActions books){
        System.out.println("Enter book Id:");
        int id = choicePosition(Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (books.removeBook(id)){
            System.out.println("Done!!!");
        }else {
            System.out.println("Error: Book is not found!!!");
        }
    }

    public static void choiceMenu(){
        UserActions users = new UserActions();
        BookActions books = new BookActions();

        Scanner in = new Scanner(System.in);

        boolean logged = false;
        User user = null;

        while (!logged){
            System.out.println("1 - Register new User");
            System.out.println("2 - Register new Admin");
            System.out.println("3 - Login");
            int choice = choicePosition(1,3);

            if (choice == 1){

                User newUser = getUser(false);

                if (!users.checkLogin(newUser.getLogin())){
                    System.out.println("This name is used by another user!!!");
                    System.out.println("Exit...");
                }else {
                    users.addUser(newUser);
                }
            }else if (choice == 2){
                System.out.println("Enter master password: ");
                String masterPassword = in.nextLine();
                if (users.loginMaster(masterPassword)){
                    System.out.println("Ok\n");

                    User newUser = getUser(true);

                    if (!users.checkLogin(newUser.getLogin())){
                        System.out.println("This username is used by another user");
                        System.out.println("Exit...");
                    }else{
                        users.addUser(newUser);
                    }
                }
            }else {
                System.out.println("Enter login: ");
                String login = in.nextLine();
                System.out.println("Enter password: ");
                String password = in.nextLine();
                user = users.login(login,password);
                if (user == null){
                    System.out.println("Failed...");
                }else{
                    System.out.println("Logged!!!");
                    logged = true;
                }
            }

            System.out.println("Press enter to continue...");
            in.nextLine();
        }

        boolean exit = false;

        if (user.isAdmin()){
            bookMenuAdmin(exit,books);
        }else {
            bookMenuUser(exit,books);
        }
        user.logout();

        users.saveToFile();
        books.saveToFile();
    }

    private static void bookMenuAdmin(boolean exit, BookActions books){
        while (!exit){
            System.out.println("Menu");
            System.out.println("1. Find book");
            System.out.println("2. Show all books");
            System.out.println("3. Add new book");
            System.out.println("4. Remove book");
            System.out.println("5. Exit");
            int choice = choicePosition(1, 5);

            if (choice == 1){
                findBook(books);
            }else if (choice == 2){
                printPage(books.sortByYear(Integer.MIN_VALUE,Integer.MAX_VALUE));
            }else if (choice == 3){
                addBook(books);
            }else if (choice == 4){
                removeBook(books);
            }else if (choice == 5){
                exit = true;
            }
        }
    }

    private static void bookMenuUser(boolean exit, BookActions books){
        while (!exit){
            System.out.println("Menu");
            System.out.println("1. Find book");
            System.out.println("2. Show all books");
            System.out.println("3. Exit");
            int choice = choicePosition(1, 3);

            if (choice == 1){
                findBook(books);
            }else if(choice == 2){
                printPage(books.sortByYear(Integer.MIN_VALUE,Integer.MAX_VALUE));
            }else if (choice == 3){
                exit = true;
            }
        }
    }
}
