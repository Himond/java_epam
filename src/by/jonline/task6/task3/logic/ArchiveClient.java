package by.jonline.task6.task3.logic;

import by.jonline.task6.task3.bean.Student;
import by.jonline.task6.task3.bean.User;

import java.io.*;
import java.net.Socket;
import java.util.List;

public class ArchiveClient {

    private User user;
    private String  message;

    public User getUser() {
        return user;
    }

    public void logIn(final String email, final String password) throws IOException, ClassNotFoundException {
        message = "login";
        user = (User)request(message + "&" + email + "&" + password + "\n");
    }

    public void register(final String login, final String name, final String email,final String password) throws IOException, ClassNotFoundException {
        message = "register";
        user = (User)request(message + "&" + login + "&" + name + "&" + email + "&" + password + "\n");
    }

    public void logOut(){
        this.user = null;
    }

    public Student searchStudent(final String firstName, final String lastName) throws IOException, ClassNotFoundException {
        Student student = null;
        if (user != null){
            message = "search";
            student = (Student)request(message + "&" + firstName + "&" + lastName + "\n");
        }
        return student;
    }

    public void createStudent(final String firstName,final String lastName,final String faculty,final int group,final List<Integer> progress) throws IOException, ClassNotFoundException {
        if(user.isStaff() && user != null){
            message = "save";
            request(message + "&" + firstName + "&" + lastName + "&" + faculty + "&" + group
                    + "&" + progress.toString() + "\n");
        }
    }

    public void saveStudent(final Student student) throws IOException, ClassNotFoundException {
        if(this.user.isStaff() && user != null){
            message = "save";
            request(message + "&" + student.getFirstName() + "&" + student.getLastName()
                    + "&" + student.getFaculty() + "&" + student.getGroup_number()
                    + "&" + student.getProgress() + "\n");
        }
    }


    private Object request(String message) throws IOException, ClassNotFoundException {
        Object obj;
        try {
            try(Socket clientSocket = new Socket("localhost", 4004);
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                ObjectInputStream inObj = new ObjectInputStream(clientSocket.getInputStream())){

                out.write(message + "\n");
                out.flush();
                obj = inObj.readObject();

            }
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        }catch (ClassNotFoundException e){
            throw new ClassNotFoundException(e.getMessage());
        }
        return obj;
    }

}
