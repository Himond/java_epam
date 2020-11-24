package by.jonline.progwithclass.simpletaskone;

/*Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
наибольшее значение из этих двух переменных*/

public class Test1 {

    private double x;
    private double y;

    public Test1(double x, double y) {
        this.x = x;
        this.y = y;
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

    @Override
    public String toString() {
        return "Test1{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double sumXY(){
        return this.getX() + this.getY();
    }

    public double maxValue(){
            return Math.max(this.getX(), this.getY());

    }


}
