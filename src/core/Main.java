package core;


import questions.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        DynamicArray<Student> dynamicStudents = new DynamicArray<>(Student.class);
        ArrayList<Student> listStudents = new ArrayList<>();
        HashMap<String,Student> mapStudents = new HashMap<>();

        ArrayList<Student> randomTable_1 = new ArrayList<>();
        ArrayList<Student> randomTable_2 = new ArrayList<>();

        //randomTables
        for(int i=0;i<70000;i++){
            Student student = Student.autoGenerator();
            int randomID = (int) (Math.random() * 200000);
            student.setID(randomID);
            randomTable_1.add(student);
        }
        for(int i=0;i<70000;i++){
            Student student = Student.autoGenerator();
            int randomID = (int) (Math.random() * 200000);
            student.setID(randomID);
            randomTable_2.add(student);
        }

        for(int i=0;i<70000;i++){
            Student student = Student.autoGenerator();
            int randomID = (int) (Math.random() * 200000);
            student.setID(randomID);
            mapStudents.put(student.getName(),student);
        }
        for(int i=0;i<70000;i++){
            Student student = Student.autoGenerator();
            int randomID = (int) (Math.random() * 200000);
            student.setID(randomID);
            dynamicStudents.put(student);
        }
        for(int i=0;i<70000;i++){
            Student student = Student.autoGenerator();
            int randomID = (int) (Math.random() * 200000);
            student.setID(randomID);
            listStudents.add(student);
        }
        System.out.println("Inserting Finish");
        long startTime = System.currentTimeMillis();
        for(int i=0;i<randomTable_1.size();i++){
            for(int x=0;x<dynamicStudents.size();x++){
                if(dynamicStudents.get(x).getID() == randomTable_1.get(x).getID()){
                    dynamicStudents.remove(x);
                    break;
                }
            }
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Dynamic "+(endTime-startTime)/1000+"초");

        startTime = System.currentTimeMillis();
        for(int i=0;i<randomTable_1.size();i++){
            for(int x=0;x<listStudents.size();x++){
                if(listStudents.get(x).getID() == randomTable_1.get(x).getID()){
                    listStudents.remove(x);
                    break;
                }
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("List "+(endTime-startTime)/1000+"초");

        startTime = System.currentTimeMillis();
        for(int i=0;i<randomTable_1.size();i++){
            String randomName = randomTable_1.get(i).getName();
            for(int x=0;x<mapStudents.size();x++){
                if(mapStudents.get(randomName)!=null && mapStudents.get(randomName).getID() == randomTable_1.get(x).getID()){
                    mapStudents.remove(randomName);
                    break;
                }
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Map "+(endTime-startTime)/1000+"초");
    }
}
