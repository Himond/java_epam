package by.jonline.task6.task1.dao;


import java.io.IOException;
import java.util.List;

public interface Dao<T> {

    void save(T t) throws IOException;

    List<String> getAll() throws IOException;


}
