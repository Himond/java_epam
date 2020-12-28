package by.jonline.task6.task1.dao;

import by.jonline.task6.task1.bean.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookDao implements Dao<Book> {

    private File file = new File("src\\by\\jonline\\task6\\task1\\resource\\book.txt");

    @Override
    public void save(Book book) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write("title:" + book.getTitle()+ ",author:" + book.getAuthor() + ",type:" + book.getType() +
                    ",number_of_pages:" + book.getNumber_of_pages() + "\n");
        }catch (IOException ex){
            throw new IOException(ex.getMessage());
        }
    }

    @Override
    public List<String> getAll() throws IOException {
        List<String> books = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null){
                books.add(line);
            }
        }catch (FileNotFoundException ex){
            throw new FileNotFoundException(ex.getMessage());
        }
        return books;
    }

    public void saveChangeList(List<Book> books) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Book book: books){
                bw.write("title:" + book.getTitle()+ ",author:" + book.getAuthor() + ",type:" + book.getType() +
                        ",number_of_pages:" + book.getNumber_of_pages() + "\n");
            }
        }catch (IOException ex){
            throw new IOException(ex.getMessage());
        }
    }


}
