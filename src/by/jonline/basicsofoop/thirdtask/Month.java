package by.jonline.basicsofoop.thirdtask;

/*Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить
информацию о выходных и праздничных днях.*/

public enum Month {

    JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31),
    JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);

    private int day;

    Month(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }


}
