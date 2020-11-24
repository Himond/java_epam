package by.jonline.progwithclass.simpletaskseven;

/*Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
вычисления площади, периметра и точки пересечения медиан.*/

public class Triangle {

    private Point A;
    private Point B;
    private Point C;
    private double a;
    private double b;
    private double c;

    public Triangle(Point A, Point B, Point C) {
        this.a = lengthSide(A, B);
        this.b = lengthSide(B, C);
        this.c = lengthSide(C, A);
        if((a + b == c) || (a + c == b) || (b + c == a)){
            System.out.println("The points lie on a straight line");
        }else {
            this.A = A;
            this.B = B;
            this.C = C;
        }
    }

    private double lengthSide(Point A, Point B){
        return Math.sqrt(Math.pow(A.getX() - B.getX(), 2) + Math.pow(A.getY() - B.getY(), 2));
    }


    public Point getA() {
        return A;
    }

    public Point getB() {
        return B;
    }

    public Point getC() {
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

    private Point baseMedian(Point A, Point B){

        double xM;
        double yM;

        xM = (A.getX() + B.getX()) / 2;
        yM = (A.getY() + B.getY()) / 2;

        return new Point(xM, yM);
    }

    public Point pointMedians(){

        Point mBC;
        Point mAC;
        double[][] matrix;
        double d;
        double d1;
        double d2;

        mBC = baseMedian(B, C);
        mAC = baseMedian(A, C);

        matrix = new double[][]{{mBC.getY() - A.getY(), A.getX()- mBC.getX() ,
                                 A.getX() * (mBC.getY() - A.getY()) - A.getY() * (mBC.getX() - A.getX())},{mAC.getY() - B.getY(),
                                 B.getX() - mAC.getX(), B.getX() * (mAC.getY() - B.getY()) - B.getY() * (mAC.getX() - B.getX())}};

        d = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        d1 = matrix[0][2] * matrix[1][1] - matrix[1][2] * matrix[0][1];
        d2 = matrix[0][0] * matrix[1][2] - matrix[1][0] * matrix[0][2];

        return new Point(d1 / d, d2 / d);
    }

}
