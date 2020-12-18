package by.jonline.basicsofoop.thirdtask;

/*Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить
информацию о выходных и праздничных днях.*/

import java.util.ArrayList;
import java.util.List;

public class CalendarLogic {

    //Создаем заполненный календарь
    public Calendar createCalendar(int year){
        Calendar calendar = new Calendar(year);
        int amountDayOfWeek = DayOfWeek.values().length;
        DayOfWeek[] dayW = DayOfWeek.values();
        int j = 0;
        for (Month month: Month.values()){
            for (int i = 1; i <= month.getAmountDays(); i++){
                calendar.addDay(new Day(i, dayW[j], month));
                j++;
                if(j >= dayW.length){
                    j = 0;
                }
            }
        }
        return calendar;
    }

    //добавляем в календарь праздничные дни
    public void addHolidays(Calendar.Holiday holiday, Calendar calendar){
        calendar.addHoliday(holiday);
    }

    //получить праздничные дни за определенный месяц
    public List<Calendar.Holiday> getHolidaysInMonth(Month month, Calendar calendar){
        List<Calendar.Holiday> holidaysInMonth = new ArrayList<>();
        for (Calendar.Holiday holiday: calendar.getHolidays()){
            if (holiday.getMonth() == month){
                holidaysInMonth.add(holiday);
            }
        }
        return holidaysInMonth;
    }




}
