package by.jonline.task6.task4.bean;

/*Попробуйте решить данную задачу хотя бы на 50%.
Задание 4. Многопоточность. Порт . Корабли заходят в порт для разгрузки/загрузки контейнеров. Число контейнеров,
находящихся в текущий момент в порту и на корабле, должно быть неотрицательным и превышающим заданную грузоподъемность
судна и вместимость порта. В порту работает несколько причалов. У одного причала может стоять один корабль.
Корабль может загружаться у причала или разгружаться.*/


import java.util.Objects;

public class SeaСontainer {

    private int weight;

    public SeaСontainer(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeaСontainer сontainer = (SeaСontainer) o;
        return weight == сontainer.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return "SeaСontainer{" +
                "weight=" + weight +
                '}';
    }
}
