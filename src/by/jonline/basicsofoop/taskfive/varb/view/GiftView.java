package by.jonline.basicsofoop.taskfive.varb.view;

import by.jonline.basicsofoop.taskfive.varb.bean.Gift;
import by.jonline.basicsofoop.taskfive.varb.bean.Sweet;

public class GiftView {

    public void printGift(String message, Gift gift){
        System.out.println(message);
        System.out.println(gift.getaPackage().getMaterial() + " " + gift.getaPackage().getColor() + " " + gift.getaPackage().getPrice());
        for(Sweet sweet: gift.getSweets()){
            System.out.println(sweet.getName() + " " + sweet.getCategory() + " " + sweet.getPrice());
        }
    }

}
