package com.company.Library;

import java.io.Serializable;

public class User implements Serializable {

    private String login;
    private String e_mail;
    private String password;
    private boolean admin;
    private boolean logged;

    public User(String login, String e_mail, String password, boolean admin){
        setLogin(login);
        setE_mail(e_mail);
        setPassword(password);

        this.admin = admin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    public boolean login(String login, String password){
        if (this.login.equals(login) && this.password.equals(password)){
            logged = true;
        }
        return logged;
    }

    public void logout(){
        logged = false;
    }

    public String toString(){
        return "Login: " + login
                + "\nE-mail: " + e_mail
                + "\nPassword: " + password
                + "\nAdmin: " + (isAdmin() ? "yes" : "no");
    }
}
