package by.jonline.basicsofoop.taskfirst;

/*Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/

public abstract class File {

    private String name;
    private Directory dir;

    public File(String name, Directory dir) {
        this.name = name;
        this.dir = dir;
    }

    public String getName() {
        return name;
    }

    public Directory getDir() {
        return dir;
    }

    public void renameFile(String newName){
        this.name = newName;
    }

    public abstract void createFile();

}
