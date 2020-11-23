package by.jonline.basicsofsoftwarecodedev.branching;

/* Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.
*/

public class FirstTask {
    public static void main(String[] args) {
        triangle(90, 10);
    }

    public static void triangle(int x, int y){
        int sumAngle = 180;
        if (x > 0 && y > 0){
            if ((x + y) < sumAngle){
                System.out.println("triangle exists");
                if (x == 90 || y == 90 || (sumAngle - (x + y)) == 90){
                    System.out.println("right triangle");
                }
            }else {
                System.out.println("triangle does not exist");
            }
        }else {
            System.out.println("incorrect parameters entered");
        }
    }

}
