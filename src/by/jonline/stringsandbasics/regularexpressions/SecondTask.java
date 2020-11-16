package by.jonline.stringsandbasics.regularexpressions;

import java.io.*;
import java.util.Arrays;


public class SecondTask {
    public static void main(String[] args) throws IOException {
        String fileName = "mail.xml";
        XMLAnalyzer tx = new XMLAnalyzer(fileName);

        System.out.println(Arrays.toString(tx.getParentNode()));
        System.out.println(Arrays.toString(tx.getChildNodeWithAtribute()));
        System.out.println(Arrays.toString(tx.getChildNode()));

        System.out.println(tx.getParentNode()[0] + ":");
        for (int i = 0; i < tx.getChildNodeWithAtribute().length; i++) {
            System.out.println("\t" + tx.getChildNodeWithAtribute()[i] + ":");
            for (int j = 0; j < tx.getChildNode().length; j++) {
                System.out.println("\t" + "\t" + tx.getChildNode()[j] + ": " + tx.getElementsByTagName(tx.getChildNodeWithAtribute()[i], tx.getChildNode()[j]));
            }
        }
    }
}


