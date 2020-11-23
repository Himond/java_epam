package by.jonline.basicsofsoftwarecodedev.linear;

/*Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае: */

public class SixthTask {
    public static void main(String[] args) {
        System.out.println(trueArea(1, 1));
    }

    public static boolean trueArea (int x, int y){
        return (-4 <= x && x <= 4) && (-3 <= y && y <= 4);
    }
}
