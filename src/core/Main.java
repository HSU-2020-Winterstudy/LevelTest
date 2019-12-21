package core;


import questions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        NewDynamic<String> stringTest = new NewDynamic<>();
        NewDynamic<Student> studentTest = new NewDynamic<>();
        NewDynamic<PartTimer> partTimerTest = new NewDynamic<>();

        for(int i=0;i<500;i++){
            stringTest.put(Integer.toString(i));
        }
        for(int i=0;i<500;i++){
            studentTest.put(Student.autoGenerator());
        }
        for(int i=0;i<500;i++){
            partTimerTest.put(PartTimer.autoGenerator());
        }

        for(int i=0;i<500;i++){
            System.out.println(stringTest.get(i));
            System.out.println(studentTest.get(i).toString());
            System.out.println(partTimerTest.get(i).toString());
        }
    }
}
