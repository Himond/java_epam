package by.jonline.progwithclass.simpletasknine;

import java.util.List;

public class BookView {
    public void print(String message, List<Book> books){
        System.out.println(message);
        for (Book book: books){
            System.out.println(book);
        }
    }
}
