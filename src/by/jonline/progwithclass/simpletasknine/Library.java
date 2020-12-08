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
import java.util.Objects;

public class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book){
        this.books.remove(book);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books);
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
