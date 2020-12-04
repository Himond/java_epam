package by.jonline.basicsofoop.thirdtask;

/*Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить
информацию о выходных и праздничных днях.*/

public class CalendarMain {
    public static void main(String[] args) {
        Calendar calendar = new Calendar(2020);

        Calendar.Holiday newYear = calendar.new Holiday("Новый Год", 1, Month.JANUARY);
        Calendar.Holiday christmas = calendar.new Holiday("Рождество", 25, Month.DECEMBER);
        Calendar.Holiday easter = calendar.new Holiday("Пасха", 12, Month.APRIL);
        Calendar.Holiday humanRightsDay = calendar.new Holiday("День прав человека", 10, Month.DECEMBER);

        calendar.addHoliday(newYear);
        calendar.addHoliday(christmas);
        calendar.addHoliday(easter);
        calendar.addHoliday(humanRightsDay);

        for (Calendar.Holiday holiday: calendar.getAllHolidays()){
            System.out.println(holiday.getName() + " " + holiday.getDay() + " " + holiday.getMonth());
        }

        System.out.println();

        for (Calendar.Holiday holiday: calendar.getHolidaysInMonth(Month.DECEMBER)){
            System.out.println(holiday.getName() + " " + holiday.getDay() + " " + holiday.getMonth());
        }

        System.out.println(calendar.getSumHolidays());
    }
}
