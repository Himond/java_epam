package by.jonline.progwithclass.simpletasksix;

/*
Составьте описание класса для представления времени. Предусмотрте возможности установки времени и изменения
его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
В случае недопустимых значений полей поле устанавливается в значение 0.
Создать методы изменения времени на заданное количество часов, минут и секунд.
*/

public class TimeMain {
    public static void main(String[] args) {
        Time time = new Time(2, 0, 0);
        TimeLogic logic = new TimeLogic();

        logic.printTime(time);

        for (int i = 1; i <= 60; i++){
            logic.changeTime(0, -1, 1, time);
            logic.printTime(time);
        }

        logic.setHour(23, time);
        logic.setMinute(23, time);
        logic.setSecond(23, time);

        logic.printTime(time);
    }

}
