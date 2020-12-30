package by.jonline.task6.task3.logic;

import by.jonline.task6.task3.bean.User;
import by.jonline.task6.task3.dao.UserDao;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserEmailValidator {

    private UserDao userDao = new UserDao();
    private UserConverter userConverter = new UserConverter();

    public boolean isValid(String email) throws IOException {
        boolean valid = true;
        List<User> users = userConverter.convertData(userDao.read());

        final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        final String EMAIL = "^" + email + "$";

        Pattern pattern;
        Pattern originalEmail;
        Matcher matcher;

        pattern = Pattern.compile(EMAIL_PATTERN);
        originalEmail = Pattern.compile(EMAIL);
        matcher = pattern.matcher(email);

        if(matcher.matches()){
            for (User one: users){
                matcher = originalEmail.matcher(one.getEmail());
                if(matcher.matches()){
                    valid = false;
                    break;
                }
            }
        }else {
            valid = false;
        }

        return valid;
    }

}

