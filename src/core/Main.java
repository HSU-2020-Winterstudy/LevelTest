package core;


import questions.*;
import questions.swing.graphics.Roulette;

public class Main {
    public static void main(String[] args) {
//        new Roulette();
        FileManager fileManager = new FileManager();
        NewDynamic<Student> t = new NewDynamic<>();
        NewDynamic<PartTimer> p = new NewDynamic<>();
        for(int i=0;i<20;i++){
            t.put(Student.autoGenerator());
            p.put(PartTimer.autoGenerator());
        }
        fileManager.fileWriter(t);
        fileManager.fileWriter(p);

        NewDynamic<Person> personList = fileManager.fileReader();
        for(int i=0;i<personList.size();i++){
            System.out.println(personList.get(i).toString());
        }
    }
}
