package by.jonline.task6.task1.logic;

/*
Задание 1: создать консольное приложение “Учет книг в домашней библиотеке”.
Общие требования к заданию:
• +Система учитывает книги как в электронном, так и в бумажном варианте.
• +Существующие роли: пользователь, администратор.
• +Пользователь может просматривать книги в каталоге книг, осуществлять поиск
книг в каталоге.
• +Администратор может модифицировать каталог.
• +*При добавлении описания книги в каталог оповещение о ней рассылается на
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
import by.jonline.task6.task1.dao.BookDao;
import by.jonline.task6.task1.dao.UserDao;

import java.io.IOException;
import java.util.*;

public class BookLibraryLogic {

    private BookConverter bookConverter = new BookConverter();
    private BookDao bookDao = new BookDao();

    private UserConverter userConverter = new UserConverter();
    private UserDao userDao = new UserDao();


    public Book createBook(User user, String title, String author, String type, int pages){
        return new Book(title, author, type, pages);
    }

    public List<Book> getBooks(User user) throws IOException {
        return bookConverter.convertData(bookDao.getAll());
    }

    public void offerBook(User user, Book book) throws IOException {
        for (User user1: userConverter.convertData(userDao.getAll())){
            if(user1.isIs_staff()){
                sendMessage(user1.getEmail(), "Пользователь " + user.getLogin() +
                        ", рекомендует добавить следующую книгу: " + book.toString());
            }
        }
    }

    public Book searchBookByTitle(User user, String title) throws IOException {
        Book foundBook = null;
        for (Book book: bookConverter.convertData(bookDao.getAll())){
            if(book.getTitle().equals(title)){
                foundBook = book;
            }
        }
        return foundBook;
    }

    public List<Book> searchBookByAuthor(User user, String author) throws IOException {
        List<Book> books = new ArrayList<>();
        for (Book book: bookConverter.convertData(bookDao.getAll())){
            if(book.getAuthor().equals(author)){
                books.add(book);
            }
        }
        return books;
    }

    public void sortedBooks(User user) throws IOException {
        if(user.isIs_staff()){
            List<Book> books = bookConverter.convertData(bookDao.getAll());
            Collections.sort(books);
            bookDao.saveChangeList(books);
        }
    }

    public void addBook(User user, Book book) throws IOException {
        if(user.isIs_staff()){
            bookDao.save(book);
            for (User us: userConverter.convertData(userDao.getAll())){
                if(!user.equals(us)){
                    sendMessage(us.getEmail(), "Добавленна новая книга: " + book.getTitle() + " " + book.getAuthor());
                }
            }
        }
    }


    public void removeBook(User user, Book book) throws IOException {
        if(user.isIs_staff()){
            List<Book> books = bookConverter.convertData(bookDao.getAll());
            for (Book b: books){
                if (b.equals(book)){
                    books.remove(book);
                    bookDao.saveChangeList(books);
                    for (User us: userConverter.convertData(userDao.getAll())){
                        if(!user.equals(us)){
                            sendMessage(us.getEmail(), "Книга удалена из коталога: " + book.getTitle() + " " + book.getAuthor());
                        }
                    }
                    break;
                }
            }
        }
    }


    private void sendMessage(String email, String message){
        //здесь должна быть логика пересылки писем на заданную почту
        //в нашем случае печатаю письмо в консоль
        System.out.println(email + ": " + message);
    }



}
