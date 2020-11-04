package progwithclasses.simpletasktwo;

/*Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
класса.*/

public class Test2 {

    private double x;
    private double y;

    public Test2() {
    }

    public <T extends Number, V extends T>Test2(T x, V y) {
        this.x =  x.doubleValue();
        this.y = y.doubleValue();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
