/*
Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
нескольких товаров.
 */
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество продуктов, которые хотите купить :");
        int amount = in.nextInt();

        Payment.Product[] products = new Payment.Product[amount];
        for (int i = 0; i < products.length; i++) {

            products[i] = new Payment.Product();

            System.out.println("Введите название "+(i+1)+"-го продукта : ");
            products[i].setName(in.next());

            System.out.println("Введите стоимость "+(i+1)+"-го продукта : ");
            products[i].setPrice(in.nextInt());
        }

        Payment payment = new Payment(products);

        payment.printCheque();

    }
}
