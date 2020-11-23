package by.jonline.basicsofsoftwarecodedev.branching;

/*. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой. */

public class ThirdTask {
    public static void main(String[] args) {
        Point A = new Point(1, 1);
        Point B = new Point(2, 2);
        Point C = new Point(-2, -2);
        straightLineEquation(A, B, C);
    }

    public static void straightLineEquation(Point A, Point B, Point C){
        int lineequation = ((B.Y - A.Y)/(B.X - A.X) * (C.X - A.X)) - C.Y + A.Y;
        if (lineequation == 0) {
            System.out.println("points are on the same straight line");
        }else {
            System.out.println("points are NOT on the same straight line");
        }
    }
}

class Point{
    public int X;
    public int Y;

    public Point(int x, int y) {
        X = x;
        Y = y;
    }
}
