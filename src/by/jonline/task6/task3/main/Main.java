package by.jonline.task6.task3.main;

/*Попробуйте решить данную задачу хотя бы на 50%.
Задание 3: создайте клиент-серверное приложение “Архив”.
Общие требования к заданию:
• В архиве хранятся Дела (например, студентов). Архив находится на сервере.
• Клиент, в зависимости от прав, может запросить дело на просмотр, внести в него изменения, или создать новое дело.
Требования к коду лабораторной работы:
• Для реализации сетевого соединения используйте сокеты.
• Формат хранения данных на сервере – xml-файлы.*/

import by.jonline.task6.task3.bean.Student;
import by.jonline.task6.task3.logic.ArchiveClient;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, ClassNotFoundException {

        ArchiveClient client = new ArchiveClient();

        client.logIn("ihar@mail.ru", "12345");
        client.logOut();
        client.register("Himon", "Ihar", "ihar@mail.ru", "12345" );

        System.out.println(client.getUser());

        Student student = client.searchStudent("Вася", "Петров");
        System.out.println(student);
        student.addProgress(9);
        student.setGroup_number(125);
        System.out.println(student);
        client.saveStudent(student);

    }
}
