package by.jonline.progwithclasses.simpletaskseven;


import java.util.Arrays;

public class TriangleMain {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new double[]{1, 1},new double[]{4, 5},new double[]{1, 8});
        System.out.println(triangle.perimeter());
        System.out.println(triangle.square());
        System.out.println(Arrays.toString(triangle.pointMedians()));
    }
}
