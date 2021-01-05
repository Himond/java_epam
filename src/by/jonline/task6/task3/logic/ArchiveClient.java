package by.jonline.task6.task3.logic;

import by.jonline.task6.task3.bean.Student;
import by.jonline.task6.task3.bean.User;

import java.io.*;
import java.net.Socket;
import java.util.List;

public class ArchiveClient {

    private User user;
    private String  message;

    private static Socket clientSocket;
    private static BufferedReader reader;

    private static BufferedReader in;
    private static BufferedWriter out;

    private static ObjectInputStream inObj;
    private static ObjectOutputStream outObj;


    public User getUser() {
        return user;
    }

    public void logIn(String email, String password){
        try {
            try {
                message = "login";
                clientSocket = new Socket("localhost", 4004);
                out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                inObj = new ObjectInputStream(clientSocket.getInputStream());
                out.write(message + ":" + email + ":" + password + "\n");
                out.flush();

                this.user = (User) inObj.readObject();

            } finally {
                clientSocket.close();
                inObj.close();
                out.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e);
        }
    }

    public void register(String login, String name, String email, String password){
        try {
            try {
                message = "register";
                clientSocket = new Socket("localhost", 4004);
                out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                inObj = new ObjectInputStream(clientSocket.getInputStream());
                out.write(message + ":" + login + ":" + name + ":" + email + ":" + password + "\n");
                out.flush();
                this.user = (User) inObj.readObject();
            } finally {
                clientSocket.close();
                inObj.close();
                out.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e);
        }
    }

    public void logOut(){
        this.user = null;
    }

    public Student searchStudent(String first_name, String last_name){
        Student student = null;
        if (user != null){
            try {
                try {
                    message = "search";
                    clientSocket = new Socket("localhost", 4004);
                    out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                    inObj = new ObjectInputStream(clientSocket.getInputStream());
                    out.write(message + ":" + first_name + ":" + last_name + "\n");
                    out.flush();
                    student = (Student) inObj.readObject();
                } finally {
                    clientSocket.close();
                    inObj.close();
                    out.close();
                }
            } catch (IOException | ClassNotFoundException e) {
                System.err.println(e);
            }
        }
        return student;
    }

    public void createStudent(String first_name, String last_name, String faculty, int group, List<Integer> progress){
        if(user.isIs_staff() && user != null){
            try {
                try {
                    message = "save";
                    clientSocket = new Socket("localhost", 4004);

                    out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                    out.write(message + ":" + first_name + ":" + last_name + ":" + faculty + ":" + group
                            + ":" + progress.toString() + "\n");
                    out.flush();
                } finally {
                    clientSocket.close();
                    out.close();
                }
            } catch (IOException e) {
                System.err.println(e);
            }
        }
    }

    public void saveStudent(Student student){
        if(this.user.isIs_staff() && user != null){
            try {
                try {
                    message = "save";
                    clientSocket = new Socket("localhost", 4004);

                    out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                    out.write(message + ":" + student.getFirst_name() + ":" + student.getLast_name() + ":" + student.getFaculty() + ":" + student.getGroup_number()
                            + ":" + student.getProgress() + "\n");
                    out.flush();

                } finally {
                    clientSocket.close();
                    out.close();
                }
            } catch (IOException e) {
                System.err.println(e);
            }
        }
    }



























    public static void main(String[] args) {
        try {
            try {
                clientSocket = new Socket("localhost", 4004);
                reader = new BufferedReader(new InputStreamReader(System.in));

                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

                inObj = new ObjectInputStream(clientSocket.getInputStream());
                System.out.println("Вы что-то хотели сказать? Введите это здесь:");

                String word = reader.readLine();

                out.write(word + "\n");

                out.flush();
                Object o = inObj.readObject();
                if (o.getClass() == Student.class){
                    Student student = (Student) o;
                    System.out.println(student);
                }else{
                    User user = (User) o;
                    System.out.println(user);
                }

                //String serverWord = in.readLine();

            } finally {
                System.out.println("Клиент был закрыт...");
                clientSocket.close();
                in.close();
                out.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e);
        }

    }

}
