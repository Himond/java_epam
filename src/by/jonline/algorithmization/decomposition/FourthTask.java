package by.jonline.algorithmization.decomposition;

import java.util.Arrays;

public class FourthTask {
    public static void main(String[] args) {
        int[][] arrPoints = {{1, 2}, {3, 4}, {3, 6}, {6, 1}, {-2, -1}, {1, 1}, {5, 7}};
        minDist(arrPoints);
    }
    public static void minDist(int[][] arrPoints){
        double maxdist = 0;
        int pointA = 0;
        int pointB = 0;
        for (int i = 0; i < arrPoints.length; i++) {
            for (int j = i; j < arrPoints.length; j++) {
                if(i != j){
                    double distAB = Math.sqrt(Math.pow(arrPoints[j][0] - arrPoints[i][0], 2) + Math.pow((arrPoints[j][1] - arrPoints[i][1]), 2));
                    if(distAB > maxdist){
                        maxdist = distAB;
                        pointA = i;
                        pointB = j;
                    }
                    maxdist = maxdist == -1 || distAB < maxdist ? distAB : maxdist;
                }
            }
        }
        System.out.println("Max distance: " + maxdist + ", point A: " + Arrays.toString(arrPoints[pointA]) + ", point B: " + Arrays.toString(arrPoints[pointB]));
    }
}
