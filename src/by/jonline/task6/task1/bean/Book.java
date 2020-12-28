package by.jonline.task6.task1.bean;

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
• ***Пользователь может предложить добавить книгу в библиотеку, переслав её
администратору на e-mail.
• Каталог книг хранится в текстовом файле.
• Данные аутентификации пользователей хранятся в текстовом файле. Пароль
не хранится в открытом виде.
*/

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable, Comparable<Book>{

    private String title;
    private String author;
    private String type;
    private int number_of_pages;

    public Book() {
    }

    public Book(String title, String author, String type, int number_of_pages) {
        this.title = title;
        this.author = author;
        this.type = type;
        this.number_of_pages = number_of_pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber_of_pages() {
        return number_of_pages;
    }

    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

    @Override
    public int compareTo(Book o) {
        int result = this.title.compareTo(o.title);
        if(result == 0){
            result = this.author.compareTo(author);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return number_of_pages == book.number_of_pages && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(type, book.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, type, number_of_pages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", type=" + type +
                ", number_of_pages=" + number_of_pages +
                '}';
    }


}
