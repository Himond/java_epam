package by.jonline.progwithclass.simpletaskone;

/*Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
наибольшее значение из этих двух переменных*/

public class Test1<T extends  Number, V extends Number> {

    private T x;
    private V y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public V getY() {
        return y;
    }

    public void setY(V y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Test1{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void sumXY(){
        if (this.getX() != null && this.getY() != null){
            System.out.println(this.getX().doubleValue() + this.getY().doubleValue());
        }else if(this.getX() == null){
            System.out.println("Введите X");
        }else{
            System.out.println("Введите Y");
        }

    }
    public void maxValue(){
        if(this.getX() != null && this.getY() != null){
            System.out.println(Math.max(this.getX().doubleValue(), this.getY().doubleValue()));
        }else if(this.getX() == null){
            System.out.println("Введите X");
        }else{
            System.out.println("Введите Y");
        }

    }


}
