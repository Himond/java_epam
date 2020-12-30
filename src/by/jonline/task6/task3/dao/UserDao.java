package by.jonline.task6.task3.dao;

import by.jonline.task6.task3.bean.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements Dao<User> {

    private File file = new File("src\\by\\jonline\\task6\\task3\\resource\\user.txt");


    @Override
    public void create(User user) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
                bw.write("login:" + user.getLogin() + ",name:" + user.getName() + ",email:" + user.getEmail() +
                        ",password:" + user.getPassword() + ",is_staff:" + user.isIs_staff() + '\n');

        }catch (IOException ex){
            throw new IOException(ex.getMessage());
        }
    }

    @Override
    public List<String> read() throws IOException {
        List<String> users = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null){
                users.add(line);
            }
        }catch (FileNotFoundException ex){
            throw new FileNotFoundException(ex.getMessage());
        }
        return users;
    }

    @Override
    public void update(List<User> list) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (User user: list){
                bw.write("login:" + user.getLogin() + ",name:" + user.getName() + ",email:" + user.getEmail() +
                        ",password:" + user.getPassword() + ",is_staff:" + user.isIs_staff() + '\n');
            }
        }catch (IOException ex){
            throw new IOException(ex.getMessage());
        }
    }


}
