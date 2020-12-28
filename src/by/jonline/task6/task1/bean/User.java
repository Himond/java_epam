package by.jonline.task6.task1.bean;

/*
Задание 1: создать консольное приложение “Учет книг в домашней библиотеке”.
Общие требования к заданию:
• +Система учитывает книги как в электронном, так и в бумажном варианте.
• +Существующие роли: пользователь, администратор.
• Пользователь может просматривать книги в каталоге книг, осуществлять поиск
книг в каталоге.
• Администратор может модифицировать каталог.
• *При добавлении описания книги в каталог оповещение о ней рассылается на
e-mail всем пользователям.
• **При просмотре каталога желательно реализовать постраничный просмотр.
• ***Пользователь может предложить добавить книгу в библиотеку, переслав её
администратору на e-mail.
• +Каталог книг хранится в текстовом файле.
• +Данные аутентификации пользователей хранятся в текстовом файле. Пароль
не хранится в открытом виде.
*/

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

    private String login;
    private String name;
    private String email;
    private String password;
    private boolean is_staff;

    public User() {
    }

    public User(String login, String name, String email, String password, boolean is_staff) {
        this.login = login;
        this.name = name;
        this.email = email;
        this.password = password;
        this.is_staff = is_staff;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIs_staff() {
        return is_staff;
    }

    public void setIs_staff(boolean is_staff) {
        this.is_staff = is_staff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return is_staff == user.is_staff && Objects.equals(login, user.login) && Objects.equals(name, user.name) && Objects.equals(email, user.email) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, name, email, password, is_staff);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", is_staff=" + is_staff +
                '}';
    }
}
