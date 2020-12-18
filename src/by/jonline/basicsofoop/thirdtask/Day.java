package by.jonline.basicsofoop.thirdtask;

import java.util.Objects;

public class Day {

    private int number;
    private DayOfWeek dayOfWeek;
    private Month month;


    public Day(int number,  DayOfWeek dayOfWeek, Month month) {
        this.number = number;
        this.dayOfWeek = dayOfWeek;
        this.month = month;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Day day = (Day) o;
        return number == day.number && month == day.month && dayOfWeek == day.dayOfWeek;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, month, dayOfWeek);
    }

    @Override
    public String toString() {
        return "Day{" +
                "number=" + number +
                ", month=" + month +
                ", dayOfWeek=" + dayOfWeek +
                '}';
    }
}
