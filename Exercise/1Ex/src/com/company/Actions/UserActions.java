package com.company.Actions;

import com.company.Library.User;

import java.io.*;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.out;

public class UserActions {

    private List<User> users;
    private String masterPassword;
    private File file;

    public UserActions(){
        userActions();
    }

    public void userActions(){
        users = new ArrayList<>();
        file = new File("src/com/company/User");

        if (file.canRead() && file.exists()){

            try(Scanner in = new Scanner(new FileReader(file))) {

                masterPassword = "admin";

                while (in.hasNextLine()){
                    String login = in.nextLine();
                    String e_mail = in.nextLine();
                    String password = in.nextLine();
                    String admin = in.nextLine();
                    boolean isAdmin = false;
                    if (admin.equals("y")){
                        isAdmin = true;
                    }

                    User user = new User(login,e_mail,password,isAdmin);
                    users.add(user);
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
    }

    public void saveToFile(){
        if (!file.exists()){
            try{
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (file.setWritable(true)){
            try(PrintWriter printWriter = new PrintWriter(file)) {
                out.println(masterPassword);

                for (User user : users) {
                    out.print(user.toString());
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean loginMaster(String password){
        if (password.equals(masterPassword)){
            return true;
        }
        return false;
    }

    public boolean checkLogin(String login){
        for (User user : users) {
            if (user.getLogin().equals(login)){
                return false;
            }
        }
        return true;
    }

    public boolean addUser(User new_user){
        for (User user : users){
            if (user.getLogin().equals(new_user.getLogin())){
                return false;
            }
        }
        users.add(new_user);
        return true;
    }

    public User login(String login, String password){
        for (User user : users) {
            if (user.login(login,password)){
                return user;
            }
        }
        return null;
    }

}
