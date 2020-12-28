package by.jonline.task6.task1.logic;

import by.jonline.task6.task1.bean.User;

import java.util.ArrayList;
import java.util.List;

public class UserConverter implements Converter<User> {


    @Override
    public List<User> convertData(List<String> list) {
        List<User> users = new ArrayList<>();
        for (String line: list){
            users.add(createUser(line.split(",")));
        }
        return users;
    }

    private User createUser(String[] splitLine){
        User user = new User();
        user.setLogin(splitLine[0].split(":")[1]);
        user.setName(splitLine[1].split(":")[1]);
        user.setEmail(splitLine[2].split(":")[1]);
        user.setPassword(splitLine[3].split(":")[1]);
        user.setIs_staff(Boolean.parseBoolean(splitLine[4].split(":")[1]));
        return user;
    }
}
