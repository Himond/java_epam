package by.jonline.progwithclass.aggregationandcompositionеtaskthree;

/*Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/

import java.util.ArrayList;
import java.util.List;

public class CountryControl {

    public String  getCapital(Country country){
        return country.getCapital().getCity_name();
    }

    public int getNumberOfRegions(Country country){
        return country.getRegions().size();
    }

    public int getArea(Country country){
        int totalArea = 0;
        for (Region region: country.getRegions()){
            for(City city: region.getCities()){
                for(District district: city.getDistricts()){
                    totalArea += district.getTotal_area();
                }
            }
        }
        return totalArea;
    }

    public int getPopulation(Country country){
        int totalPopulation = 0;
        for (Region region: country.getRegions()){
            for(City city: region.getCities()){
                for(District district: city.getDistricts()){
                    totalPopulation += district.getPopulation();
                }
            }
        }
        return totalPopulation;
    }

    public List<City> getRegionalCenters(Country country){
        List<City> centers = new ArrayList<>();
        for (Region region: country.getRegions()){
           centers.add(region.getRegionCity());
        }
        return centers;
    }


}
