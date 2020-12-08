package by.jonline.progwithclass.simpletasknine;

/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. Задать критерии выбора данных
и вывести эти данные на консоль. Book: id, название, автор(ы), издательство, год издания, количество страниц, цена,
тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.*/

import java.util.ArrayList;
import java.util.List;

public class BookLogic {

    //this method returns a list of books by the specified author
    public List<Book> booksAuthor(String author, List<Book> books){
        List<Book> authorBooks = new ArrayList<>();
        for (Book book: books){
            if(book.getAuthor().equals(author)){
                authorBooks.add(book);
            }
        }
        return authorBooks;
    }

    //this method returns a list of books by the specified publisher
    public List<Book> publishingHouseBooks(String publishing_house, List<Book> books){
        ArrayList<Book> list = new ArrayList<>();
        for (Book book: books){
            if(book.getPublishing_house().equals(publishing_house)){
                list.add(book);
            }
        }
        return list;
    }

    //this method returns a list of books released after the specified year
    public List<Book>  booksReleasedAfter(int year, List<Book> books){
        ArrayList<Book> list = new ArrayList<>();
        for (Book book: books){
            if(book.getPublication_year() >= year){
                list.add(book);
            }
        }
        return list;
    }
}
