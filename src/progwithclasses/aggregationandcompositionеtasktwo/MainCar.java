package progwithclasses.aggregationandcompositionеtasktwo;

public class MainCar {
    public static void main(String[] args) {
        Wheel wheel1 = new Wheel("Michelin", 195, 60, 'R', 16, 89,'H');
        Wheel wheel2 = new Wheel("Michelin", 195, 60, 'R', 16, 89,'H');
        Wheel wheel3 = new Wheel("Michelin", 195, 60, 'R', 16, 89,'H');
        Wheel wheel4 = new Wheel("Michelin", 195, 60, 'R', 16, 89,'H');
        Engine engine = new Engine("Diesel", 100, 6, 6);
        Car car = new Car("Audi", new Wheel[]{wheel1, wheel2, wheel3, wheel4}, engine, 70);
        try {
            car.run(1150);
        }catch (NotEnoughFuelIinTheTank e){
            System.out.println(e.getMessage() + " " + e.getFuel_tank_volume());
        }catch (HighTireWear e){
            System.out.println(e.getMessage() + " " + e.getTire_number());
        }
        try {
            car.refuelCar(60);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            car.run(1000);
        }catch (NotEnoughFuelIinTheTank e){
            System.out.println(e.getMessage() + " " + e.getFuel_tank_volume());
        }catch (HighTireWear e){
            System.out.println(e.getMessage() + " " + e.getTire_number());
        }

        System.out.println(car.getFuel_in_the_tank());

        try {
            car.refuelCar(60);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        car.wheelChange(3);

        try {
            car.run(1000);
        }catch (NotEnoughFuelIinTheTank e){
            System.out.println(e.getMessage() + " " + e.getFuel_tank_volume());
        }catch (HighTireWear e){
            System.out.println(e.getMessage() + " " + e.getTire_number());
        }
    }


}
