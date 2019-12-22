package core;


import questions.*;

public class Main {
    public static void main(String[] args) {
        FileManager<PartTimer> studentFileManager = new FileManager<>();
        NewDynamic<PartTimer> students = new NewDynamic<>();


        for(int i=0;i<500;i++){
            students.put(PartTimer.autoGenerator());
        }
        studentFileManager.fileWriter(students);

        NewDynamic<PartTimer> readStudents = new NewDynamic<>();
        readStudents = studentFileManager.fileReader();
        for(int i=0;i<readStudents.size();i++){
            System.out.println(readStudents.get(i).toString());
        }
    }
}
