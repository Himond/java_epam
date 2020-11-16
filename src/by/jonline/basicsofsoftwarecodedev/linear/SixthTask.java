package by.jonline.basicsofsoftwarecodedev.linear;
/*Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае: */
public class SixthTask {
    public static void main(String[] args) {
        trueArea(1, 5);
    }

    public static void trueArea (int x, int y){
        System.out.println((-4 <= x && x <= 4) && (-3 <= y && y <= 4));
    }
}
