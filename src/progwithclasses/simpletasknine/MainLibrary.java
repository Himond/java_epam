package progwithclasses.simpletasknine;

import java.util.Arrays;

public class MainLibrary {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Война и мир","Лев Толстой", "Эксмо", 1869, 1300, 120, "Твердый переплет");
        Book book2 = new Book(2, "1984","Джордж Оруэлл", "АСТ", 1949, 250, 80, "Твердый переплет");
        Book book3 = new Book(3, "Улисс","Джеймс Джойс", "Просвещение", 1922, 425, 92, "Твердый переплет");
        Book book4 = new Book(4, "Лолита","Владимир Набоков", "Эксмо", 1955, 521, 98, "Твердый переплет");
        Book book5 = new Book(5, "Шум и ярость","Джеймс Джойс", "Просвещение", 1929, 345, 75, "Твердый переплет");
        Library library = new Library(new Book[]{book1, book2, book3});
        System.out.println(Arrays.toString(library.getBooks()));
        library.addBooks(new Book[]{book4, book5});
        System.out.println(Arrays.toString(library.getBooks()));
        library.removeBook("Лолита");
        System.out.println(Arrays.toString(library.getBooks()));
        library.removeBook("Гарри Поттер");
        System.out.println(Arrays.toString(library.booksAuthor("Джеймс Джойс")));
        library.addBooks(book4);
        System.out.println(library.publishingHouseBooks("Эксмо"));
        System.out.println(library.booksReleasedAfter(1940));


    }
}
