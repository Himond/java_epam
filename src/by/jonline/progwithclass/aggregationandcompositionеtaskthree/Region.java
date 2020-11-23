package by.jonline.progwithclass.aggregationandcompositionеtaskthree;

/*Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/

import java.util.ArrayList;
import java.util.Arrays;

public class Region {

    private String region_name;
    private City regional_city;
    private City[] cities;
    private CategoriesCity category;
    private int region_area;
    private long region_population;

    public Region(City[] cities, CategoriesCity category) {
        this.cities = cities;
        this.category = category;
        for (City city: cities) {
            if(city.getCategory() == CategoriesCity.DISTRICT){
                this.regional_city = city;
                this.region_name = city.getCity_name() + " region";
            }
            this.region_area += city.getCity_area();
            this.region_population += city.getCity_population();
        }
    }

    //Method add city
    public void addDistrict(City city) {
        ArrayList<City> list= new ArrayList<>(Arrays.asList(cities));
        list.add(city);
        this.region_area += city.getCity_area();
        this.region_population += city.getCity_population();
        this.cities = list.toArray(new City[0]);
    }


    //Method remove city
    public void removeDistrict(City city) {
        ArrayList<City> list= new ArrayList<>(Arrays.asList(cities));
        list.remove(city);
        this.region_area -= city.getCity_area();
        this.region_population -= city.getCity_population();
        this.cities = list.toArray(new City[0]);
    }

    public String getRegion_name() {
        return region_name;
    }

    public City getRegional_city() {
        return regional_city;
    }

    public City[] getCities() {
        return cities;
    }

    public int getRegion_area() {
        return region_area;
    }

    public long getRegion_population() {
        return region_population;
    }

    public CategoriesCity getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Region{" +
                "region_name='" + region_name + '\'' +
                ", regional_city=" + regional_city +
                ", cities=" + Arrays.toString(cities) +
                ", region_area=" + region_area +
                ", region_population=" + region_population +
                '}';
    }
}
