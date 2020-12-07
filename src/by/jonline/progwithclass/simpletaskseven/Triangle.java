package by.jonline.progwithclass.simpletaskseven;

/*Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
вычисления площади, периметра и точки пересечения медиан.*/

import java.util.Objects;

public class Triangle {

    private Point A;
    private Point B;
    private Point C;

    public Triangle(Point a, Point b, Point c) {
        A = a;
        B = b;
        C = c;
    }

    public Point getA() {
        return A;
    }

    public void setA(Point a) {
        A = a;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point b) {
        B = b;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point c) {
        C = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return A.equals(triangle.A) && B.equals(triangle.B) && C.equals(triangle.C);
    }

    @Override
    public int hashCode() {
        return Objects.hash(A, B, C);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                '}';
    }
}
