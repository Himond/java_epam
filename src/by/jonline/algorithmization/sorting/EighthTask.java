package by.jonline.algorithmization.sorting;

/*Даны дроби p1/q1, p2/q2, ... , pn/qn (pi, qi - натуральные). Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в порядке возрастания.
*/

import java.util.Arrays;

public class EighthTask {

    public static void main(String[] args) {
        Fraction[] arrf = {new Fraction(1,2), new Fraction(-2,3),
                new Fraction(1,3), new Fraction(2,4), new Fraction(1, 6)};

        fractionsSort(arrf);
        sortShell(arrf);
        System.out.println(Arrays.toString(arrf));

    }

    public static void fractionsSort(Fraction[] arr){

        int newNum;
        int newDenom;
        int commonDem = 0;
        int count = 1;

        for (Fraction s : arr) {
            if (commonDem < s.denominator) {
                commonDem = s.denominator;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if((commonDem * count) % (arr[i].denominator) != 0){
                i = 0;
                count++;
            }
        }

        newDenom = commonDem * count;
        for (Fraction fraction : arr) {
            newNum = newDenom / fraction.denominator * fraction.numerator;
            fraction.numerator = newNum;
            fraction.denominator = newDenom;
        }
    }

    public static void sortShell(Fraction[] arr){

        int i = 0;

        while (i < arr.length - 1){
            if(arr[i].numerator > arr[i + 1].numerator){
                Fraction key = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = key;
                if(i != 0){
                    i--;
                }
            }else {
                i++;
            }
        }

    }

}

class Fraction{

    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return + numerator +
                "/" + denominator;
    }
}