package by.jonline.basicsofsoftwarecodedev.branching;

public class FirstTask {
    public static void main(String[] args) {
        triangle(90, 10);
    }

    public static void triangle(int x, int y){
        int sumAngle = 180;
        if ((x + y) < sumAngle){
            System.out.println("triangle exists");
            if (x == 90 || y == 90 || (sumAngle - (x + y)) == 90){
                System.out.println("right triangle");
            }
        }
    }

}