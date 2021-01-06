package by.jonline.task6.task3.logic;

import by.jonline.task6.task3.bean.Student;
import by.jonline.task6.task3.bean.User;
import by.jonline.task6.task3.dao.StudentDao;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.List;


public class ArchiveServer {

    private static ServerSocket server;
    private static Authentication authentication;
    private static StudentDao studentDao = new StudentDao();
    private static StudentAnalyzerXML studentAnalyzer = new StudentAnalyzerXML();

    static {
        try {
            authentication = new Authentication();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        try {
            try {
                server = new ServerSocket(4004);
                System.out.println("Сервер запущен!");
                while (true){
                    try(Socket clientSocket = server.accept();
                        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                        ObjectOutputStream outObj = new ObjectOutputStream(clientSocket.getOutputStream())) {

                        String word = in.readLine();
                        String[] command =  word.split("&");

                        switch (command[0]) {
                            case "login": {

                                String email = command[1];
                                String password = command[2];
                                User user = getUser(email, password);
                                outObj.writeObject(user);
                                break;

                            }
                            case "search": {

                                String firstName = command[1];
                                String secondName = command[2];
                                outObj.writeObject(getStudent(firstName, secondName));
                                break;

                            }
                            case "register": {

                                String login = command[1];
                                String name = command[2];
                                String email = command[3];
                                String password = command[4];
                                outObj.writeObject(authentication.register(login, name, email, password));
                                break;

                            }
                            case "save":{

                                String firstName = command[1];
                                String lastName = command[2];
                                String faculty = command[3];
                                String group = command[4];
                                String progress = command[5];
                                Student student = new Student();
                                student.setFirstName(firstName);
                                student.setLastName(lastName);
                                student.setFaculty(faculty);
                                student.setGroup_number(Integer.parseInt(group));
                                for (char str: progress.toCharArray()){
                                    if (Character.isDigit(str)){
                                        student.addProgress(Integer.parseInt(String.valueOf(str)));
                                    }
                                }
                                saveStudent(student);
                            }
                        }
                        outObj.flush();

                    }
                }

            } finally {
                System.out.println("Сервер закрыт!");
                server.close();
            }

        } catch (IOException e) {
            throw new IOException(e.getMessage());
        }
    }

    private static User getUser(String email, String password) throws IOException {
        return authentication.logIn(email, password);
    }

    private static Student getStudent(final String firstName, final String lastName) throws IOException {
        Student returnStud = null;
        List<Student> students = studentAnalyzer.getStudents(studentDao.read());
        for (Student student: students){
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                returnStud = student;
            }
        }
        return returnStud;
    }

    private static void saveStudent(Student newStudent) throws IOException {
        List<Student> students = studentAnalyzer.getStudents(studentDao.read());
        for (Student student: students){
            if (student.getFirstName().equals(newStudent.getFirstName()) && student.getLastName().equals(newStudent.getLastName())){
                studentAnalyzer.removeStudent(student, studentDao);
            }
        }
        studentAnalyzer.addStudent(newStudent, studentDao);
    }


}
