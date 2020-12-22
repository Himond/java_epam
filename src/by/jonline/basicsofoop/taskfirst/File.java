package by.jonline.basicsofoop.taskfirst;

/*Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/

public class File{

    private String name;

    public File(String name) {
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        File file = (File) obj;
        if(name == null){
            if (file.name != null){
                return false;
            }
        }else if(!name.equals(file.name)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = result * prime + ((name == null) ? 0: name.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                '}';
    }
}
