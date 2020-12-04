package by.jonline.basicsofoop.tasksecond;

/*Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.*/

public class PaymentMain {
    public static void main(String[] args) {
        Payment payment = new Payment();

        Payment.Product bananas = payment.new Product("бананы", 2.57);
        Payment.Product bread = payment.new Product("хлеб", 1.82);
        Payment.Product milk = payment.new Product("молоко", 1.85);
        Payment.Product chicken = payment.new Product("курица", 7.45);
        Payment.Product potato = payment.new Product("картошка", 5.45);

        payment.addProduct(bananas);
        payment.addProduct(bread);
        payment.addProduct(milk);
        payment.addProduct(chicken);
        payment.addProduct(potato);

        System.out.printf("Цена %.2f rub%n", payment.getSumPrice());

        for (Payment.Product prod: payment.getCart()){
            System.out.println(prod.getName());
        }

        payment.delProduct(bananas);

        System.out.printf("Цена %.2f rub%n", payment.getSumPrice());
    }
}
