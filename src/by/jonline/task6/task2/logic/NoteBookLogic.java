package by.jonline.task6.task2.logic;

/*Задание 2. Блокнот. Разработать консольное приложение, работающее с Заметками в Блокноте. Каждая Заметка это: Заметка
(тема, дата создания, e-mail, сообщение).
Общие пояснения к практическому заданию.
• В начале работы приложения данные должны считываться из файла, в конце работы – сохраняться в файл.
• У пользователя должна быть возможность найти запись по любому параметру или по группе параметров (группу параметров можно
определить самостоятельно), получить требуемые записи в отсортированном виде, найти записи, текстовое поле которой содержит
 определенное слово, а также добавить новую запись.
• Особое условие: поиск, сравнение и валидацию вводимой информации осуществлять с использованием регулярных выражений.
• +Особое условие: проверку введенной информации на валидность должен осуществлять код, непосредственно добавляющий информацию.*/

import by.jonline.task6.task2.bean.Note;
import by.jonline.task6.task2.bean.NoteBook;
import by.jonline.task6.task2.dao.NoteDao;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoteBookLogic {

    private NoteDao dao = new NoteDao();

    public NoteBook downloadNotebook() throws IOException {
        List<Note> notes = new ArrayList<>();
        NoteBook notebook = new NoteBook();
        List<String> lines = dao.read();
        for (String line: lines){
            notes.add(createNote(line.split(",")));
        }
        notebook.setNotebook(notes);
        return notebook;
    }

    public void saveNotebook(NoteBook notebook) throws IOException {
        dao.update(notebook);
    }

    public List<Note> sortNotebook(List<Note> notes){
        List<Note> sortNote = new ArrayList<>(notes);
        Collections.sort(sortNote);
        return sortNote;
    }

    public List<Note> searchNoteByEmail(List<Note> notes, String email){
        final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        final String SEARCH_PATTERN = "^" + email + "$";

        Pattern pattern;
        Matcher matcher;
        List<Note> newNote;

        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        newNote = new ArrayList<>();

        if(matcher.matches()){
            pattern = Pattern.compile(SEARCH_PATTERN);
            for (Note note: notes){
                matcher = pattern.matcher(note.getEmail());
                if (matcher.matches()){
                    newNote.add(note);
                }
            }
        }

        return newNote;
    }

    public List<Note> searchNoteByTopic(List<Note> notes, String topic){
        final String SEARCH_PATTERN = "^" + topic + "$";

        Pattern pattern;
        Matcher matcher;
        List<Note> newNote;

        pattern = Pattern.compile(SEARCH_PATTERN);
        newNote = new ArrayList<>();
        for (Note note: notes){
            matcher = pattern.matcher(note.getTopic());
            if (matcher.matches()){
                newNote.add(note);
            }
        }

        return newNote;
    }

    public List<Note> searchNoteByDate(List<Note> notes, String date){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        final String DATE_PATTERN = "^\\d{4}-\\d{2}-\\d{2}$";
        final String SEARCH_PATTERN = "^" + date + "$";

        Pattern pattern;
        Matcher matcher;
        List<Note> newNote;

        pattern = Pattern.compile(DATE_PATTERN);
        matcher = pattern.matcher(date);
        newNote = new ArrayList<>();

        if (matcher.matches()){
            pattern = Pattern.compile(SEARCH_PATTERN);

            for (Note note: notes){
                matcher = pattern.matcher(df.format(note.getDate()));
                if (matcher.matches()){
                    newNote.add(note);
                }
            }
        }
        return newNote;
    }


    public List<Note> searchBySomeParams(List<Note> notes, String... str){

        final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        final String DATE_PATTERN = "^\\d{4}-\\d{2}-\\d{2}$";

        List<Note> newNote = new ArrayList<>(notes);
        Pattern patternEmail = Pattern.compile(EMAIL_PATTERN);
        Pattern patternDate = Pattern.compile(DATE_PATTERN);

        Matcher matcherEmail;
        Matcher matcherDate;

        for (String line: str){
            matcherEmail = patternEmail.matcher(line);
            matcherDate = patternDate.matcher(line);
            if(matcherEmail.matches()){
                newNote = searchNoteByEmail(newNote, line);
            }else if(matcherDate.matches()){
                newNote = searchNoteByDate(newNote, line);
            }else {
                newNote = searchNoteByTopic(newNote, line);
            }
        }

        return newNote;
    }

    public Note createNote(String topic, GregorianCalendar date, String email, String message){
        return new Note(topic, date, email, message);
    }

    public List<Note> searchByWordInMessage(List<Note> notes, String word){

        Pattern pattern;
        Matcher matcher;
        List<Note> newNote;

        pattern = Pattern.compile(word.toLowerCase());
        newNote = new ArrayList<>();
        for (Note note: notes){
            matcher = pattern.matcher(note.getMessage().toLowerCase());
            if (matcher.find()){
                newNote.add(note);
            }
        }

        return newNote;

    }

    private Note createNote(String[] splitLine){
        Note note = new Note();

        String[] date = splitLine[1].split(":")[1].split("-");

        note.setTopic(splitLine[0].split(":")[1]);
        note.setDate(new GregorianCalendar(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2])));
        note.setEmail(splitLine[2].split(":")[1]);
        note.setMessage(splitLine[3].split(":")[1]);

        return note;
    }



}
