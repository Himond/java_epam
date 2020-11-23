package by.jonline.progwithclass.simpletasksix;

/*
Составьте описание класса для представления времени. Предусмотрте возможности установки времени и изменения
его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
В случае недопустимых значений полей поле устанавливается в значение 0.
Создать методы изменения времени на заданное количество часов, минут и секунд.
*/

public class TimeMain {
    public static void main(String[] args) {
        Time time = new Time(12, 0, 0);

        System.out.println(time.getTime());
        for (int i = 1; i <= 60; i++){
            time.changeTime(0, -1, 1);
            System.out.println(time.getTime());
        }
        try {
            time.setHours(23);
            time.setMinutes(23);
            time.setSeconds(23);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(time.getTime());
    }

}
