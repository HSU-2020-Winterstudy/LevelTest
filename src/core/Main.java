package core;


import questions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        for(int i=0;i<100;i++){
            students.add(Student.autoGenerator());
        }
        char [] getNameAtThird = new char[students.size()];
        for(int i=0;i<students.size();i++){
            getNameAtThird[i] = students.get(i).getName().charAt(2);
        }
        System.out.println(students.get(1).getName());
        String result = String.valueOf(getNameAtThird);

        System.out.println(result);
    }
}
