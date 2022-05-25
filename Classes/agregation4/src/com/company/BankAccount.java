package com.company;

import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class BankAccount {
    private Customer customer;
    private String bank_name;
    private int sum_on_the_acc;
    private enum Type {blocked, unblocked}
    //private HashMap<String, Integer> accounts;

    // конструктор для уже известного клиента
    public BankAccount(Customer customer, String bank_name){
        this.customer = customer;
        this.bank_name = bank_name;
        Type type = Type.unblocked;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество счетов для клиента : ");
        int amount_of_acc = in.nextInt();

        HashMap<String, Integer> accounts = new HashMap<>();

        System.out.println("Введите номер счета и сумму : ");
        for (int i = 0; i < amount_of_acc; i++) {
            accounts.put(in.next(),in.nextInt());
        }
    }
    // конструктор
    public BankAccount(String bank_name){

        this.bank_name = bank_name;

        Type type = Type.unblocked;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите данные о клиенте : ");

        Customer customer = new Customer();
        System.out.println("Введите фамилию клиента : ");
        customer.setCustomer_surname(in.next());

        System.out.println("Введите имя клиента : ");
        customer.setCustomer_name(in.next());

        System.out.println("Введите отчество клиента: ");
        customer.setCustomer_lastname(in.next());

        System.out.println("Введите дату рождения : ");
        customer.setCustomer_birthday(in.next());

        System.out.println("Введите количество счетов для клиента : ");
        int amount_of_acc = in.nextInt();

        HashMap<String, Integer> accounts = new HashMap<>();

        System.out.println("Введите номер счета и сумму : ");
        for (int i = 0; i < amount_of_acc; i++) {
            accounts.put(in.next(),in.nextInt());
        }
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public int getSum_on_the_acc() {
        return sum_on_the_acc;
    }

    public void setSum_on_the_acc(int sum_on_the_acc) {
        this.sum_on_the_acc = sum_on_the_acc;
    }


}
