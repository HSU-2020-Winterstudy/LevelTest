package core;


import questions.*;
import questions.swing.graphics.Roulette;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        NewDynamic<Person> targets = new NewDynamic<>();
        for(int i=0;i<100;i++){
            targets.put(Student.autoGenerator());
            targets.put(PartTimer.autoGenerator());
        }
        fileManager.fileWriter(targets);

        new Roulette();
    }
}
