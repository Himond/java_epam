package by.jonline.basicsofsoftwarecodedev.linear;

/* Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc. */

public class FifthTask {

    public static void main(String[] args) {
        int time_of_sec = 340983;
        System.out.println(timeOfSeconds(time_of_sec));
    }

    public static String timeOfSeconds(int sec){
        String result;
        int hours = sec / 3600;
        int minuts = sec % 3600 / 60;
        int seconds = sec % 3600 % 60;
        result = (hours < 10 ? "0" + hours : hours) + ":" + (minuts < 10 ? "0" + minuts : minuts) +
                ":" + (seconds < 10 ? "0" + seconds : seconds);
        return result;
    }

}
