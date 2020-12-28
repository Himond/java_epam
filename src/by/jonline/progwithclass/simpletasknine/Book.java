package by.jonline.progwithclass.simpletasknine;

/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. Задать критерии выбора данных
и вывести эти данные на консоль. Book: id, название, автор(ы), издательство, год издания, количество страниц, цена,
тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.*/

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private String publishing_house;
    private int publication_year;
    private int sum_page;
    private int price;
    private BindingType type_binding;

    public Book(String title, String author, String publishing_house, int publication_year, int number_pages, int price, BindingType type_binding) {
        this.title = title;
        this.author = author;
        this.publishing_house = publishing_house;
        this.publication_year = publication_year;
        this.sum_page = number_pages;
        this.price = price;
        this.type_binding = type_binding;
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

    public void setAuthor(String authors) {
        this.author = authors;
    }

    public String getPublishing_house() {
        return publishing_house;
    }

    public void setPublishing_house(String publishing_house) {
        this.publishing_house = publishing_house;
    }

    public int getPublication_year() {
        return publication_year;
    }

    public void setPublication_year(int publication_year) {
        this.publication_year = publication_year;
    }

    public int getNumber_pages() {
        return sum_page;
    }

    public void setNumber_pages(int number_pages) {
        this.sum_page = number_pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BindingType getType_binding() {
        return type_binding;
    }

    public void setType_binding(BindingType type_binding) {
        this.type_binding = type_binding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return  publication_year == book.publication_year && sum_page == book.sum_page && price == book.price
                && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(publishing_house, book.publishing_house)
                && Objects.equals(type_binding, book.type_binding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publishing_house, publication_year, sum_page, price, type_binding);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishing_house='" + publishing_house + '\'' +
                ", publication_year=" + publication_year +
                ", sum_page=" + sum_page +
                ", price=" + price +
                ", type_binding=" + type_binding +
                '}';
    }
}
