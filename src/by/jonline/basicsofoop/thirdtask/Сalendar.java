package by.jonline.basicsofoop.thirdtask;

/*Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить
информацию о выходных и праздничных днях.*/

import java.util.ArrayList;

class Calendar {

    private ArrayList<Holiday> holidays;
    private final int year;
    private int sumHolidays;

    public Calendar(int year) {
        this.holidays = new ArrayList<>();
        sumHolidays = 0;
        if(year > 0){
            this.year = year;
        }else {
            this.year = 0;
        }
    }

    public void addHoliday(Holiday holiday){
        holidays.add(holiday);
        sumHolidays += 1;
    }

    public void delHoliday(Holiday holiday){
        holidays.remove(holiday);
        sumHolidays -= 1;
    }

    public ArrayList<Holiday> getAllHolidays() {
        return holidays;
    }

    public ArrayList<Holiday> getHolidaysInMonth(Month month) {
        ArrayList<Holiday> holidaysInMonth = new ArrayList<>();
        for (Holiday holiday: holidays){
            if (holiday.getMonth() == month){
                holidaysInMonth.add(holiday);
            }
        }
        return holidaysInMonth;
    }

    public int getYear() {
        return year;
    }

    public int getSumHolidays() {
        return sumHolidays;
    }


    public class Holiday{

        private String name;
        private int day;
        private Month month;

        public Holiday(String name, int day, Month month) {
            this.name = name;
            this.month = month;

            if(day > 0 && day <= month.getDay()){
                this.day = day;
            }else {
                this.day = 0;
            }

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {

            this.name = name;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            if(day > 0 && day <= month.getDay()){
                this.day = day;
            }else {
                System.out.println("Некорректное значение даты");
            }
        }

        public Month getMonth() {
            return month;
        }

        public void setMonth(Month month) {
            this.month = month;
        }

        @Override
        public String toString() {
            return "Holiday{" +
                    "name='" + name + '\'' +
                    ", day=" + day +
                    ", month=" + month +
                    '}';
        }
    }

}
