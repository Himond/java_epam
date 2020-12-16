package by.jonline.basicsofoop.taskfirst;

/*Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/

import java.util.ArrayList;
import java.util.List;

public class Directory {

    private String name;
    private List<Directory> directories;
    private List<File> files;

    {
        this.directories = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Directory> getDirectories() {
        return directories;
    }

    public List<File> getFiles() {
        return files;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directory directory = (Directory) o;
        if(name == null){
            if(directory.name != null){
                return false;
            }
        }else if(!name.equals(directory.name)){
            return false;
        }
        if(directories == null){
            if(directory.directories != null){
                return false;
            }
        }else if(!directories.equals(directory.directories)){
            return false;
        }
        if(files == null){
            if(directory.files != null){
                return false;
            }
        }else if(!files.equals(directory.files)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + ((name == null) ? 0: name.hashCode());
        result = result * prime + ((directories == null) ? 0: directories.hashCode());
        result = result * prime + ((files == null) ? 0: files.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "name='" + name + '\'' +
                ", directories=" + directories +
                ", files=" + files +
                '}';
    }
}
