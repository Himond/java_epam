package by.jonline.progwithclass.aggregationandcompositionеtaskfour;

/*Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.*/

import java.util.Arrays;
import java.util.List;

public class BankView {
    public void print(String message, List<Account> accounts){
        System.out.println(message);
        for (Account acc: accounts){
            System.out.println(acc);
        }
    }

    public void print(String message, double sum){
        System.out.println(message + sum);
    }

    public void print(String message, double[] sum){
        System.out.println(message + Arrays.toString(sum));
    }


}
