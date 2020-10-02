package basicsOfSoftwareCodeDevelopment;

public class BranchingSecondTask {
    public static void main(String[] args) {
        System.out.println(maxOfMin(5, 23.8999,45.32,2));
    }

    public static double maxOfMin(double a, double b, double c,double d){
        double minab = a < b ? a: b;
        double mincd = c < d ? c: d;
        return minab > mincd ? minab: mincd;
    }
}
