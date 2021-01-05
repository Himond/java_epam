package by.jonline.task6.task3.logic;


import by.jonline.task6.task3.bean.Student;
import by.jonline.task6.task3.dao.StudentDao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentAnalyzerXML {

    private final String p_student = "<student id=\"\\d+\">([\\W\\S]*?)<\\/student>";
    private final String p_first_name = "<first_name>(.*?)<\\/first_name>";
    private final String p_last_name = "<last_name>(.*)<\\/last_name>";
    private final String p_faculty = "<faculty>(.*)<\\/faculty>";
    private final String p_group = "<group>(.*)<\\/group>";
    private final String p_progress = "<progress>(.*)<\\/progress>";



    public List<Student> getStudents(String data) {

        String stud_xml;
        String f_name = null;
        String l_name = null;
        String faculty = null;
        int group = 0;

        Student newStud;
        List<Student> students = new ArrayList<>();

        Matcher matcher;

        Pattern patternStudent = Pattern.compile(p_student, Pattern.DOTALL);
        Matcher matcherStudent = patternStudent.matcher(data);

        while (matcherStudent.find()){

            stud_xml = matcherStudent.group(1);
            newStud = new Student();

            matcher = Pattern.compile(p_first_name).matcher(stud_xml);
            if(matcher.find()){
                f_name = matcher.group(1);
            }

            matcher = Pattern.compile(p_last_name).matcher(stud_xml);
            if(matcher.find()){
                l_name = matcher.group(1);
            }

            matcher = Pattern.compile(p_faculty).matcher(stud_xml);
            if(matcher.find()){
                faculty = matcher.group(1);
            }

            matcher = Pattern.compile(p_group).matcher(stud_xml);
            if(matcher.find()){
                group = Integer.parseInt(matcher.group(1));
            }

            newStud.setFirst_name(f_name);
            newStud.setLast_name(l_name);
            newStud.setFaculty(faculty);
            newStud.setGroup_number(group);


            matcher = Pattern.compile(p_progress).matcher(stud_xml);
            if(matcher.find()){
                for(String num: matcher.group(1).split(" ")){
                    newStud.addProgress(Integer.parseInt(num));
                }
            }

            students.add(newStud);
        }
        return students;
    }

    public void addStudent(Student student, StudentDao dao) throws IOException {

        String data = dao.read();
        int id = 1;
        String newStudent;

        StringBuilder newStudents = new StringBuilder();
        newStudents.append("<archive>").append("\n");

        String stud_xml;

        Pattern patternStudent = Pattern.compile(p_student, Pattern.DOTALL);
        Matcher matcherStudent = patternStudent.matcher(data);

        while (matcherStudent.find()){
            newStudents.append("\t").append("<student id=\"").append(id).append("\">");
            stud_xml = matcherStudent.group(1);
            newStudents.append(stud_xml);
            newStudents.append("</student>").append("\n");
            id += 1;
        }

        newStudent = createStringStudent(student, id);
        newStudents.append(newStudent);
        newStudents.append("</archive>");

        dao.update(newStudents.toString());

    }

    public void removeStudent(Student student, StudentDao dao) throws IOException {

        List<Student> allStud = getStudents(dao.read());
        String newStudent;
        allStud.remove(student);
        int id = 1;
        StringBuilder newStudents = new StringBuilder();
        newStudents.append("<archive>").append("\n");

        for (Student student1: allStud){
            newStudent = createStringStudent(student1, id);
            newStudents.append(newStudent);
            id += 1;
        }

        newStudents.append("</archive>");

        dao.update(newStudents.toString());
    }

    public void updateStudent(List<Student> students, StudentDao dao) throws IOException {

        int id = 1;
        String newStudent;
        StringBuilder newStudents = new StringBuilder();
        newStudents.append("<archive>").append("\n");

        for (Student student: students){
            newStudent = createStringStudent(student, id);
            newStudents.append(newStudent);
            id += 1;
        }

        newStudents.append("</archive>");

        dao.update(newStudents.toString());
    }


    private String createStringStudent(Student student, int id){
        StringBuilder newStudent = new StringBuilder();
        newStudent.append("\t").append("<student id=\"").append(id).append("\">").append("\n");
        newStudent.append("\t\t").append("<first_name>").append(student.getFirst_name()).append("</first_name>").append("\n");
        newStudent.append("\t\t").append("<last_name>").append(student.getLast_name()).append("</last_name>").append("\n");
        newStudent.append("\t\t").append("<faculty>").append(student.getFaculty()).append("</faculty>").append("\n");
        newStudent.append("\t\t").append("<group>").append(student.getGroup_number()).append("</group>").append("\n");
        newStudent.append("\t\t").append("<progress>");
        for (int i = 0; i < student.getProgress().size(); i++){
            if(i != (student.getProgress().size() - 1)){
                newStudent.append(student.getProgress().get(i)).append(" ");
            }else {
                newStudent.append(student.getProgress().get(i));
            }
        }
        newStudent.append("</progress>").append("\n");
        newStudent.append("\t").append("</student>").append("\n");
        return newStudent.toString();
    }


}
