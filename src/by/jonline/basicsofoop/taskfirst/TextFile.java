package by.jonline.basicsofoop.taskfirst;

/*Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/

public class TextFile extends File{


    private StringBuilder text;
    private final String EXT = ".txt";

    public TextFile(String name, Directory dir) {
        super(name, dir);
    }

    @Override
    public void createFile() {
        text = new StringBuilder();
    }

    @Override
    public String getName(){
        return super.getName() + EXT;
    }

    public void addText(String text){
        if(this.text != null){
            this.text.append(text).append("\n");
        }else {
            System.out.println("Создайте текстовый файл");
        }
    }

    public void printText(){
        if(this.text != null){
            System.out.println(text);
        }else {
            System.out.println("Создайте текстовый файл");
        }

    }

    public void deleteText(String target){
        if (this.text != null){
            int startIndex = text.indexOf(target);
            int stopIndex = startIndex + target.length();
            text.delete(startIndex, stopIndex);
        }else {
            System.out.println("Создайте текстовый файл");
        }

    }

    @Override
    public String toString() {
        return "name=" + super.getName() + EXT + '}';
    }
}
