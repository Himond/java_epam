package by.jonline.progwithclass.simpletaskseven;

/*Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
вычисления площади, периметра и точки пересечения медиан.*/

public class Triangle {

    private double[] A;
    private double[] B;
    private double[] C;
    private double a;
    private double b;
    private double c;

    public Triangle(double[] A, double[] B, double[] C) {
        this.a = lengthSide(A, B);
        this.b = lengthSide(B, C);
        this.c = lengthSide(C, A);
        if((a + b == c) || (a + c == b) || (b + c == a)){
            throw new IllegalArgumentException("The points lie on a straight line");
        }else {
            this.A = A;
            this.B = B;
            this.C = C;
        }
    }

    private double lengthSide(double[] A, double[] B){
        return Math.sqrt(Math.pow(A[0] - B[0], 2) + Math.pow(A[1] - B[1], 2));
    }


    public double[] getA() {
        return A;
    }

    public double[] getB() {
        return B;
    }

    public double[] getC() {
        return C;
    }

    public double getLengthA() {
        return a;
    }

    public double getLengthB() {
        return b;
    }

    public double getLengthC() {
        return c;
    }

    public double perimeter(){
        return a + b + c;
    }

    public double square(){
        double halfPer = perimeter();
        return Math.sqrt(halfPer * (halfPer - a) * (halfPer - b) * (halfPer - c));
    }

    private double[] baseMedian(double[] A, double[] B){
        return new double[] {(A[0] + B[0]) / 2, (A[1] + B[1]) / 2};
    }

    public double[] pointMedians(){
        double[] Mbc = baseMedian(B, C);
        double[] Mac = baseMedian(A, C);
        double[][] matrix = {{Mbc[1] - A[1], A[0] - Mbc[0] , A[0] * (Mbc[1] - A[1]) - A[1] * (Mbc[0] - A[0])},{Mac[1] - B[1],
                B[0] - Mac[0]  , B[0] * (Mac[1] - B[1]) - B[1] * (Mac[0] - B[0])}};
        double d = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        double d1 = matrix[0][2] * matrix[1][1] - matrix[1][2] * matrix[0][1];
        double d2 = matrix[0][0] * matrix[1][2] - matrix[1][0] * matrix[0][2];
        return new double[]{d1 / d, d2 / d};
    }

}
