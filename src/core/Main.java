package core;


import questions.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        for(int i=0;i<100;i++){
            students.add(Student.autoGenerator());
            System.out.println(Person.getNextID());
        }
        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}
