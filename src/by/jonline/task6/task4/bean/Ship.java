package by.jonline.task6.task4.bean;

/*Попробуйте решить данную задачу хотя бы на 50%.
Задание 4. Многопоточность. Порт . Корабли заходят в порт для разгрузки/загрузки контейнеров. Число контейнеров,
находящихся в текущий момент в порту и на корабле, должно быть неотрицательным и превышающим заданную грузоподъемность
судна и вместимость порта. В порту работает несколько причалов. У одного причала может стоять один корабль.
Корабль может загружаться у причала или разгружаться.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ship {

    private String name;
    private int liftingCapacity;
    private List<SeaСontainer> cargo;

    {
        cargo = new ArrayList<>();
    }

    public Ship(String name, int liftingCapacity) {
        this.name = name;
        this.liftingCapacity = liftingCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    public List<SeaСontainer> getCargo() {
        return cargo;
    }

    public void addContainer(SeaСontainer container) {
        this.cargo.add(container);
    }

    public void unloadAllCargo(){
        this.cargo = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return liftingCapacity == ship.liftingCapacity && Objects.equals(name, ship.name) && Objects.equals(cargo, ship.cargo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, liftingCapacity, cargo);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", liftingCapacity=" + liftingCapacity +
                ", cargo=" + cargo +
                '}';
    }
}
