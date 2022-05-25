package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.UUID;

public class CustomersBase {

    private Customer[] customers;
    private int capacity;
    private int size;

    public CustomersBase(int capacity) {
        size = 0;
        this.capacity = capacity;// размерность массива
        customers = new Customer[capacity];// создаем массив
    }

    // запись клиента
    public void addCustomer(Customer customer) {
        if (size < capacity) {
            customers[size] = customer;
            size++;
        } else {
            Customer[] buffer = new Customer[capacity * 2];
            for (int i = 0; i < size; ++i) {
                buffer[i] = customers[i];
            }
            customers = buffer;
            capacity = capacity * 2;
            customers[size] = customer;
            size++;
        }
    }
    public void print() {
        for (int i = 0; i < size; ++i) {
            customers[i].print();
        }
    }

    // сортировка по имени
    public void sortByName() {
        Arrays.sort(customers, 0, size, new Customer.ByNameComparator());
    }

    // вывод по заданному интервалу
    public void print_if_card_in(String a, String b) {
        for (int i = 0; i < size; ++i) {
            if (customers[i].get_credit_сard_number().compareTo(a) >= 0 &&
                    customers[i].get_credit_сard_number().compareTo(b) <= 0)
                customers[i].print();
        }
    }

}
