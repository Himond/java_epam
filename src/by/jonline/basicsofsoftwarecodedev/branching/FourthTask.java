package by.jonline.basicsofsoftwarecodedev.branching;
/*Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
отверстие.
*/
public class FourthTask {
    public static void main(String[] args) {
        brickHole(3, 5, 3, 4, 2);
    }

    public static void brickHole (int A, int B, int x, int y, int z){
        if((x < A & y < B) || (y < A & x < B)){
            System.out.println("The brick will go through the hole");
        }else if((x < A & z < B) || (z < A & x < B)){
            System.out.println("The brick will go through the hole");
        }else if ((z < A & y < B) || (y < A & z < B)){
            System.out.println("The brick will go through the hole");
        }else {
            System.out.println("The brick WON't go through the hole");
        }

    }


}
