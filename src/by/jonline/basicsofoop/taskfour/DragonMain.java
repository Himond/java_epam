package by.jonline.basicsofoop.taskfour;

public class DragonMain {

    public static void main(String[] args) {
        DragonLogic logic = new DragonLogic();
        DragonView view = new DragonView();
        DragonCave cave = new DragonCave();

        cave.addTreasure(new Treasure("Gold", 200));
        cave.addTreasure(new Treasure("diamonds", 300));
        cave.addTreasure(new Treasure("rubies", 250));
        cave.addTreasure(new Treasure("silver", 140));
        cave.addTreasure(new Treasure("platinum", 320));

        view.printTreasure("Все сокровища: ", cave);
        view.printTreasure("Самое дорогое сокровище: ", logic.dearestTreasure(cave));
        view.printTreasure("Сокровища на сумму: ", logic.getTreasureForAmount(650, cave));


    }

}
