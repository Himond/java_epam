package by.jonline.task6.task3.logic;



import by.jonline.task6.task3.bean.User;
import by.jonline.task6.task3.dao.UserDao;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserAnalyzerXML {

    private final String p_user = "<user id=\"\\d+\">([\\W\\S]*?)<\\/user>";
    private final String p_login = "<login>([\\W\\S]*?)<\\/login>";
    private final String p_name = "<name>(.*?)<\\/name>";
    private final String p_email = "<email>(.*)<\\/email>";
    private final String p_password = "<password>(.*)<\\/password>";
    private final String p_is_staff = "<is_staff>(.*)<\\/is_staff>";


    public List<User> getUsers(String data){

        String stud_xml;
        String login = null;
        String name = null;
        String email = null;
        String password= null;
        String  is_staff = null;

        User newUser;
        List<User> users = new ArrayList<>();

        Matcher matcher;

        Pattern patternStudent = Pattern.compile(p_user, Pattern.DOTALL);
        Matcher matcherStudent = patternStudent.matcher(data);

        while (matcherStudent.find()){

            stud_xml = matcherStudent.group(1);
            newUser = new User();

            matcher = Pattern.compile(p_login).matcher(stud_xml);
            if(matcher.find()){
                login = matcher.group(1);
            }

            matcher = Pattern.compile(p_name).matcher(stud_xml);
            if(matcher.find()){
                name = matcher.group(1);
            }

            matcher = Pattern.compile(p_email).matcher(stud_xml);
            if(matcher.find()){
                email = matcher.group(1);
            }

            matcher = Pattern.compile(p_password).matcher(stud_xml);
            if(matcher.find()){
                password = matcher.group(1);
            }

            matcher = Pattern.compile(p_is_staff).matcher(stud_xml);
            if(matcher.find()){
                is_staff = matcher.group(1);
            }

            newUser.setLogin(login);
            newUser.setName(name);
            newUser.setEmail(email);
            newUser.setPassword(password);
            newUser.setIs_staff(Boolean.parseBoolean(is_staff));

            users.add(newUser);
        }

        return users;
    }

    public void addUser(User user, UserDao dao) throws IOException {

        String data = dao.read();
        int id = 1;
        String newStudent;

        StringBuilder newUsers = new StringBuilder();
        newUsers.append("<archive>").append("\n");

        String stud_xml;

        Pattern patternStudent = Pattern.compile(p_user, Pattern.DOTALL);
        Matcher matcherStudent = patternStudent.matcher(data);

        while (matcherStudent.find()){
            newUsers.append("\t").append("<user id=\"").append(id).append("\">");
            stud_xml = matcherStudent.group(1);
            newUsers.append(stud_xml);
            newUsers.append("</user>").append("\n");
            id += 1;
        }

        newStudent = createStringUser(user, id);
        newUsers.append(newStudent);
        newUsers.append("</archive>");

        dao.update(newUsers.toString());
    }

    private String createStringUser(User user, int id){
        StringBuilder newUser = new StringBuilder();
        newUser.append("\t").append("<user id=\"").append(id).append("\">").append("\n");
        newUser.append("\t\t").append("<login>").append(user.getLogin()).append("</login>").append("\n");
        newUser.append("\t\t").append("<name>").append(user.getName()).append("</name>").append("\n");
        newUser.append("\t\t").append("<email>").append(user.getEmail()).append("</email>").append("\n");
        newUser.append("\t\t").append("<password>").append(user.getPassword()).append("</password>").append("\n");
        newUser.append("\t\t").append("<is_staff>").append(user.isIs_staff()).append("</is_staff>").append("\n");
        newUser.append("\t").append("</user>").append("\n");
        return newUser.toString();
    }

}
