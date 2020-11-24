package by.jonline.progwithclass.simpletaskseven;

/*Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
вычисления площади, периметра и точки пересечения медиан.*/

public class TriangleMain {
    public static void main(String[] args) {
        Point A = new Point(1, 1);
        Point B = new Point(4, 5);
        Point C = new Point(1, 8);

        Triangle triangle = new Triangle(A, B, C);

        System.out.println(triangle.perimeter());
        System.out.println(triangle.square());
        System.out.println(triangle.pointMedians());
    }
}
