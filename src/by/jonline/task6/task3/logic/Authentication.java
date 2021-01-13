package by.jonline.task6.task3.logic;

import by.jonline.task6.task3.bean.User;
import by.jonline.task6.task3.dao.UserDao;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class Authentication {

    private final MessageDigest md5 = MessageDigest.getInstance("MD5");
    private final UserEmailValidator validator = new UserEmailValidator();

    private final UserAnalyzerXML userAnalyzer = new UserAnalyzerXML();
    private final UserDao userDao = new UserDao();

    public Authentication() throws NoSuchAlgorithmException {
    }

    public User logIn(final String email, String password) throws IOException {
        User getUser = null;
        String hashPassword = encode(password);
        List<User> users = userAnalyzer.getUsers(userDao.read());
        for (User user: users){
            if(user.getEmail().equals(email) && user.getPassword().equals(hashPassword)){
                getUser = user;
                break;
            }
        }
        return getUser;
    }

    public User register(String login, String name, String email, String password) throws IOException {
        User newUser = null;
        if(validator.isValid(email)){
            String hashPassword = encode(password);
            newUser = new User(login, name, email, hashPassword, false);
            userAnalyzer.addUser(newUser, userDao);
        }
        return newUser;
    }

    public User registerAsAdmin(String login, String name, String email, String password) throws IOException {
        User admin = null;
        if(validator.isValid(email)){
            String hashPassword = encode(password);
            admin = new User(login, name, email, hashPassword, true);
            userAnalyzer.addUser(admin, userDao);
        }
        return admin;
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
