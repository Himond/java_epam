package by.jonline.basicsofoop.taskfirst;

/*Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/

public class TextFile extends File{

    private String text;

    public TextFile(String name, String text) {
        super(name);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void addText(String text){
        this.text += " " + text;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!super.equals(obj)){
            return false;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        TextFile textFile = (TextFile) obj;
        if(text == null){
            if(textFile.text != null){
                return false;
            }
        }else if(!text.equals(textFile.text)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = super.hashCode();
        result = result * prime + ((text == null) ? 0: text.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "TextFile{" +
                "name='" + super.getName() + '\'' +
                ", text=" + text +
                '}';
    }
}
