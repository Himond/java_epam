package by.jonline.progwithclass.simpletaskthree;

/* Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class College {

    private List<Student> students;

    public College() {
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    // метод возвращающий отличников
    public List<Student> exelStudents(){
        List<Student> exelStud = new ArrayList<>();
        for (Student stud: students){
            if(goodGrades(stud.getProgress())){
                exelStud.add(stud);
            }
        }
        return exelStud;
    }

    //метод возвращает true/false если в оценках одни 9, 10
    private boolean goodGrades(int[] progress){
        for (int grade: progress){
            if(grade < 9){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        College group = (College) o;
        return Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }

    @Override
    public String toString() {
        return "Group{" +
                "students=" + students +
                '}';
    }
}
