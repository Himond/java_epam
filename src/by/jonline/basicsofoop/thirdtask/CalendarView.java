package by.jonline.basicsofoop.thirdtask;

import java.util.Collections;
import java.util.List;

public class CalendarView {

    //выводим календарь на консоль отсортированный по дням и месяцам
    public void printCalendar(Calendar calendar){
        Collections.sort(calendar.getDays(), new ComparatorByDay());
        Collections.sort(calendar.getDays(), new ComparatorByMonth());
        for (Day day: calendar.getDays()){
            System.out.println(day.getNumber() + " " + day.getMonth() + ": " + day.getDayOfWeek());
        }
    }

    //выводим календарь на консоль отсортированный по дням и месяцам
    public void printHolidays(Calendar calendar){
        Collections.sort(calendar.getHolidays(), new ComparatorByDay());
        Collections.sort(calendar.getHolidays(), new ComparatorByMonth());
        for (Calendar.Holiday holiday: calendar.getHolidays()){
            System.out.println(holiday.getDayOfWeek() + " " + holiday.getNumber() + " " + holiday.getMonth() + ": " + holiday.getName() );
        }
    }

    public void printHolidays(List<Calendar.Holiday> holidays){
        Collections.sort(holidays, new ComparatorByDay());
        for (Calendar.Holiday holiday: holidays){
            System.out.println(holiday.getDayOfWeek() + " " + holiday.getNumber() + " " + holiday.getMonth() + ": " + holiday.getName() );
        }
    }

}
