package progwithclasses.simpletaskthree;

public class Students {

    private final Student[] students;

    public Students(Student[] args) {
        this.students = args;
    }

    // метод возвращающий отличников
    public void exelStudents(){
        for (Student stud: this.students){
            if(goodGrades(stud.getProgress())){
                System.out.println(stud.getSurnameAndInitials() + " " + stud.getGroupNumber());
            }
        }
    }

    //метод возвращает true/false если в оценках одни 9, 10
    private boolean goodGrades(int[] progress){
        for (int grade: progress){
            if(grade < 9){
                return false;
            }
        }
        return true;
    }

}
