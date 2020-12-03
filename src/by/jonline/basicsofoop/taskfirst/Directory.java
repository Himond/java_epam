package by.jonline.basicsofoop.taskfirst;

/*Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/

public class Directory {

    private String dir;

    public Directory(String dir) {
        if (dir.matches("\\S:(\\S*)")){
            this.dir = dir;
        }else {
            this.dir = System.getProperty("user.dir");
        }

    }

    public Directory(){
        this(System.getProperty("user.dir"));
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        if (dir.matches("\\S:(\\S*)")){
            this.dir = dir;
        }else {
            this.dir = System.getProperty("user.dir");
        }
    }

}
