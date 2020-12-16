package by.jonline.basicsofoop.taskfirst;

/*Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/

public class MainText {
    public static void main(String[] args) {

        FileLogic logic = new FileLogic();
        FileView view = new FileView();

        File file = logic.createFile("Main");
        File file1 = logic.createFile("Main1");
        TextFile textFile = logic.createFile("Java", "В объектно-ориентированном программировании...");

        textFile.addText("В процессе выполнения приложения будет случайным образом сформирован...");

        Directory newDir = logic.createDirectory("MainDir");
        Directory newDir1 = logic.createDirectory("MainDir1");

        logic.renameDirectory("NewDir", newDir1);

        logic.addDirectory(newDir1, newDir);
        logic.addFile(file1, newDir);
        logic.addFile(file, newDir);
        logic.addFile(textFile, newDir);

        view.printDirectory(newDir);
        view.printFile(textFile);

    }
}
