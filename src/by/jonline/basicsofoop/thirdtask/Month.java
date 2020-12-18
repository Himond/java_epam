package by.jonline.basicsofoop.thirdtask;

/*Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить
информацию о выходных и праздничных днях.*/

public enum Month {

    JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31),
    JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);

    private int amountDays;

    Month(int amountDays) {
        this.amountDays = amountDays;
    }

    public int getAmountDays() {
        return amountDays;
    }


}
