package by.jonline.progwithclass.simpletasknine;

/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. Задать критерии выбора данных
и вывести эти данные на консоль. Book: id, название, автор(ы), издательство, год издания, количество страниц, цена,
тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.*/

public class Book {

    private int id;
    private String title;
    private String authors;
    private String publishing_house;
    private int publication_year;
    private int number_pages;
    private int price;
    private String type_binding;

    public Book(int id, String title, String authors, String publishing_house, int publication_year, int number_pages, int price, String type_binding) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publishing_house = publishing_house;
        this.publication_year = publication_year;
        this.number_pages = number_pages;
        this.price = price;
        this.type_binding = type_binding;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
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
        return number_pages;
    }

    public void setNumber_pages(int number_pages) {
        this.number_pages = number_pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType_binding() {
        return type_binding;
    }

    public void setType_binding(String type_binding) {
        this.type_binding = type_binding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + title + '\'' +
                ", authors='" + authors + '\'' +
                ", publishing_house='" + publishing_house + '\'' +
                ", publication_year=" + publication_year +
                ", number_pages=" + number_pages +
                ", price=" + price +
                ", type_binding='" + type_binding + '\'' +
                '}';
    }
}
