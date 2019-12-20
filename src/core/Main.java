package core;


import questions.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        DynamicArray<Student> dynamicStudents = new DynamicArray<>(Student.class);
        ArrayList<Student> listStudents = new ArrayList<>();
        HashMap<String, Student> mapStudents = new HashMap<>();

        ArrayList<Student> randomTable_1 = new ArrayList<>();
        ArrayList<Student> randomTable_2 = new ArrayList<>();

        //randomTables
        for (int i = 0; i < 30000; i++) {
            Student student = Student.autoGenerator();
            int randomID = (int) (Math.random() * 200000);
            student.setID(randomID);
            randomTable_1.add(student);
        }
        for (int i = 0; i < 30000; i++) {
            Student student = Student.autoGenerator();
            int randomID = (int) (Math.random() * 200000);
            student.setID(randomID);
            randomTable_2.add(student);
        }

        for (int i = 0; i < 30000; i++) {
            Student student = Student.autoGenerator();
            int randomID = (int) (Math.random() * 200000);
            student.setID(randomID);
            mapStudents.put(student.getName(), student);
        }
        for (int i = 0; i < 30000; i++) {
            Student student = Student.autoGenerator();
            int randomID = (int) (Math.random() * 200000);
            student.setID(randomID);
            dynamicStudents.put(student);
        }
        for (int i = 0; i < 30000; i++) {
            Student student = Student.autoGenerator();
            int randomID = (int) (Math.random() * 200000);
            student.setID(randomID);
            listStudents.add(student);
        }
        System.out.println("Inserting Finish");
        int dynamicSuccessCount = 0;
        int listSuccessCount = 0;
        int mapSuccessCount = 0;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < randomTable_2.size(); i++) {
            if (dynamicStudents.contains(randomTable_2.get(i)) != -1) {
                dynamicSuccessCount++;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Dynamic " + (endTime - startTime) / 1000 + "초");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < randomTable_2.size(); i++) {
            if (listStudents.contains(randomTable_2.get(i))) {
                listSuccessCount++;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("List " + (endTime - startTime) / 1000 + "초");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < randomTable_2.size(); i++) {
            if (mapStudents.containsValue(randomTable_2.get(i))) {
                mapSuccessCount++;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Map " + (endTime - startTime) / 1000 + "초");

        System.out.println("DynamicSuccess " + dynamicSuccessCount);
        System.out.println("ListSuccess " + listSuccessCount);
        System.out.println("MapSuccess " + mapSuccessCount);
    }
}
