package by.jonline.progwithclasses.simpletasknine;

/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. Задать критерии выбора данных
и вывести эти данные на консоль. Book: id, название, автор(ы), издательство, год издания, количество страниц, цена,
тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.*/

import java.util.ArrayList;

public class Library {

    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    //method that adds a book to the library
    public void addBooks(Book book) {
        int count = this.books.length + 1;
        Book[] newbooks = new Book[count];
        System.arraycopy(this.books, 0, newbooks, 0, this.books.length);
        newbooks[count - 1] = book;
        this.books = newbooks;
    }

    //overloaded method that adds several new books to the library
    public void addBooks(Book[] books) {
        int count = this.books.length + books.length;
        Book[] newbooks = new Book[count];
        System.arraycopy(this.books, 0, newbooks, 0, this.books.length);
        System.arraycopy(books, 0, newbooks, this.books.length, books.length);
        this.books = newbooks;
    }
    //this method deletes the book by the specified title
    public void removeBook(String title){
        boolean flag = false;
        for (Book book: this.books){
            if (book.getTitle().equals(title)) {
                flag = true;
                break;
            }
        }
        if (flag){
            Book[] newbook = new Book[this.books.length - 1];
            int j = 0;
            for (Book book : this.books) {
                if (!book.getTitle().equals(title)) {
                    newbook[j] = book;
                    j++;
                }
            }
            this.books = newbook;
        }else {
            System.out.println("There is no book with that title in the library");
        }
    }
    //this method returns a list of books by the specified author
    public Book[] booksAuthor(String author){
        int count = 0;
        for (Book book: this.books){
            if(book.getAuthors().contains(author)){
                count++;
            }
        }
        if (count != 0){
            Book[] authorBooks = new Book[count];
            int i = 0;
            for (Book book: this.books){
                if(book.getAuthors().contains(author)){
                    authorBooks[i] = book;
                    i++;
                }
            }
            return authorBooks;
        }
        return new Book[]{};
    }

    //this method returns a list of books by the specified publisher
    public ArrayList<Book> publishingHouseBooks(String publishing_house){
        ArrayList<Book> list = new ArrayList<>();
        for (Book book: this.books){
            if(book.getPublishing_house().equals(publishing_house)){
                list.add(book);
            }
        }
        return list;
    }

    //this method returns a list of books released after the specified year
    public ArrayList<Book> booksReleasedAfter(int year){
        ArrayList<Book> list = new ArrayList<>();
        for (Book book: this.books){
            if(book.getPublication_year() >= year){
                list.add(book);
            }
        }
        return list;
    }


}
