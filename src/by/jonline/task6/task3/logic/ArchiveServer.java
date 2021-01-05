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

    private static Socket clientSocket;
    private static ServerSocket server;

    private static BufferedReader in;
    private static BufferedWriter out;

    private static ObjectOutputStream outObj;
    private static ObjectInputStream intObj;

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
            try  {
                server = new ServerSocket(4004);
                System.out.println("Сервер запущен!");
                while (true){
                    clientSocket = server.accept();
                    try {

                        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                        outObj = new ObjectOutputStream(clientSocket.getOutputStream());

                        String word = in.readLine();
                        String[] command =  word.split(":");

                        switch (command[0]) {
                            case "login": {

                                String email = command[1];
                                String password = command[2];

                                User user = getUser(email, password);

                                outObj.writeObject(user);

                                break;
                            }
                            case "search": {

                                String first_name = command[1];
                                String second_name = command[2];

                                outObj.writeObject(getStudent(first_name, second_name));

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

                                String first_name = command[1];
                                String last_name = command[2];
                                String faculty = command[3];
                                String group = command[4];
                                String progress = command[5];

                                Student student = new Student();
                                student.setFirst_name(first_name);
                                student.setLast_name(last_name);
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

                    } finally {
                        clientSocket.close();
                        in.close();
                        outObj.close();
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

    private static Student getStudent(String first_name, String last_name) throws IOException {
        Student returnStud = null;
        List<Student> students = studentAnalyzer.getStudents(studentDao.read());
        for (Student student: students){
            if (student.getFirst_name().equals(first_name) && student.getLast_name().equals(last_name)){
                returnStud = student;
            }
        }
        return returnStud;
    }

    private static void saveStudent(Student newStudent) throws IOException {
        List<Student> students = studentAnalyzer.getStudents(studentDao.read());
        for (Student student: students){
            if (student.getFirst_name().equals(newStudent.getFirst_name()) && student.getLast_name().equals(newStudent.getLast_name())){
                studentAnalyzer.removeStudent(student, studentDao);
            }
        }
        studentAnalyzer.addStudent(newStudent, studentDao);
    }



}
