package by.jonline.task6.task3.main;


import by.jonline.task6.task3.bean.Student;
import by.jonline.task6.task3.logic.ArchiveClient;
import by.jonline.task6.task3.logic.Authentication;


import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {

        ArchiveClient client = new ArchiveClient();
        client.logIn("ivan646@mail.ru", "12345");
        client.logOut();
        client.register("Himon", "Ihar", "ihar@mail.ru", "12345" );
        System.out.println(client.getUser());

        Student student = client.searchStudent("Иван", "Иванов");
        System.out.println(student);
        student.addProgress(9);
        student.setGroup_number(125);
        System.out.println(student);
        client.saveStudent(student);

    }
}
