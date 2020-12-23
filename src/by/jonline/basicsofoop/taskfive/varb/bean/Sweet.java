package by.jonline.basicsofoop.taskfive.varb.bean;

/*Создать консольное приложение, удовлетворяющее следующим требованиям:
• Корректно спроектируйте и реализуйте предметную область задачи.
• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.
• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
• для проверки корректности переданных данных можно применить регулярные выражения.
• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой подарок). Составляющими
 целого подарка являются сладости и упаковка.*/

public class Sweet {

    private String name;
    private String category;
    private int price;

    public Sweet() {
    }

    public Sweet(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static Sweet.Builder newBuilder(){
        return new Sweet().new Builder();
    }

    public class Builder{

        private Builder() {
        }

        public Sweet.Builder setName(String name){
            Sweet.this.name = name;
            return this;
        }

        public Sweet.Builder setCategory(String category){
            Sweet.this.category = category;
            return this;
        }

        public Sweet.Builder setPrice(int price){
            Sweet.this.price = price;
            return this;
        }

        public Sweet build(){
            return Sweet.this;
        }

    }


    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        Sweet sweet = (Sweet) obj;
        if(name == null){
            if(sweet.name != null){
                return false;
            }
        }else if(!name.equals(sweet.name)){
            return false;
        }
        if(category == null){
            if (sweet.category != null){
                return false;
            }
        }else if(!category.equals(sweet.category)){
            return false;
        }
        if(price != sweet.price){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 0;
        result = result * prime + ((name == null) ? 0 : name.hashCode());
        result = result * prime + ((category == null) ? 0 : category.hashCode());
        result = result * prime + price;
        return result;
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
