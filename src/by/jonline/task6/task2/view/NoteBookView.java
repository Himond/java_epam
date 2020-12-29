package by.jonline.task6.task2.view;

import by.jonline.task6.task2.bean.Note;
import by.jonline.task6.task2.bean.NoteBook;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

public class NoteBookView {

    public void print(NoteBook notebook){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        for (Note note: notebook.getNotebook()){
            System.out.println(note.getTopic() + " " + df.format(note.getDate()) + " " + note.getEmail() + " " + note.getMessage());
        }
    }

    public void print(String message, List<Note> notebook){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(message + ":");
        for (Note note: notebook){
            System.out.println(note.getTopic() + " " + df.format(note.getDate()) + " " + note.getEmail() + " " + note.getMessage());
        }
    }
}
