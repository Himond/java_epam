package by.jonline.basicsofoop.tasksecond;

/*Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Payment {

    private List<Product> cart ;

    public Payment() {
        this.cart = new ArrayList<>();
    }

    public void addProduct(Product product){
        cart.add(product);
    }

    public void removeProduct(Product product){
        cart.remove(product);
    }

    public double getSumPrice() {
        double sumPrice = 0;
        for (Product prod: cart){
            sumPrice += prod.price;
        }
        return sumPrice;
    }

    public List<Product> getCart() {
        return cart;
    }


    public static class Product{

        private String name;
        private int price;


        private Product(){
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Product product = (Product) o;
            return Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, price);
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }

        public static Builder newBuilder(){
            return new Product().new Builder();
        }

        public class Builder{


            private Builder() {
            }

            public Builder setName(String name){
                Product.this.name = name;
                return this;
            }

            public Builder setPrice(int price){
                Product.this.price = price;
                return this;
            }

            public Product build(){
                return Product.this;
            }

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(cart, payment.cart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cart);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "cart=" + cart +
                '}';
    }
}
