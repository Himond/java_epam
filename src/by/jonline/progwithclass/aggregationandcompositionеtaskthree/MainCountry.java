package by.jonline.progwithclass.aggregationandcompositionеtaskthree;

/*Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class MainCountry {
    public static void main(String[] args) {
        CountryControl control = new CountryControl();
        CountryView view = new CountryView();

        District district1 = new District("Central", 22, 121240);
        District district2 = new District("Pervomaisky", 26, 233241);

        City minsk = new City("Minsk");
        minsk.addDistrict(district1);
        minsk.addDistrict(district2);

        District district3 = new District("Leninsky", 62, 215000);
        District district4 = new District("Oktyabrsky", 52, 168000);

        City borisov = new City("Borisov");
        borisov.addDistrict(district3);
        borisov.addDistrict(district4);

        District district5 = new District("Leninsky", 12, 150000);
        District district6 = new District("Oktyabrsky", 24, 80000);

        City grodno = new City("Grodno");
        grodno.addDistrict(district5);
        grodno.addDistrict(district6);

        District district7 = new District("Leninsky", 42, 215000);
        District district8 = new District("Oktyabrsky", 28, 168000);

        City lida = new City("Lida");
        lida.addDistrict(district7);
        lida.addDistrict(district8);

        Region minsk_region = new Region("Minsk region", minsk);
        minsk_region.addCity(minsk);
        minsk_region.addCity(borisov);

        Region grodno_region = new Region("Grodno region", grodno);
        grodno_region.addCity(grodno);
        grodno_region.addCity(lida);

        Country belarus = new Country("Belarus", minsk);
        belarus.addRegion(grodno_region);
        belarus.addRegion(minsk_region);

        view.print("столица", control.getCapital(belarus));
        view.print("количество областей", control.getNumberOfRegions(belarus));
        view.print("площадь", control.getArea(belarus));
        view.print("численность населения", control.getPopulation(belarus));
        view.print("областные центры", control.getRegionalCenters(belarus));
    }
}
