package by.jonline.task6.task3.dao;

import java.io.IOException;

public interface Dao {

    String read() throws IOException;

    void update(String list) throws IOException;

}
