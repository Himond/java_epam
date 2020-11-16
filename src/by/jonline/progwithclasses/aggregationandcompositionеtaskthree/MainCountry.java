package by.jonline.progwithclasses.aggregationandcompositionеtaskthree;
/*Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class MainCountry {
    public static void main(String[] args) {
        District district1 = new District("Central", 22, 121240);
        District district2 = new District("Pervomaisky", 26, 233241);
        City city1 = new City("Minsk", new District[]{district1, district2}, CategoriesCity.DISTRICT);
        System.out.println(city1.getCity_population());
        District district3 = new District("Leninsky", 62, 215000);
        District district4 = new District("Oktyabrsky", 52, 168000);
        City city2 = new City("Mogilev", new District[]{district3, district4}, CategoriesCity.REGIONAL);
        Region region = new Region(new City[]{city1, city2}, CategoriesCity.CAPITAL);
        Country country = new Country("Republic of Belarus", new Region[]{region});
        System.out.println(country.getCapital().getCity_name());
        System.out.println(country.getCountry_area());
        System.out.println(country.getCountry_population());
        System.out.println(country.getRegions().length);
        System.out.println(country.getRegions()[0].getRegion_name());
    }
}
