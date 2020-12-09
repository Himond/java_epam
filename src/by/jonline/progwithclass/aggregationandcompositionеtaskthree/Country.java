package by.jonline.progwithclass.aggregationandcompositionеtaskthree;

/*Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Country {

    private String country_name;
    private City capital;
    private List<Region> regions;

    public Country(String country_name, City capital) {
        this.country_name = country_name;
        this.capital = capital;
        this.regions = new ArrayList<>();
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void addRegion(Region region) {
        this.regions.add(region);
    }

    public void removeRegion(Region region) {
        this.regions.remove(region);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(country_name, country.country_name) && Objects.equals(capital, country.capital) && Objects.equals(regions, country.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country_name, capital, regions);
    }

    @Override
    public String toString() {
        return "Country{" +
                "country_name='" + country_name + '\'' +
                ", capital=" + capital +
                ", regions=" + regions +
                '}';
    }
}
