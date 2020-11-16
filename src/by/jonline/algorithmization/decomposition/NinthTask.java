package by.jonline.algorithmization.decomposition;

public class NinthTask {
    public static void main(String[] args) {
        System.out.println(areaQuad(4, 6,8, 10));
    }

    public static double areaQuad(double X, double Y, double Z, double T){
        double C = Math.sqrt(X * X + Y * Y);
        double areaXYC = X * Y / 2;
        double perimeterZTC =  (Z + T + C) / 2;
        double areaZTC = Math.sqrt(perimeterZTC * (perimeterZTC - Z) * (perimeterZTC - T) * (perimeterZTC - C));
        return areaXYC + areaZTC;
    }
}
