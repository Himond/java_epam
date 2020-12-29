package by.jonline.task6.task2.dao;

import by.jonline.task6.task2.bean.Note;
import by.jonline.task6.task2.bean.NoteBook;

import java.io.IOException;
import java.util.List;

public interface Dao {

    void create(Note note) throws IOException;

    List<String> read() throws IOException;

    void update(NoteBook notebook) throws IOException;
}
