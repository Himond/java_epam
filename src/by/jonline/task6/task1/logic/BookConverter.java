package by.jonline.task6.task1.logic;

import by.jonline.task6.task1.bean.Book;

import java.util.ArrayList;
import java.util.List;

public class BookConverter implements Converter<Book> {

    @Override
    public List<Book> convertData(List<String> list) {
        List<Book> books = new ArrayList<>();
        for (String line: list){
            books.add(createBook(line.split(",")));
        }
        return books;
    }


    private Book createBook(String[] splitLine){
        Book book = new Book();
        book.setTitle(splitLine[0].split(":")[1]);
        book.setAuthor(splitLine[1].split(":")[1]);
        book.setType(splitLine[2].split(":")[1]);
        book.setNumber_of_pages(Integer.parseInt(splitLine[3].split(":")[1]));
        return book;
    }
}
