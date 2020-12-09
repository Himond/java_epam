package by.jonline.progwithclass.aggregationandcompositionеtasktwo;

/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.*/

public class CarLogic{

    public void run(int distance, Car car) {
        if (checkCar(car)){
            car.removeFuel(distance / 100.0 * car.getEngine().getFuel_consuption()); // Уменьшаем количество топлива согласно пройденному пути
            car.addCar_mileage(distance); // увеличиваем пробег авто
            for (Wheel wheel: car.getWheels()) {
                wheel.reduceMax_distance(distance); // увеличиваем пробег колес
            }
            System.out.println("Автомобиль проехал: " + distance + " км");
        }
    }

    //заправка автомобиля
    public void refuelCar(int fuel, Car car){
        if(car.getTank_volume() < fuel){
            car.setFuel_quantity(car.getTank_volume());
        }else {
            car.setFuel_quantity(fuel);
        }
        System.out.println("Автомобиль заправлен");
    }

    //Замена всех колес
    public void wheelChange(Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4, Car car){
        car.removeWheels();
        car.setWheels(wheel1);
        car.setWheels(wheel2);
        car.setWheels(wheel3);
        car.setWheels(wheel4);
        System.out.println("Колеса заменены");
    }

    // Замена одного колеса
    public void wheelChange(Wheel oldWheel, Wheel newWheel, Car car){
        car.removeWheel(oldWheel);
        car.setWheels(newWheel);
        System.out.println("Колесо заменено");
    }

    public String returnCarModel(Car car){
        return car.getCar_model();
    }

    // проверяем состояние машины
    public boolean checkCar(Car car){
        if(car.getEngine() == null){
            System.out.println("Отсутствует двигатель");
            return false;
        }else if(car.getWheels() == null || car.getWheels().size() < 4){
            System.out.println("Нехватает колес");
            return false;
        }else if(car.getFuel_quantity() <= 0){
            System.out.println("Требуется заправка");
            return false;
        }
        for (Wheel wheel: car.getWheels()){
            if (wheel.getMax_distance() <= 0){
                System.out.println("Требуется замена колес");
                return false;
            }
        }
        return true;
    }

}
