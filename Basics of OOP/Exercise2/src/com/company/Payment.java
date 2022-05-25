/*
Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
нескольких товаров.
 */
package com.company;

public class Payment {

    private Product[] products;
    private int main_price = 0;

    public Payment(Product[] products){
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void showInfo(){
        for (Product product : products) {
            product.prodInfo();
            main_price += product.getPrice();
        }
    }

    public void printCheque(){
        System.out.println("ЧЕК");
        System.out.println("Название ............. Цена");
        showInfo();
        System.out.println("ИТОГО к оплате : " + main_price);
    }

    public int getMain_price() {
        return main_price;
    }

    public void setMain_price(int main_price) {
        this.main_price = main_price;
    }

    static class Product{

        private String name;
        private int price;

        public Product(){
        }

        public Product(String name, int price){
            this.price = price;
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void prodInfo(){
            System.out.println(getName() + "................" + getPrice());
        }
    }

}
