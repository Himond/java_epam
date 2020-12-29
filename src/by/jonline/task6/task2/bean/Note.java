package by.jonline.task6.task2.bean;

/*Задание 2. Блокнот. Разработать консольное приложение, работающее с Заметками в Блокноте. Каждая Заметка это: Заметка
(тема, дата создания, e-mail, сообщение).
Общие пояснения к практическому заданию.
• В начале работы приложения данные должны считываться из файла, в конце работы – сохраняться в файл.
• У пользователя должна быть возможность найти запись по любому параметру или по группе параметров (группу параметров можно
определить самостоятельно), получить требуемые записи в отсортированном виде, найти записи, текстовое поле которой содержит
 определенное слово, а также добавить новую запись.
• Особое условие: поиск, сравнение и валидацию вводимой информации осуществлять с использованием регулярных выражений.
• Особое условие: проверку введенной информации на валидность должен осуществлять код, непосредственно добавляющий информацию.*/

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Note implements Serializable, Comparable<Note> {

    private String topic;
    private Calendar date;
    private String email;
    private String message;

    public Note() {
    }

    public Note(String topic, GregorianCalendar date, String email, String message) {
        this.topic = topic;
        this.date = date;
        this.email = email;
        this.message = message;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Date getDate() {
        return date.getTime();
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public int compareTo(Note o) {
        int result = topic.compareTo(o.topic);
        if(result == 0){
            result = date.compareTo(o.date);
        }
        return result;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(topic, note.topic) && Objects.equals(date, note.date) && Objects.equals(email, note.email) && Objects.equals(message, note.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, date, email, message);
    }

    @Override
    public String toString() {
        return "Note{" +
                "topic='" + topic + '\'' +
                ", date=" + date +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
