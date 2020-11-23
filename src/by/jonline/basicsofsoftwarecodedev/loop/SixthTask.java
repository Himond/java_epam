package by.jonline.basicsofsoftwarecodedev.loop;

/* Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.*/

public class SixthTask {
    public static void main(String[] args) {
        for (int i = 65; i <= 90; i ++){
            System.out.println((char)i  + ": " +  i);
        }
    }
}
