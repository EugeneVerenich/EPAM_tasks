package com.company;

import java.util.Scanner;
import java.util.*;
class Customer {
    private int id;
    private static int ID;
    private String name, surname, patronymic,
            address,
            credit_сard_number, account_number;

    public Customer(String name_, String surname_, String patronymic_,
                    String address_,
                    String credit_сard_number_, String account_number_) {
        id = ID++;
        name = name_;
        surname = surname_;
        patronymic = patronymic_;
        address = address_;
        credit_сard_number = credit_сard_number_;
        account_number = account_number_;
    }
    public String toString() {
        String string = "";
        string = string + id + ":" + name + " " + surname + " " + patronymic +
                "." + address + " : " + credit_сard_number + " : " + account_number;
        return string;
    }
    public void print() {
        System.out.println(toString());
    }
    public void set_name(String name_) {
        name = name_;
    }
    public void set_surname(String surname_) {
        surname = surname_;
    }
    public void set_patronymic(String patronymic_) {
        patronymic = patronymic_;
    }
    public void set_address(String address_) {
        address = address_;
    }
    public void set_credit_сard_number(String credit_сard_number_) {
        credit_сard_number = credit_сard_number_;
    }
    public void set_account_number(String account_number_) {
        account_number = account_number_;
    }
    public int get_id() {
        return id;
    }
    public String get_name() {
        return name;
    }
    public String get_surname() {
        return surname;
    }
    public String get_patronymic() {
        return patronymic;
    }
    public String get_address() {
        return address;
    }
    public String get_credit_сard_number() {
        return credit_сard_number;
    }
    public String get_account_number() {
        return account_number;
    }

    public Customer(){}

    public static Customer getCustomer(){

        Scanner in = new Scanner(System.in);
        Customer customer = new Customer();

        System.out.print("Name : ");
        customer.name = in.nextLine();

        System.out.print("Surname : ");
        customer.surname = in.nextLine();

        System.out.print("Patronymic : ");
        customer.patronymic = in.nextLine();

        System.out.print("Address : ");
        customer.address = in.nextLine();

        System.out.print("Credit card number : ");
        customer.credit_сard_number = in.nextLine();

        System.out.print("Account number : ");
        customer.account_number = in.nextLine();

        return customer;
    }// ввод данных

    public static class ByNameComparator implements Comparator < Customer > {
        @Override
        public int compare(Customer left, Customer right) {
            if (left.surname != right.surname)
                return left.surname.compareTo(right.surname);
            if (left.name != right.name)
                return left.name.compareTo(right.name);
            return left.patronymic.compareTo(right.patronymic);
        }
    }
}