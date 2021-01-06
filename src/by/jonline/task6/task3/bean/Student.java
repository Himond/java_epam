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

    private String firstName;
    private String lastName;
    private String faculty;
    private int group_number;
    private List<Integer> progress;

    {
        progress = new ArrayList<>();
    }

    public Student() {
    }

    public Student(String first_name, String last_name, String faculty, int group_number) {
        this.firstName = first_name;
        this.lastName = last_name;
        this.faculty = faculty;
        this.group_number = group_number;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
                result = lastName.compareTo(o.getLastName());
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return group_number == student.group_number && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(faculty, student.faculty) && Objects.equals(progress, student.progress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, faculty, group_number, progress);
    }

    @Override
    public String toString() {
        return "Student{" +
                "first_name='" + firstName + '\'' +
                ", last_name='" + lastName + '\'' +
                ", faculty='" + faculty + '\'' +
                ", group_number=" + group_number +
                ", progress=" + progress +
                '}';
    }
}
