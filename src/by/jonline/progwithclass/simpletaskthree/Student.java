package by.jonline.progwithclass.simpletaskthree;

/* Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

import java.util.Arrays;
import java.util.Objects;

public class Student {

    private final String surnameAndInitials;
    private final int groupNumber;
    private final int[] progress;

    public Student(String surnameAndInitials, int groupNumber, int[] progress) {
        this.surnameAndInitials = surnameAndInitials;
        this.groupNumber = groupNumber;
        this.progress = progress;
    }


    public String getSurnameAndInitials() {
        return surnameAndInitials;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int[] getProgress() {
        return progress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return groupNumber == student.groupNumber && Objects.equals(surnameAndInitials, student.surnameAndInitials) && Arrays.equals(progress, student.progress);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(surnameAndInitials, groupNumber);
        result = 31 * result + Arrays.hashCode(progress);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surnameAndInitials='" + surnameAndInitials + '\'' +
                ", groupNumber=" + groupNumber +
                ", progress=" + Arrays.toString(progress) +
                '}';
    }

}
