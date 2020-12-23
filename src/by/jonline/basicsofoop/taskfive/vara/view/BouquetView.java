package by.jonline.basicsofoop.taskfive.vara.view;

import by.jonline.basicsofoop.taskfive.vara.bean.Bouquet;
import by.jonline.basicsofoop.taskfive.vara.bean.Flower;

public class BouquetView {
    public void printBouquet(String message, Bouquet bouquet){
        System.out.println(message);
        System.out.println(bouquet.getPackaging().getMaterial() + " " + bouquet.getPackaging().getColor() + " " + bouquet.getPackaging().getPrice());
        for (Flower flower: bouquet.getFlowers()){
            System.out.println(flower.getName() + " " + flower.getColor() + " " + flower.getPrice());
        }
    }

    public void printBouquet(String message, int totalPrice){
        System.out.println(message);
        System.out.println(totalPrice);
    }
}
