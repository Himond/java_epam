package by.jonline.progwithclass.aggregationandcompositionеtasktwo;

/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.*/

import java.util.Objects;

public class Wheel {

    private final String MANUFACTURER;
    private final int WIDTH;
    private final int HIGHT_TO_WIDTH_RATIO;
    private final char TIRE_DESIGN;
    private final int DIAMETER;
    private final int LOAD_INDEX;
    private final char SPEED_INDEX;
    private int mileage;
    private final int MAX_DISTANCE = (int) (40000 * Math.random());

    public Wheel(String manufacturer, int width, int height_to_width_ratio, char tire_design, int diameter, int load_index, char speed_index) {
        this.MANUFACTURER = manufacturer;
        this.WIDTH = width;
        this.HIGHT_TO_WIDTH_RATIO = height_to_width_ratio;
        this.TIRE_DESIGN = tire_design;
        this.DIAMETER = diameter;
        this.LOAD_INDEX = load_index;
        this.SPEED_INDEX = speed_index;
        this.mileage = 0;
    }

    public String getManufacturer() {
        return MANUFACTURER;
    }

    public int getWidth() {
        return WIDTH;
    }

    public int getHeight_to_width_ratio() {
        return HIGHT_TO_WIDTH_RATIO;
    }

    public char getTire_design() {
        return TIRE_DESIGN;
    }

    public int getDiameter() {
        return DIAMETER;
    }

    public int getLoad_index() {
        return LOAD_INDEX;
    }

    public char getSpeed_index() {
        return SPEED_INDEX;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return WIDTH == wheel.WIDTH &&
                HIGHT_TO_WIDTH_RATIO == wheel.HIGHT_TO_WIDTH_RATIO &&
                TIRE_DESIGN == wheel.TIRE_DESIGN &&
                DIAMETER == wheel.DIAMETER &&
                LOAD_INDEX == wheel.LOAD_INDEX &&
                SPEED_INDEX == wheel.SPEED_INDEX &&
                Objects.equals(MANUFACTURER, wheel.MANUFACTURER);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MANUFACTURER, WIDTH, HIGHT_TO_WIDTH_RATIO, TIRE_DESIGN, DIAMETER, LOAD_INDEX, SPEED_INDEX);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "manufacturer='" + MANUFACTURER + '\'' +
                ", dimension type=" + WIDTH + "/" +
                HIGHT_TO_WIDTH_RATIO + " " +
                TIRE_DESIGN +
                DIAMETER + " " +
                LOAD_INDEX +
                SPEED_INDEX +
                '}';
    }

    //the method accumulates wheel wear and returns false if the wheel is worn out
    public boolean checkMileage(int distance){
        return mileage + distance > MAX_DISTANCE;
    }

    //tire mileage change method
    public void tireWear(int distance){
        this.mileage += distance;
    }

}
