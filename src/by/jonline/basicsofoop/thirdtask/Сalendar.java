package by.jonline.basicsofoop.thirdtask;

/*Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить
информацию о выходных и праздничных днях.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Calendar {

    private List<Day> days;
    private List<Holiday> holidays;
    private int year;


    {
        this.holidays = new ArrayList<>();
        this.days = new ArrayList<>();
    }

    public Calendar(int year) {
        this.year = year;
    }

    public void addHoliday(Holiday holiday){
        holidays.add(holiday);
    }

    public void removeHoliday(Holiday holiday){
        holidays.remove(holiday);
    }

    public void addDay(Day day){
        days.add(day);
    }

    public void removeDay(Day day){
        days.remove(day);
    }


    public List<Holiday> getHolidays() {
        return holidays;
    }

    public List<Day> getDays() {
        return days;
    }

    public int getAmountHolidays() {
        return holidays.size();
    }

    public static class Holiday extends Day{

        private String name;

        public Holiday(String name, int number, DayOfWeek dayOfWeek, Month month) {
            super(number, dayOfWeek, month);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            Holiday holiday = (Holiday) o;
            return Objects.equals(name, holiday.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), name);
        }

        @Override
        public String toString() {
            return "Holiday{" +
                    "name='" + name + " ,number=" + super.getNumber() +
                    ", month=" + super.getMonth() +
                    ", dayOfWeek=" + super.getDayOfWeek() +
                    '}';
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calendar calendar = (Calendar) o;
        return year == calendar.year && Objects.equals(holidays, calendar.holidays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(holidays, year);
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "holidays=" + holidays +
                ", year=" + year +
                '}';
    }
}
