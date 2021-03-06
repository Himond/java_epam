package by.jonline.progwithclass.aggregationandcompositionеtaskthree;

/*Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/

import java.util.Objects;

public class District {

    private String district_name;
    private int total_area;
    private long population;

    public District(String district_name, int total_area, long population) {
        this.district_name = district_name;
        this.total_area = total_area;
        this.population = population;
    }

    public String getDistrict_name() {
        return district_name;
    }

    public void setDistrict_name(String district_name) {
        this.district_name = district_name;
    }

    public int getTotal_area() {
        return total_area;
    }

    public void setTotal_area(int total_area) {
        this.total_area = total_area;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return total_area == district.total_area && population == district.population && Objects.equals(district_name, district.district_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(district_name, total_area, population);
    }

    @Override
    public String toString() {
        return "District{" +
                "district_name='" + district_name + '\'' +
                ", total_area=" + total_area +
                ", population=" + population +
                '}';
    }
}
