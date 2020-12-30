package by.jonline.task6.task3.dao;

import by.jonline.task6.task3.bean.Student;

import java.io.File;
import java.io.IOException;
import java.util.List;



public class StudentDao implements Dao<Student> {

    private File file = new File("src\\by\\jonline\\task6\\task3\\resource\\student.xml");

    @Override
    public void create(Student student) throws IOException {

    }

    @Override
    public List<String> read() throws IOException {
        return null;
    }

    @Override
    public void update(List<Student> list) throws IOException {

    }

}
