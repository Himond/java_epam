package by.jonline.progwithclass.aggregationandcompositionеtaskthree;

/*Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Region {

    private String region_name;
    private City regionCity;
    private List<City> cities;

    public Region(String region_name, City regionCity) {
        this.region_name = region_name;
        this.regionCity = regionCity;
        this.cities = new ArrayList<>();
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    public City getRegionCity() {
        return regionCity;
    }

    public void setRegionCity(City regionCity) {
        this.regionCity = regionCity;
    }

    public List<City> getCities() {
        return cities;
    }

    public void addCity(City city) {
        this.cities.add(city);
    }

    public void removeCity(City city) {
        this.cities.remove(city);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Objects.equals(region_name, region.region_name) && Objects.equals(regionCity, region.regionCity) && Objects.equals(cities, region.cities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region_name, regionCity, cities);
    }

    @Override
    public String toString() {
        return "Region{" +
                "region_name='" + region_name + '\'' +
                ", regionCity=" + regionCity +
                ", cities=" + cities +
                '}';
    }
}
