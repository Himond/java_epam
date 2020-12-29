package by.jonline.task6.task2.main;

/*Задание 2. Блокнот. Разработать консольное приложение, работающее с Заметками в Блокноте. Каждая Заметка это: Заметка
(тема, дата создания, e-mail, сообщение).
Общие пояснения к практическому заданию.
• В начале работы приложения данные должны считываться из файла, в конце работы – сохраняться в файл.
• У пользователя должна быть возможность найти запись по любому параметру или по группе параметров (группу параметров можно
определить самостоятельно), получить требуемые записи в отсортированном виде, найти записи, текстовое поле которой содержит
 определенное слово, а также добавить новую запись.
• Особое условие: поиск, сравнение и валидацию вводимой информации осуществлять с использованием регулярных выражений.
• +Особое условие: проверку введенной информации на валидность должен осуществлять код, непосредственно добавляющий информацию.*/

import by.jonline.task6.task2.bean.NoteBook;
import by.jonline.task6.task2.logic.NoteBookLogic;
import by.jonline.task6.task2.view.NoteBookView;

import java.io.IOException;
import java.util.GregorianCalendar;

public class NoteMain {

    public static void main(String[] args) {
        NoteBookLogic logic = new NoteBookLogic();
        NoteBookView view = new NoteBookView();

        try {
            NoteBook noteBook = logic.downloadNotebook();

            view.print("Отсортированный блокнот", logic.sortNotebook(noteBook.getNotebook()));

            noteBook.addNote(logic.createNote("Friend", new GregorianCalendar(2020, 7, 21), "friend@mail.ru", "Let's go to the forest for barbecue"));
            noteBook.addNote(logic.createNote("Store", new GregorianCalendar(2020, 5, 19), "store@mail.ru", "Buy a new smartphone"));
            noteBook.addNote(logic.createNote("Friend", new GregorianCalendar(2020, 1, 1), "friend@mail.ru", "..."));

            view.print("Поиск по параметрам", logic.searchBySomeParams(noteBook.getNotebook(),"friend@mail.ru", "2020-08-21"));
            view.print("Поиск по параметрам", logic.searchBySomeParams(noteBook.getNotebook(),"friend@mail.ru"));

            view.print("Поиск по слову в тексте", logic.searchByWordInMessage(noteBook.getNotebook(), "GO"));

            logic.saveNotebook(noteBook);

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }



    }

}
