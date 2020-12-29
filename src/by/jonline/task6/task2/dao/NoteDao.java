package by.jonline.task6.task2.dao;

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

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoteDao implements Dao{

    private File file = new File("src\\by\\jonline\\task6\\task2\\resource\\notes.txt");

    @Override
    public void create(Note note) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            if(isValid(note)){
                bw.write("topic:" + note.getTopic() + ",date:" + df.format(note.getDate()) + ",email:" + note.getEmail() +
                        ",message:" + note.getMessage() + "\n");
            }
        }catch (IOException ex){
            throw new IOException(ex.getMessage());
        }
    }

    @Override
    public List<String> read() throws IOException {
        List<String> notes = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null){
                notes.add(line);
            }
        }catch (FileNotFoundException ex){
            throw new FileNotFoundException(ex.getMessage());
        }
        return notes;
    }


    @Override
    public void update(NoteBook notebook) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            for (Note note: notebook.getNotebook()){
                if(isValid(note)){
                    bw.write("topic:" + note.getTopic() + ",date:" + df.format(note.getDate()) + ",email:" + note.getEmail() +
                            ",message:" + note.getMessage() + "\n");
                }
            }
        }catch (IOException ex){
            throw new IOException(ex.getMessage());
        }
    }

    private boolean isValid(Note note){

        boolean valid = true;
        int length_limit = 200; //ограничим длинну сообщений для добавление в базу данных
        final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern;
        Matcher matcher;

        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(note.getEmail());
        if(!matcher.matches()){
            valid = false;
        }
        if (note.getMessage().length() > length_limit){
            valid = false;
        }
        return valid;
    }

}
