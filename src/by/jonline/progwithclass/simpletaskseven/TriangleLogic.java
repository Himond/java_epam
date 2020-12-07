package by.jonline.progwithclass.simpletaskseven;

/*Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
вычисления площади, периметра и точки пересечения медиан.*/

public class TriangleLogic {

    private double lengthSide(Point A, Point B){
        return Math.sqrt(Math.pow(A.getX() - B.getX(), 2) + Math.pow(A.getY() - B.getY(), 2));
    }

    private Point baseMedian(Point A, Point B){

        double xM;
        double yM;

        xM = (A.getX() + B.getX()) / 2;
        yM = (A.getY() + B.getY()) / 2;

        return new Point(xM, yM);
    }


    public double perimeter(Triangle triangle){
        double perimeter = 0;

        if(checkTriangle(triangle)){
            perimeter = lengthSide(triangle.getA(), triangle.getB()) + lengthSide(triangle.getB(), triangle.getC()) +
                    lengthSide(triangle.getA(), triangle.getC());
        }

        return perimeter;
    }

    public double square(Triangle triangle){
        double square = 0;
        double perimeter = perimeter(triangle);
        if (checkTriangle(triangle)){
            square = Math.sqrt(perimeter * (perimeter - lengthSide(triangle.getA(), triangle.getB())) *
                    (perimeter - lengthSide(triangle.getB(), triangle.getC())) * (perimeter - lengthSide(triangle.getC(), triangle.getA())));
        }
        return square;
    }



    public Point pointMedian(Triangle triangle){

        Point mBC;
        Point mAC;
        double[][] matrix;
        double d;
        double d1;
        double d2;

        mBC = baseMedian(triangle.getB(), triangle.getC());
        mAC = baseMedian(triangle.getA(), triangle.getC());

        matrix = new double[][]{{mBC.getY() - triangle.getA().getY(), triangle.getA().getX()- mBC.getX() ,
                triangle.getA().getX() * (mBC.getY() - triangle.getA().getY()) - triangle.getA().getY() * (mBC.getX() - triangle.getA().getX())},{mAC.getY() - triangle.getB().getY(),
                triangle.getB().getX() - mAC.getX(), triangle.getB().getX() * (mAC.getY() - triangle.getB().getY()) - triangle.getB().getY() * (mAC.getX() - triangle.getB().getX())}};

        d = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        d1 = matrix[0][2] * matrix[1][1] - matrix[1][2] * matrix[0][1];
        d2 = matrix[0][0] * matrix[1][2] - matrix[1][0] * matrix[0][2];

        return new Point(d1 / d, d2 / d);
    }


    public boolean checkTriangle(Triangle triangle){

        double a = lengthSide(triangle.getA(), triangle.getB());
        double b = lengthSide(triangle.getB(), triangle.getC());
        double c = lengthSide(triangle.getC(), triangle.getA());

        return (a + b != c) && (a + c != b) && (b + c != a);
    }
}
