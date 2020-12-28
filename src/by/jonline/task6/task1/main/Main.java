package by.jonline.task6.task1.main;

/*
Задание 1: создать консольное приложение “Учет книг в домашней библиотеке”.
Общие требования к заданию:
• Система учитывает книги как в электронном, так и в бумажном варианте.
• Существующие роли: пользователь, администратор.
• Пользователь может просматривать книги в каталоге книг, осуществлять поиск
книг в каталоге.
• Администратор может модифицировать каталог.
• *При добавлении описания книги в каталог оповещение о ней рассылается на
e-mail всем пользователям.
• **При просмотре каталога желательно реализовать постраничный просмотр.
• +***Пользователь может предложить добавить книгу в библиотеку, переслав её
администратору на e-mail.
• +Каталог книг хранится в текстовом файле.
• +Данные аутентификации пользователей хранятся в текстовом файле. Пароль
не хранится в открытом виде.
*/

import by.jonline.task6.task1.bean.Book;
import by.jonline.task6.task1.bean.User;
import by.jonline.task6.task1.logic.Authentication;
import by.jonline.task6.task1.logic.BookLibraryLogic;
import by.jonline.task6.task1.view.BooksView;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws IOException {

        BookLibraryLogic logic = new BookLibraryLogic();
        BooksView view = new BooksView();


        try {
            Authentication authentication = new Authentication();
            authentication.registerAsAdmin("Himond", "Ihar", "Ihar@mail.ru", "123456");
            authentication.register("locan", "Ivan", "Ivan@mail.ru", "345535");
            authentication.register("Try", "Petr", "Petr@mail.ru", "898855");

            User admin = authentication.logIn("Ihar@mail.ru", "123456");
            User user = authentication.logIn("Ivan@mail.ru", "345535");

            Book book1 = logic.createBook(admin, "Война и мир", "Лев Толстой", "paper", 1300);
            Book book2 = logic.createBook(admin, "1984", "Джордж Оруэлл", "electronic", 250);
            Book book3 = logic.createBook(admin, "Улисс", "Джеймс Джойс", "paper", 425);
            Book book4 = logic.createBook(admin, "Лолита", "Владимир Набоков", "paper", 521);

            logic.addBook(admin, book1);
            logic.addBook(admin, book2);
            logic.addBook(admin, book3);
            logic.addBook(admin, book4);
            logic.sortedBooks(admin);

            Book book5 = logic.createBook(user,"Шум и ярость", "Джеймс Джойс", "paper", 345);

            logic.offerBook(user, book5);

            view.printByPage(logic.getBooks(admin));

            logic.removeBook(admin, book1);
            logic.addBook(admin, book5);

            view.print(logic.searchBookByTitle(user, "1984"));

        }catch (NoSuchAlgorithmException | IOException ex){
            System.out.println(ex.getMessage());
        }


    }
}
