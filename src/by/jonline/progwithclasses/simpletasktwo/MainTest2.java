package by.jonline.progwithclasses.simpletasktwo;

public class MainTest2 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        System.out.println(test2.getX() + " " + test2.getY());
        Test2 test21 = new Test2(5.6, 2);
        System.out.println(test21.getX() + " " + (int)test21.getY());
    }
}
