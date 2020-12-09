package by.jonline.progwithclass.aggregationandcompositionеtaskthree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class City {

    private String city_name;
    private List<District> districts;

    public City(String city_name) {
        this.city_name = city_name;
        this.districts = new ArrayList<>();
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void addDistrict(District district) {
        this.districts.add(district);
    }
    public void removeDistrict(District district) {
        this.districts.remove(district);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(city_name, city.city_name) && Objects.equals(districts, city.districts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city_name, districts);
    }

    @Override
    public String toString() {
        return "City{" +
                "city_name='" + city_name + '\'' +
                ", districts=" + districts +
                '}';
    }
}
