package by.jonline.progwithclass.simpletaskseven;

/*Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
вычисления площади, периметра и точки пересечения медиан.*/

public class TriangleMain {
    public static void main(String[] args) {
        Point A = new Point(1, 1);
        Point B = new Point(4, 2);
        Point C = new Point(1, 8);

        Triangle triangle = new Triangle(A, B, C);
        TriangleLogic logic = new TriangleLogic();

        System.out.println(logic.perimeter(triangle));
        System.out.println(logic.square(triangle));
        System.out.println(logic.pointMedian(triangle));

    }
}
