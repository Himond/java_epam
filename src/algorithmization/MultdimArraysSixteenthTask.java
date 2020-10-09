package algorithmization;

import java.util.Arrays;

public class MultdimArraysSixteenthTask {
    public static void main(String[] args) {
        magicSquare(8);
    }

    public static void magicSquare(int n) {
        int[][] magicarr = new int[n][n];
        int zeroI, zeroJ;
        int halfSquare = magicarr.length / 2;
        //Квадрат нечетного порядка
        if (n % 2 != 0) {
            zeroI = 0;
            zeroJ = halfSquare;
            fillSquare(magicarr, 0, n * n, zeroI, zeroJ, 0, n, n, n);

        //Квадрат порядка одинарной точности
        }else if( n % 4 != 0 && n != 2 && n % 2 == 0 ) {
            int range = n * n / 4;
            int quaterSquare = halfSquare / 4;
            for(int i = range; i <= n * n; i += range){
                if(i <= range){
                    zeroI = 0;
                    zeroJ = quaterSquare;
                    fillSquare(magicarr, i - range, i, zeroI, zeroJ, 0, halfSquare, halfSquare, halfSquare);

                }else if(i <= range * 2){
                    zeroI = halfSquare;
                    zeroJ = (magicarr.length - 1) - quaterSquare;
                    fillSquare(magicarr, i - range, i , zeroI, zeroJ, halfSquare, n, halfSquare, halfSquare);

                }else if(i <= range * 3){
                    zeroI = 0;
                    zeroJ = (magicarr.length - 1) - quaterSquare;
                    fillSquare(magicarr, i - range, i , zeroI, zeroJ, 0, n, halfSquare, halfSquare);

                }else{
                    zeroI = halfSquare;
                    zeroJ = quaterSquare;
                    fillSquare(magicarr, i - range, i , zeroI, zeroJ, halfSquare, halfSquare, halfSquare, halfSquare);
                }
            }
            //Квадрат порядка двойной точности
        }else {
            int delArr = n / 4;
            int lenghtArr = magicarr.length - 1;
            int start = 1;
            int fin = n * n;

            for(int i = 0; i < n; i++){
                for (int j = 0; j < n; j++) {
                    if ( i < delArr && j < delArr ) {
                        magicarr[i][j] = start;
                        start++;
                        fin--;
                    }else if(i < delArr && j > lenghtArr - delArr){
                        magicarr[i][j] = start;
                        start++;
                        fin--;
                    }else if (i > lenghtArr - delArr && j < delArr ){
                        magicarr[i][j] = start;
                        start++;
                        fin--;
                    }else if (i > lenghtArr - delArr && j > lenghtArr - delArr ){
                        magicarr[i][j] = start;
                        start++;
                        fin--;
                    }else if((i >= delArr && i <= lenghtArr - delArr) && (j >= delArr && j <= lenghtArr - delArr)){
                        magicarr[i][j] = start;
                        start++;
                        fin--;
                    }else {
                        magicarr[i][j] = fin;
                        start++;
                        fin--;
                    }

                }
            }


        }
        for (int[] elem: magicarr){
            System.out.println(Arrays.toString(elem));
        }
        }


    public static void fillSquare(int[][] arr, int startNum, int finNum, int I, int J, int borderZeroI, int columnBorder, int borderI, int borderJ){
        int newPositionI;
        int newPositionJ;
        for (int i = startNum + 1; i <= finNum; i++){
            arr[I][J] = i;
            newPositionI = I - 1;
            newPositionJ = J + 1;
            if(newPositionI < borderZeroI){
                newPositionI += borderI;
            }
            if(newPositionJ >= columnBorder){
                newPositionJ -= borderJ;
            }
            if(arr[newPositionI][newPositionJ] == 0){
                I = newPositionI;
                J = newPositionJ;
            }else {
                I += 1;
            }
        }

    }


}
