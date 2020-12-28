package by.jonline.task6.task1.dao;

import by.jonline.task6.task1.bean.User;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class UserDao implements Dao<User>{

    private File file = new File("src\\by\\jonline\\task6\\task1\\resource\\user.txt");

    @Override
    public void save(User user) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write("login:" + user.getLogin() + ",name:" + user.getName() + ",email:" + user.getEmail() +
                    ",password:" + user.getPassword() + ",is_staff:" + user.isIs_staff() + '\n');
        }catch (IOException ex){
            throw new IOException(ex.getMessage());
        }
    }

    @Override
    public List<String> getAll() throws IOException {
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





}
