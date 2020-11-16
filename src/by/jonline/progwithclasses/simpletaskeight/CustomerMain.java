package by.jonline.progwithclasses.simpletaskeight;


import java.util.Arrays;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Petrov", "Petr", "Petrovich", "Kirova 50", 42552113, 2344);
        Customer customer2 = new Customer(2, "Vasilev", "Vasilii", "Vasilevich", "Lenina 29", 42334581, 2348);
        Customer customer3 = new Customer(3, "Ivanov", "Ivan", "Ivanovich", "Leonova 12", 38814526, 2458);
        Customer customer4 = new Customer(4, "Andreev", "Andrei", "Andreevich", "Kirova 20", 52337643, 23512);
        Customer customer5 = new Customer(5, "Sidorov", "Pavel", "Ivanovich", "Pushkina 5", 41325443, 23610);
        CustomerControl customers = new CustomerControl(new Customer[]{customer1, customer2, customer3, customer4, customer5});
        System.out.println(Arrays.toString(customers.getCustomers()));
        System.out.println(Arrays.toString(customers.sortBySurname()));
        System.out.println(Arrays.toString(customers.rangeCardNumber(40000000, 50000000)));
    }
}
