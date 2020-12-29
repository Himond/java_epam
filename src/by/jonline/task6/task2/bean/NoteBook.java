package by.jonline.task6.task2.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NoteBook implements Serializable {

    private List<Note> notebook;

    {
        notebook = new ArrayList<>();
    }

    public NoteBook() {
    }

    public NoteBook(List<Note> notebook) {
        this.notebook = notebook;
    }

    public List<Note> getNotebook() {
        return notebook;
    }

    public void setNotebook(List<Note> notebook) {
        this.notebook = notebook;
    }

    public void addNote(Note note){
        notebook.add(note);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteBook notebook1 = (NoteBook) o;
        return Objects.equals(notebook, notebook1.notebook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notebook);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "notebook=" + notebook +
                '}';
    }
}
