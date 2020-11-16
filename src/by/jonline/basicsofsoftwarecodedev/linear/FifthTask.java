package by.jonline.basicsofsoftwarecodedev.linear;

public class FifthTask {
    public static void main(String[] args) {
        int timeofsec = 340983;
        System.out.println(timeOfSeconds(timeofsec));
    }

    public static String timeOfSeconds(int sec){
        int hours = sec / 3600 ;
        int minuts = sec % 3600 / 60;
        int seconds = sec % 3600 % 60;
        return (hours < 10 ? "0" + hours : hours) + ":" + (minuts < 10 ? "0" + minuts : minuts) + ":" + (seconds < 10 ? "0" + seconds : seconds);
    }

}
