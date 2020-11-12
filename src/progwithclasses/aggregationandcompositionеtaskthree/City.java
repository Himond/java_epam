package progwithclasses.aggregationandcompositionеtaskthree;

/*Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/

import java.util.ArrayList;
import java.util.Arrays;

/*Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class City {

    private String city_name;
    private District[] districts;
    private CategoriesCities category;
    private int city_area;
    private long city_population;

    public City(String city_name, District[] districts, CategoriesCities category) {
        this.city_name = city_name;
        this.districts = districts;
        this.category = category;
        for (District dis: districts) {
            city_area += dis.getTotal_area();
            city_population += dis.getPopulation();
        }
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public District[] getDistricts() {
        return districts;
    }

    //City district adding method
    public void addDistrict(District district) {
        ArrayList<District> list= new ArrayList<>(Arrays.asList(districts));
        list.add(district);
        this.city_area += district.getTotal_area();
        this.city_population += district.getPopulation();
        this.districts = list.toArray(new District[0]);
    }
    //City district removing method
    public void removeDistrict(District district) {
        ArrayList<District> list= new ArrayList<>(Arrays.asList(districts));
        list.remove(district);
        this.city_area -= district.getTotal_area();
        this.city_population -= district.getPopulation();
        this.districts = list.toArray(new District[0]);
    }

    public CategoriesCities getCategory() {
        return category;
    }

    public void setCategory(CategoriesCities category) {
        this.category = category;
    }

    public int getCity_area() {
        return city_area;
    }

    public long getCity_population() {
        return city_population;
    }

    @Override
    public String toString() {
        return "City{" +
                "city_name='" + city_name + '\'' +
                ", districts=" + Arrays.toString(districts) +
                ", category=" + category +
                ", city_area=" + city_area +
                ", city_population=" + city_population +
                '}';
    }
}
