package by.jonline.basicsofoop.taskfour.bean;

/*
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.

Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
выбора сокровищ на заданную сумму.*/

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DragonCave implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Treasure> treasures;

    {
        treasures = new ArrayList<>();
    }

    public DragonCave() {
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }

    public void addTreasure(Treasure treasure) {
        this.treasures.add(treasure);
    }

    public void removeTreasure(Treasure treasure) {
        this.treasures.remove(treasure);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DragonCave that = (DragonCave) o;
        return Objects.equals(treasures, that.treasures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(treasures);
    }

    @Override
    public String toString() {
        return "DragonCave{" +
                "treasures=" + treasures +
                '}';
    }
}
