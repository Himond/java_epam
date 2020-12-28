package by.jonline.task6.task1.view;

import by.jonline.task6.task1.bean.Book;

import java.util.List;
import java.util.Scanner;

public class BooksView {

    // постраничный вывод книг
    public void printByPage(List<Book> books){

        int sizeList = books.size();
        String key;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < sizeList;){
            System.out.println(books.get(i));
            i++;
            if (i % 2 == 0 && i != 0){
                key = scanner.next();
                if(key.equals("next")){
                    continue;
                }
                if (key.equals("previous")){
                    if (i >= 4){
                        i -= 4;
                    }else {
                        i = 0;
                    }
                }
                if (key.equals("quit")){
                    break;
                }
            }

        }
    }

    public void print(Book book){
        System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getType() + " " + book.getNumber_of_pages());
    }

    public void print(List<Book> books){
        for(Book book: books){
            System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getType() + " " + book.getNumber_of_pages());
        }
    }



}



