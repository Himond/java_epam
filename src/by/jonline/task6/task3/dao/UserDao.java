package by.jonline.task6.task3.dao;

import java.io.*;

public class UserDao implements Dao {

    private final File file = new File("src\\by\\jonline\\task6\\task3\\resource\\user.xml");

    @Override
    public String read() throws IOException {
        StringBuilder result = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null){
                result.append(line).append("\n");
            }
        }catch (FileNotFoundException ex){
            throw new FileNotFoundException(ex.getMessage());
        }
        return result.toString();
    }

    @Override
    public void update(String list) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                bw.write(list);
        }catch (IOException ex){
            throw new IOException(ex.getMessage());
        }
    }


}
