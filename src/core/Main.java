package core;


import questions.FileManager;
import questions.NewDynamic;
import questions.PartTimer;
import questions.Student;
import questions.swing.graphics.Roulette;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();

        NewDynamic<Student> students = new NewDynamic<>();
        NewDynamic<PartTimer> partTimers = new NewDynamic<>();

        for(int i=0;i<30;i++){
            students.put(Student.autoGenerator());
            partTimers.put(PartTimer.autoGenerator());
        }
        fileManager.fileWriter(students);
        fileManager.fileWriter(partTimers);

        new Roulette();

    }
}
