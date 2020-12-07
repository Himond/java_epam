package by.jonline.progwithclass.simpletaskeight;

/*Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. Задать критерии выбора данных
и вывести эти данные на консоль. Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/


public class CustomerMain {
    public static void main(String[] args) {
        Bank bank = new Bank(1);
        CustomerLogic logic = new CustomerLogic();
        CustomerView view = new CustomerView();

        Customer customer1 = new Customer(1, "Petrov", "Petr", "Petrovich", "Kirova 50", 42, 2344);
        Customer customer2 = new Customer(2, "Vasilev", "Vasilii", "Vasilevich", "Lenina 29", 43, 2348);
        Customer customer3 = new Customer(3, "Ivanov", "Ivan", "Ivanovich", "Leonova 12", 38, 2458);
        Customer customer4 = new Customer(4, "Andreev", "Andrei", "Andreevich", "Kirova 20", 52, 23512);
        Customer customer5 = new Customer(5, "Sidorov", "Pavel", "Ivanovich", "Pushkina 5", 41, 23610);

        bank.setCustomers(customer1);
        bank.setCustomers(customer2);
        bank.setCustomers(customer3);
        bank.setCustomers(customer4);
        bank.setCustomers(customer5);
        System.out.println(bank.getCustomers().size());

        view.print("список покупателей в алфавитном порядке", logic.sortBySurname(bank.getCustomers()));
        System.out.println();
        view.print(" список покупателей, у которых номер кредитной карточки находится в интервале 40 - 50", logic.rangeCardNumber(40, 50, bank.getCustomers()));


    }
}
