package by.jonline.basicsofoop.thirdtask;

import java.util.Comparator;

public class ComparatorByMonth implements Comparator<Day> {

    @Override
    public int compare(Day o1, Day o2) {
        return o1.getMonth().compareTo(o2.getMonth());
    }

}
