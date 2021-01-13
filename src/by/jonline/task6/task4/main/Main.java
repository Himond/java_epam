package by.jonline.task6.task4.main;

import by.jonline.task6.task4.bean.Port;
import by.jonline.task6.task4.logic.BerthLoader;
import by.jonline.task6.task4.logic.PortGenerator;
import by.jonline.task6.task4.logic.PortLogic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Port port = new Port("LosAngeles", 3, 30);
        PortGenerator generator = new PortGenerator(10);
        generator.generate(port);
        PortLogic logic = new PortLogic(port);
        System.out.println(port);
        ExecutorService executor = Executors.newFixedThreadPool(logic.getNumberOfBerth());
        for (int i = 0; i < logic.getAllShip().size(); i++){
            BerthLoader loader = new BerthLoader(logic);
            executor.execute(loader);
        }
        executor.shutdown();
        while (!executor.isTerminated()){

        }
        System.out.println("finish");
    }
}
