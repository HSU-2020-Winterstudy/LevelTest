package core;


import questions.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        DynamicArray<Student> dynamicStudents = new DynamicArray<>(Student.class);
        ArrayList<Student> listStudents = new ArrayList<>();
        HashMap<String,Student> mapStudents = new HashMap<>();

        Student student = Student.autoGenerator();
        long startTime = System.currentTimeMillis();
        for(int i=0;i<200000000;i++){
            dynamicStudents.put(student);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Dynamic "+(endTime-startTime)/1000+"초");

        startTime = System.currentTimeMillis();
        for(int i=0;i<200000000;i++){
            listStudents.add(student);
        }
        endTime = System.currentTimeMillis();
        System.out.println("List "+(endTime-startTime)/1000+"초");

        startTime = System.currentTimeMillis();
        for(int i=0;i<200000000;i++){
            mapStudents.put(student.getName(),student);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Map "+(endTime-startTime)/1000+"초");
    }
}
