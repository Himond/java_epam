package by.jonline.algorithmization.decomposition;

/*Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
треугольника.*/

public class ThirdTask {
    public static void main(String[] args) {

        int a = 12;

        System.out.println(polygonArea(a));
    }
    public static double polygonArea(int a){
        return 6 * (a * a) / (4 * Math.tan( Math.PI / 6)) ;
    }
}
