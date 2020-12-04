package by.jonline.basicsofoop.tasksecond;

/*Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.*/

import java.util.ArrayList;

public class Payment {

    private double sumPrice;
    private ArrayList<Payment.Product> cart ;

    public Payment() {
        this.sumPrice = 0;
        this.cart = new ArrayList<>();
    }

    public void addProduct(Product prod){
        cart.add(prod);
        sumPrice += prod.price;
    }

    public void delProduct(Product prod){
        cart.remove(prod);
        sumPrice -= prod.price;
    }

    public double getSumPrice() {
        return sumPrice;
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    public class Product{

        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            if (price > 0){
                this.price = price;
            }else {
                this.price = 0;
            }
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            if (price < 0){
                this.price = price;
            }else {
                System.out.println("некорректное значение цены");
            }

        }
    }

}
