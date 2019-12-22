package core;


import questions.*;

public class Main {
    public static void main(String[] args) {
        FileManager<Student> studentFileManager = new FileManager<>();

        NewDynamic<Student> students = new NewDynamic<>();
        NewDynamic<Student> test = new NewDynamic<>();

        for(int i=0;i<100;i++){
            students.put(Student.autoGenerator());
        }
        studentFileManager.fileWriter(students);
        test = studentFileManager.fileReader();
        for(int i=0;i<test.size();i++){
            System.out.println(test.get(i).toString());
        }
    }
}
