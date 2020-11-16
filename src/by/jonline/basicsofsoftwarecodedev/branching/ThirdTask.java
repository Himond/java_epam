package by.jonline.basicsofsoftwarecodedev.branching;
/*. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой. */
public class ThirdTask {
    public static void main(String[] args) {
        straightLineEquation(2,2,4,4,-2,-2);
    }

    public static void straightLineEquation(int x1, int y1, int x2, int y2, int x3, int y3){
        int lineequation = ((y2 - y1)/(x2 - x1) * (x3 - x1)) - y3 + y1;
        if (lineequation == 0) {
            System.out.println("points are on the same straight line");
        }else {
            System.out.println("points are NOT on the same straight line");
        }


    }
}
