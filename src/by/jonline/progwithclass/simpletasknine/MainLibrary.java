package by.jonline.progwithclass.simpletasknine;

/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. Задать критерии выбора данных
и вывести эти данные на консоль. Book: id, название, автор(ы), издательство, год издания, количество страниц, цена,
тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.*/


public class MainLibrary {
    public static void main(String[] args) {
        Library library = new Library();
        BookLogic logic = new BookLogic();
        BookView view = new BookView();

        Book book1 = new Book( "Война и мир","Лев Толстой", "Эксмо", 1869, 1300, 120, BindingType.HARDCOVER_BOUND);
        Book book2 = new Book( "1984","Джордж Оруэлл", "АСТ", 1949, 250, 80, BindingType.HARDCOVER_BOUND);
        Book book3 = new Book( "Улисс","Джеймс Джойс", "Просвещение", 1922, 425, 92, BindingType.PERFECT_BOUND);
        Book book4 = new Book( "Лолита","Владимир Набоков", "Эксмо", 1955, 521, 98, BindingType.SCREW_BOUND);
        Book book5 = new Book("Шум и ярость","Джеймс Джойс", "Просвещение", 1929, 345, 75, BindingType.TAPE_BOUND);

        library.setBooks(book1);
        library.setBooks(book2);
        library.setBooks(book3);
        library.setBooks(book4);
        library.setBooks(book5);

        view.print("список книг заданного автора: ", logic.booksAuthor("Джеймс Джойс", library.getBooks()));
        view.print("список книг, выпущенных заданным издательством: ", logic.publishingHouseBooks("Эксмо", library.getBooks()));
        view.print("список книг, выпущенных после заданного года: ", logic.booksReleasedAfter(1930, library.getBooks()));

    }
}
