package by.jonline.basicsofoop.taskfirst;

public class MainText {
    public static void main(String[] args) {
        Directory newDir = new Directory();

        TextFile file = new TextFile("Test", newDir);
        System.out.println(file.getDir().getDir());
        System.out.println(file.getName());

        file.renameFile("test2");
        System.out.println(file.getName());

        file.createFile();

        file.addText("В объектно-ориентированном программировании применение наследова-\n" +
                "ния предоставляет возможность расширения и дополнения программного\n" +
                "обеспечения, имеющего сложную структуру с большим количеством классов\n" +
                "и методов. В задачи суперкласса в этом случае входит определение интерфейса\n" +
                "(как способа взаимодействия) для всех подклассов.");
        file.printText();

        file.addText("В процессе выполнения приложения будет случайным образом сформиро-\n" +
                "ван массив-тест из вопросов разного типа, и информация об ответах на них\n" +
                "будет выведена на консоль.");
        file.printText();

        file.deleteText("В задачи суперкласса в этом случае входит определение интерфейса\n" +
                                    "(как способа взаимодействия) для всех подклассов.");
        file.printText();

    }
}
