package by.jonline.basicsofoop.taskfirst;

public class FileView {
    public void printDirectory(Directory dir){
        System.out.println("Каталог: " + dir.getName());
        System.out.println("Содержит следующие подкаталоги: ");
        for (Directory inDir: dir.getDirectories()){
            System.out.println(inDir.getName());
        }

        System.out.println("Содержит следующие файлы: ");
        for (File file: dir.getFiles()){
            System.out.println(file.getName());
        }
    }

    public void printFile(File file){
        System.out.println(file);
    }


}
