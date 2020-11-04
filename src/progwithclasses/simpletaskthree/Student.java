package progwithclasses.simpletaskthree;

/* Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

import java.util.Arrays;

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
    public String toString() {
        return "Student{" +
                "surnameAndInitials='" + surnameAndInitials + '\'' +
                ", groupNumber=" + groupNumber +
                ", progress=" + Arrays.toString(progress) +
                '}';
    }
}
