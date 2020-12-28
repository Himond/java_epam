package by.jonline.task6.task1.logic;

import by.jonline.task6.task1.bean.User;
import by.jonline.task6.task1.dao.UserDao;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class Authentication {

    private final MessageDigest md5 = MessageDigest.getInstance("MD5");

    private UserConverter converter = new UserConverter();
    private UserDao userDao = new UserDao();

    public Authentication() throws NoSuchAlgorithmException {
    }

    public User logIn(String email, String password) throws IOException {
        User getUser = null;
        String hashPassword = encode(password);
        List<User> users = converter.convertData(userDao.getAll());
        for (User user: users){
            if(user.getEmail().equals(email) && user.getPassword().equals(hashPassword)){
                getUser = user;
                break;
            }
        }
        return getUser;
    }

    public User register(String login, String name, String email, String password) throws IOException {
        boolean is_stuff = false;
        User newUser = null;
        if(checkEmail(email)){
            String hashPassword = encode(password);
            newUser = new User(login, name, email, hashPassword, is_stuff);
            userDao.save(newUser);
        }
        return newUser;
    }

    public User registerAsAdmin(String login, String name, String email, String password) throws IOException {
        boolean is_stuff = true;
        User admin = null;
        if(checkEmail(email)){
            String hashPassword = encode(password);
            admin = new User(login, name, email, hashPassword, is_stuff);
            userDao.save(admin);
        }
        return admin;
    }


    private boolean checkEmail(String email) throws IOException {
        boolean check = true;
        List<User> users = converter.convertData(userDao.getAll());
        for (User user: users){
            if (user.getEmail().equals(email)) {
                check = false;
                break;
            }
        }
        return check;
    }

    private String encode(String password){
        byte[]hashInBytes = md5.digest(password.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        for (byte b : hashInBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

}
