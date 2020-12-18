package by.jonline.basicsofoop.tasksecond;

/*Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.*/

public class PaymentMain {
    public static void main(String[] args) {

        Payment payment = new Payment();

        Payment.Product milk = Payment.Product.newBuilder().setName("молоко").setPrice(26).build();

        payment.addProduct(Payment.Product.newBuilder().setName("бананы").setPrice(10).build());
        payment.addProduct(Payment.Product.newBuilder().setName("хлеб").setPrice(12).build());
        payment.addProduct(milk);
        payment.addProduct(Payment.Product.newBuilder().setName("курица").setPrice(13).build());
        payment.addProduct(Payment.Product.newBuilder().setName("картошка").setPrice(9).build());



        for (Payment.Product prod: payment.getCart()){
            System.out.println(prod.getName());
        }

        System.out.printf("Цена %.2f rub%n", payment.getSumPrice());

        payment.removeProduct(milk);
        for (Payment.Product prod: payment.getCart()){
            System.out.println(prod.getName());
        }
        System.out.printf("Цена %.2f rub%n", payment.getSumPrice());
    }
}
