package by.jonline.progwithclass.aggregationandcompositionеtasktwo;

/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.*/

public class MainCar {
    public static void main(String[] args) {

        CarLogic logic = new CarLogic();

        Wheel wheel1 = new Wheel("Michelin", 60, 195, 30000);
        Wheel wheel2 = new Wheel("Michelin", 60, 195, 30000);
        Wheel wheel3 = new Wheel("Michelin", 60, 195, 30000);
        Wheel wheel4 = new Wheel("Michelin", 60, 195, 30000);

        Engine engine = new Engine(100, 6);

        Car car = new Car("Audi", engine, 70);
        car.setWheels(wheel1);
        car.setWheels(wheel2);
        car.setWheels(wheel3);
        car.setWheels(wheel4);

        logic.refuelCar(70, car);

        System.out.println(logic.returnCarModel(car));

        logic.run(700, car);
        logic.run(300, car);
        logic.run(200, car);
        logic.run(1000, car);

        logic.refuelCar(70, car);

        Wheel wheel5 = new Wheel("Michelin", 60, 195, 30000);

        logic.wheelChange(wheel1, wheel5, car);

    }


}
