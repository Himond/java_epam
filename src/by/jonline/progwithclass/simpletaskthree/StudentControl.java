package by.jonline.progwithclass.simpletaskthree;

/* Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

public class StudentControl {

    private final Student[] students;

    public StudentControl(Student[] args) {
        this.students = args;
    }

    // метод возвращающий отличников
    public void exelStudents(){
        for (Student stud: this.students){
            if(goodGrades(stud.getProgress())){
                System.out.println(stud.getSurnameAndInitials() + " " + stud.getGroupNumber());
            }
        }
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

}
