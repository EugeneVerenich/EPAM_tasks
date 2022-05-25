package com.company;

import java.time.LocalDateTime;
import java.util.Date;

public class Customer {
    private String customer_name, customer_surname, customer_lastname;
    private String customer_birthday;

    public Customer(String customer_surname, String customer_name, String customer_lastname,
                    String customer_birthday){
        this.customer_surname = customer_surname;
        this.customer_name = customer_name;
        this.customer_lastname = customer_lastname;
        this.customer_birthday = customer_birthday;
    }

    public Customer(){}


    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_surname() {
        return customer_surname;
    }

    public void setCustomer_surname(String customer_surname) {
        this.customer_surname = customer_surname;
    }

    public String getCustomer_lastname() {
        return customer_lastname;
    }

    public void setCustomer_lastname(String customer_lastname) {
        this.customer_lastname = customer_lastname;
    }

    public String getCustomer_birthday() {
        return customer_birthday;
    }

    public void setCustomer_birthday(String customer_birthday) {
        this.customer_birthday = customer_birthday;
    }
}
