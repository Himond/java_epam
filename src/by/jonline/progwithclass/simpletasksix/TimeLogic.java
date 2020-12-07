package by.jonline.progwithclass.simpletasksix;
/*
Составьте описание класса для представления времени. Предусмотрте возможности установки времени и изменения
его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
В случае недопустимых значений полей поле устанавливается в значение 0.
Создать методы изменения времени на заданное количество часов, минут и секунд.
*/
public class TimeLogic {

    public void printTime(Time time){
        String hoursToString;
        String minutesToString;
        String secondsToString;

        if(checkTime(time)){
            hoursToString = time.getHour() < 10 ? "0" + time.getHour(): Integer.toString(time.getHour());
            minutesToString = time.getMinute() < 10 ? "0" + time.getMinute(): Integer.toString(time.getMinute());
            secondsToString = time.getSecond() < 10 ? "0" + time.getSecond(): Integer.toString(time.getSecond());
            System.out.println(hoursToString + ":" + minutesToString + ":" + secondsToString);
        }else {
            System.out.println("Неправильно задано время");
        }
    }

    public void setHour(int hour, Time time){
        if(hour >= 0 && hour <= 24){
            time.setHour(hour);
        }else {
            time.setHour(0);
        }
    }

    public void setMinute(int minute, Time time){
        if(minute >= 0 && minute <= 60){
            time.setMinute(minute);
        }else {
            time.setMinute(0);
        }
    }

    public void setSecond(int second, Time time){
        if(second >= 0 && second <= 60){
            time.setSeconds(second);
        }else {
            time.setSeconds(0);
        }
    }

    public void changeTime(int hour, int minute, int second, Time time){
        int changeHour;
        int changeMinute;
        int changeSecond;
        long resultTimeInSec;
        if (checkTime(time)){

            resultTimeInSec = convertTime(hour, minute, second) + convertTime(time.getHour(), time.getMinute(), time.getSecond());

            if(resultTimeInSec >= 86400){
                resultTimeInSec -= (resultTimeInSec / 86400) * 86400;
            }else if(resultTimeInSec < 0){
                resultTimeInSec += 86400;
            }


            changeHour =  (int)resultTimeInSec / 3600;
            changeMinute = (int)(resultTimeInSec - changeHour * 3600) / 60;
            changeSecond = (int)(resultTimeInSec - changeHour * 3600 - changeMinute * 60);

            time.setHour(changeHour);
            time.setMinute(changeMinute);
            time.setSeconds(changeSecond);

        }else {
            time.setHour(0);
            time.setMinute(0);
            time.setSeconds(0);
        }

    }

    private long convertTime(int hours, int minutes, int seconds){
        return (hours * 3600L) + (minutes * 60L) + seconds;
    }

    public boolean checkTime(Time time){
        if(time.getHour() < 0 || time.getHour() > 24){
            return false;
        }else if(time.getMinute() < 0 || time.getMinute() > 60){
            return false;
        }else if(time.getSecond() < 0 || time.getSecond() > 60){
            return false;
        }
        return true;
    }


}
