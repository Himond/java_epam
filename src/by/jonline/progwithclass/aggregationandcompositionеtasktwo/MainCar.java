package by.jonline.progwithclass.aggregationandcompositionеtasktwo;

/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.*/

public class MainCar {
    public static void main(String[] args) {
        Wheel wheel1 = new Wheel("Michelin", 195, 60, 'R', 16, 89, 'H');
        Wheel wheel2 = new Wheel("Michelin", 195, 60, 'R', 16, 89, 'H');
        Wheel wheel3 = new Wheel("Michelin", 195, 60, 'R', 16, 89, 'H');
        Wheel wheel4 = new Wheel("Michelin", 195, 60, 'R', 16, 89, 'H');
        Engine engine = new Engine("Diesel", 100, 6, 6);
        Car car = new Car("Audi", new Wheel[]{wheel1, wheel2, wheel3, wheel4}, engine, 70);
        System.out.println(car.getCar_model());
        for (int i = 0; i < 1500 ; i += 50) {
            int code = car.run(i);
            if (code == -1){
                car.refuelCar();
            }
            if (code > 0 && code < i){
                car.wheelChange(code);
            }
            System.out.println("Вы проехали " + i + " км");
        }
    }


}
