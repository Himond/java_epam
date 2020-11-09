package progwithclasses.simpletasksix;

/*
Составьте описание класса для представления времени. Предусмотрте возможности установки времени и изменения
его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
В случае недопустимых значений полей поле устанавливается в значение 0.
Создать методы изменения времени на заданное количество часов, минут и секунд.
*/

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds){
        if((hours >= 0 && hours < 24) && (minutes >= 0 && minutes < 60) && (seconds >= 0 && seconds < 60)){
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }else {
            throw new IllegalArgumentException("The time is not correct");
        }
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours < 24){
            this.hours = hours;
        }else{
            this.hours = 0;
            throw new IllegalArgumentException("Invalid hours entered");
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60){
            this.minutes = minutes;
        }else{
            this.minutes = 0;
            throw new IllegalArgumentException("Invalid minutes entered");
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60){
            this.seconds = seconds;
        }else{
            this.seconds = 0;
            throw new IllegalArgumentException("Invalid seconds entered");
        }
    }

    public String getTime(){
        String hoursToString = this.hours < 10 ? "0" + this.hours: Integer.toString(this.hours);
        String minutesToString = this.minutes < 10 ? "0" + this.minutes: Integer.toString(this.minutes);
        String secondsToString = this.seconds < 10 ? "0" + this.seconds: Integer.toString(this.seconds);
        return hoursToString + ":" + minutesToString + ":" + secondsToString;
    }

    public void changeTime(int hours, int minutes, int seconds){
        long resultTimeInSec = convertTime(hours, minutes, seconds) + convertTime(this.hours, this.minutes, this.seconds);
        if(resultTimeInSec >= 86400){
            resultTimeInSec -= (resultTimeInSec / 86400) * 86400;
        }else if(resultTimeInSec < 0){
            resultTimeInSec += 86400;
        }
        this.hours = (int)resultTimeInSec / 3600;
        this.minutes = (int)(resultTimeInSec - this.hours * 3600) / 60;
        this.seconds = (int)(resultTimeInSec - this.hours * 3600 - this.minutes * 60);
    }

    private long convertTime(int hours, int minutes, int seconds){
        return (hours * 3600) + (minutes * 60) + seconds;
    }


}
