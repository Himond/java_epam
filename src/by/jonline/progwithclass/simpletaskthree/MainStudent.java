package by.jonline.progwithclass.simpletaskthree;

/* Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

public class MainStudent {
    public static void main(String[] args) {
        College college = new College();

        Student student1 = new Student("Петров И.И.", 201, new int[]{4, 6, 7, 5, 8});
        Student student2 = new Student("Сидоров И.В.", 71, new int[]{8, 9, 9, 10, 9});
        Student student3 = new Student("Зайцев П.А.", 71, new int[]{9, 9, 9, 10, 9});
        Student student4 = new Student("Васильев В.П.", 201, new int[]{3, 6, 3, 5, 5});
        Student student5 = new Student("Воробьев В.И.", 71, new int[]{4, 4, 4, 4, 4});
        Student student6 = new Student("Новиков А.В.", 180, new int[]{9, 9, 9, 10, 10});
        Student student7 = new Student("Моисеев А.Н.", 201, new int[]{10, 10, 10, 10, 10});
        Student student8 = new Student("Романов А.А.", 180, new int[]{4, 3, 10, 5, 8});
        Student student9 = new Student("Герасимов Е.А.", 201, new int[]{4, 6, 8, 9, 8});
        Student student10 = new Student("Шершнев С.А.", 71, new int[]{3, 2, 7, 1, 8});

        college.addStudent(student1);
        college.addStudent(student2);
        college.addStudent(student3);
        college.addStudent(student4);
        college.addStudent(student5);
        college.addStudent(student6);
        college.addStudent(student7);
        college.addStudent(student8);
        college.addStudent(student9);
        college.addStudent(student10);

        for (Student student: college.exelStudents()){
            System.out.println(student.getSurnameAndInitials() + " " + student.getGroupNumber());
        }



    }
}
