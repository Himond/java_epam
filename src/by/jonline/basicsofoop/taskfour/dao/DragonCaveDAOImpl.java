package by.jonline.basicsofoop.taskfour.dao;

import by.jonline.basicsofoop.taskfour.bean.DragonCave;
import by.jonline.basicsofoop.taskfour.bean.Treasure;


import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DragonCaveDAOImpl implements DragonCaveDao{

    private String inputFileName = "src\\by\\jonline\\basicsofoop\\taskfour\\resources\\cave.txt";


    @Override
    public void addTreasure(String name, int price) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(inputFileName, true))) {
            bw.write("name: " + name + ", price: " + price + "\n");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public Treasure getTreasure(String name) {
        String pars = "name: (\\w+), price: (\\d+)";
        Treasure treasure = null;
        Pattern pattern = Pattern.compile(pars);
        try (BufferedReader br = new BufferedReader(new FileReader(inputFileName))){
            String line;
            Matcher matcher;
            while ((line = br.readLine()) != null){
                matcher = pattern.matcher(line);
                if(matcher.find() && name.equals(matcher.group(1))){
                    treasure = new Treasure(matcher.group(1), Integer.parseInt(matcher.group(2)));
                    break;
                }
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return treasure;
    }

    @Override
    public DragonCave getAllTreasure() {
        String pars = "name: (\\w+), price: (\\d+)";
        DragonCave cave = new DragonCave();
        Pattern pattern = Pattern.compile(pars);
        try (BufferedReader br = new BufferedReader(new FileReader(inputFileName))){
            String line;
            Matcher matcher;
            while ((line = br.readLine()) != null){
                matcher = pattern.matcher(line);
                if(matcher.find()){
                    cave.addTreasure(new Treasure(matcher.group(1), Integer.parseInt(matcher.group(2))));
                }
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return cave;
    }
}
