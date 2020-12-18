package by.jonline.basicsofoop.thirdtask;

import java.util.Comparator;

public class ComparatorByDay implements Comparator<Day> {

    @Override
    public int compare(Day d1, Day d2) {
        if(d1.getNumber() > d2.getNumber()){
            return 1;
        }else if(d1.getNumber() < d2.getNumber()){
            return -1;
        }else {
            return 0;
        }
    }

}
