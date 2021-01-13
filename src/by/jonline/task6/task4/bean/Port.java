package by.jonline.task6.task4.bean;

/*Попробуйте решить данную задачу хотя бы на 50%.
Задание 4. Многопоточность. Порт . Корабли заходят в порт для разгрузки/загрузки контейнеров. Число контейнеров,
находящихся в текущий момент в порту и на корабле, должно быть неотрицательным и превышающим заданную грузоподъемность
судна и вместимость порта. В порту работает несколько причалов. У одного причала может стоять один корабль.
Корабль может загружаться у причала или разгружаться.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Port{

    private String name;
    private int numberOfBerths;
    private int numberOfContainers;
    private List<SeaСontainer> cargo;
    private List<Ship> ships;

    {
        cargo = new ArrayList<>();
        ships = new ArrayList<>();
    }

    public Port(String name, int numberOfBerths, int numberOfContainers) {
        this.name = name;
        this.numberOfBerths = numberOfBerths;
        this.numberOfContainers = numberOfContainers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfBerths() {
        return numberOfBerths;
    }

    public void setNumberOfBerths(int numberOfBerths) {
        this.numberOfBerths = numberOfBerths;
    }

    public int getNumberOfContainers() {
        return numberOfContainers;
    }

    public void setNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }

    public List<SeaСontainer> getCargo() {
        return cargo;
    }

    public List<Ship> getShips() {
        return ships;
    }

    public synchronized void shipArrivals(Ship ship){
        this.ships.add(ship);
    }

    public void moorShip(Ship ship){
        this.ships.remove(ship);
    }

    public void addContainer(SeaСontainer container){
        cargo.add(container);
    }

    public void takeContainer(SeaСontainer container){
        this.cargo.remove(container);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Port port = (Port) o;
        return numberOfBerths == port.numberOfBerths && numberOfContainers == port.numberOfContainers && Objects.equals(name, port.name) && Objects.equals(cargo, port.cargo) && Objects.equals(ships, port.ships);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfBerths, numberOfContainers, cargo, ships);
    }

    @Override
    public String toString() {
        return "Port{" +
                "name='" + name + '\'' +
                ", numberOfBerths=" + numberOfBerths +
                ", numberOfContainers=" + numberOfContainers +
                ", cargo=" + cargo +
                ", ships=" + ships +
                '}';
    }
}
