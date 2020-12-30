package by.jonline.task6.task3.dao;

import java.io.IOException;
import java.util.List;

public interface Dao<T> {

    void create(T t) throws IOException;

    List<String> read() throws IOException;

    void update(List<T> list) throws IOException;

}
