package by.jonline.basicsofoop.taskfirst;

/*Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/

public class FileLogic {

    public File createFile(String name){
        return new File(name);
    }

    public TextFile createFile(String name, String text){
        return new TextFile(name, text);
    }

    public Directory createDirectory(String name){
        return new Directory(name);
    }

    public void renameFile(String name, File file){
        file.setName(name);
    }

    public void renameDirectory(String name, Directory dir){
        dir.setName(name);
    }

    public void addFile(File file, Directory dir){
        dir.getFiles().add(file);
    }

    public void addDirectory(Directory dirAdd, Directory dir){
        dir.getDirectories().add(dirAdd);
    }

    public void removeFile(File file, Directory dir){
        dir.getFiles().remove(file);
    }

    public void removeDirectory(Directory dirRem, Directory dir){
        dir.getDirectories().remove(dirRem);
    }


}
