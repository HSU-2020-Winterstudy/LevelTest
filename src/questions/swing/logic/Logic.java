package questions.swing.logic;

import questions.FileManager;
import questions.NewDynamic;
import questions.PartTimer;
import questions.Student;

public class Logic {
    private NewDynamic<Student> studentList = new NewDynamic<>();
    private NewDynamic<PartTimer> partTimerList = new NewDynamic<>();

    public Logic(){

    }
    private void Initialize(){
        FileManager studentFileManager = new FileManager();
        FileManager partTimerFileManager = new FileManager();
//        studentList = studentFileManager.fileReader();
//        partTimerList = partTimerFileManager.fileReader();
    }
}
