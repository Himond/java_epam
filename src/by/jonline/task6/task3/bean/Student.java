package by.jonline.task6.task3.bean;

/*Попробуйте решить данную задачу хотя бы на 50%.
Задание 3: создайте клиент-серверное приложение “Архив”.
Общие требования к заданию:
• В архиве хранятся Дела (например, студентов). Архив находится на сервере.
• Клиент, в зависимости от прав, может запросить дело на просмотр, внести в него изменения, или создать новое дело.
Требования к коду лабораторной работы:
• Для реализации сетевого соединения используйте сокеты.
• Формат хранения данных на сервере – xml-файлы.*/


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student implements Serializable, Comparable<Student> {

    private static final long serialVersionUID = 1L;

    private String first_name;
    private String last_name;
    private String faculty;
    private int group_number;
    private List<Integer> progress;

    {
        progress = new ArrayList<>();
    }

    public Student() {
    }

    public Student(String first_name, String last_name, String faculty, int group_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.faculty = faculty;
        this.group_number = group_number;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getGroup_number() {
        return group_number;
    }

    public void setGroup_number(int group_number) {
        this.group_number = group_number;
    }

    public List<Integer> getProgress() {
        return progress;
    }

    public void addProgress(Integer progress) {
        this.progress.add(progress);
    }

    public void updateProgress(Integer progress, int position) {
        this.progress.set(position, progress);
    }

    @Override
    public int compareTo(Student o) {
        int result = faculty.compareTo(o.getFaculty());
        if(result == 0){
            if(group_number < o.getGroup_number()){
                result = -1;
            }else if(group_number > o.getGroup_number()){
                result = 1;
            }else {
                result = last_name.compareTo(o.getLast_name());
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return group_number == student.group_number && Objects.equals(first_name, student.first_name) && Objects.equals(last_name, student.last_name) && Objects.equals(faculty, student.faculty) && Objects.equals(progress, student.progress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first_name, last_name, faculty, group_number, progress);
    }

    @Override
    public String toString() {
        return "Student{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", group_number=" + group_number +
                ", progress=" + progress +
                '}';
    }
}
