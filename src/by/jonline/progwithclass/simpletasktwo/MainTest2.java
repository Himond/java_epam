package by.jonline.progwithclass.simpletasktwo;

/*Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
класса.*/

public class MainTest2 {
    public static void main(String[] args) {

        Test2 test2 = new Test2();
        Test2 test21 = new Test2(5.6, 2);

        System.out.println(test2.getX() + " " + test2.getY());
        System.out.println(test21.getX() + " " + test21.getY());

    }
}
