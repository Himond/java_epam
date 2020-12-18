package by.jonline.basicsofoop.thirdtask;

/*Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить
информацию о выходных и праздничных днях.*/

public class CalendarMain {
    public static void main(String[] args) {

        CalendarLogic logic = new CalendarLogic();
        CalendarView view = new CalendarView();
        Calendar calendar = logic.createCalendar(2020);

        Calendar.Holiday newYear = new Calendar.Holiday("Новый Год", 1, DayOfWeek.WEDNESDAY, Month.JANUARY);
        Calendar.Holiday christmas = new Calendar.Holiday("Рождество", 25, DayOfWeek.FRIDAY, Month.DECEMBER);
        Calendar.Holiday easter = new Calendar.Holiday("Пасха", 12, DayOfWeek.SUNDAY, Month.APRIL);
        Calendar.Holiday humanRightsDay = new Calendar.Holiday("День прав человека", 10, DayOfWeek.THURSDAY, Month.DECEMBER);

        logic.addHolidays(newYear, calendar);
        logic.addHolidays(christmas, calendar);
        logic.addHolidays(easter, calendar);
        logic.addHolidays(humanRightsDay, calendar);

        view.printCalendar(calendar);
        System.out.println();
        view.printHolidays(calendar);
        System.out.println();
        view.printHolidays(logic.getHolidaysInMonth(Month.DECEMBER, calendar));


        System.out.println(calendar.getAmountHolidays());
    }
}
