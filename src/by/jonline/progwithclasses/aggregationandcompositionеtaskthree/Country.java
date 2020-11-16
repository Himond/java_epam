package by.jonline.progwithclasses.aggregationandcompositionеtaskthree;

/*Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/

import java.util.Arrays;

public class Country {

    private String country_name;
    private Region[] regions;
    private City capital;
    private int country_area;
    private long country_population;

    public Country(String country_name, Region[] regions) {
        this.country_name = country_name;
        this.regions = regions;
        for (Region reg: regions){
            if(reg.getCategory() == CategoriesCity.CAPITAL){
                this.capital = reg.getRegional_city();
            }
            this.country_area += reg.getRegion_area();
            this.country_population += reg.getRegion_population();
        }
    }

    public String getCountry_name() {
        return country_name;
    }

    public Region[] getRegions() {
        return regions;
    }

    public City getCapital() {
        return capital;
    }

    public int getCountry_area() {
        return country_area;
    }

    public long getCountry_population() {
        return country_population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country_name='" + country_name + '\'' +
                ", regions=" + Arrays.toString(regions) +
                ", capital=" + capital +
                ", country_area=" + country_area +
                ", country_population=" + country_population +
                '}';
    }
}
