package questions;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FileManager {

    private static String studentFilePath = "studentList.txt";
    private static String partTimerFilePath = "partTimerList.txt";
    private boolean isStudent = true;


    public void fileWriter(NewDynamic<?> datas) {
        Class<?> classInfo;
        if(datas!=null){
            classInfo = datas.get(0).getClass();
            StringTokenizer stringTokenizer = new StringTokenizer(classInfo.getName(),".");
            ArrayList<String> nameList = new ArrayList<>();
            while(stringTokenizer.hasMoreTokens()){
                nameList.add(stringTokenizer.nextToken());
            }
            if(nameList.contains("Student")){
                isStudent = true;
            }
            else{
                isStudent = false;
            }
            System.out.println(isStudent);
        }
        else{
            return;
        }


        try {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < datas.size(); i++) {
                stringBuilder.append(datas.get(i).toString());
                stringBuilder.append("\r\n");
            }
            BufferedWriter bufferedWriter;
            if(isStudent){
                bufferedWriter  = new BufferedWriter(new FileWriter(studentFilePath));
            }
            else{
                bufferedWriter = new BufferedWriter(new FileWriter(partTimerFilePath));
            }

            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.flush();
            bufferedWriter.close();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public NewDynamic<Person> fileReader() {
        NewDynamic<Person> personList = new NewDynamic<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(studentFilePath));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.charAt(0) == 'S') {
                    personList.put(makeStudent(line));
                } else {
                    personList.put(makePartTimer(line));
                }
            }
            bufferedReader = new BufferedReader(new FileReader(partTimerFilePath));
            while ((line = bufferedReader.readLine()) != null) {
                if (line.charAt(0) == 'S') {
                    personList.put(makeStudent(line));
                } else {
                    personList.put(makePartTimer(line));
                }
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (NullPointerException n1) {
            System.out.println("Null");
            n1.printStackTrace();
        }
        return personList;
    }
    public Student makeStudent(String line) {
        Student result;
        StringTokenizer stringTokenizer = new StringTokenizer(line, " ");
        String nameList = stringTokenizer.nextToken();
        String name = "";
        int id = 0;
        Person.sexType sexType = null;
        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            if (token.equals("name")) {
                token = stringTokenizer.nextToken();
                name = token;
            }
            if (token.equals("id")) {
                token = stringTokenizer.nextToken();
                id = Integer.parseInt(token);
            }
            if (token.equals("sex")) {
                token = stringTokenizer.nextToken();
                sexType = Person.sexType.valueOf(token);
            }
        }
        result = new Student(id, name, sexType);
        result.setID(id);
        return result;
    }

    public PartTimer makePartTimer(String line) {
        PartTimer result;
        StringTokenizer stringTokenizer = new StringTokenizer(line, " ");
        String nameList = stringTokenizer.nextToken();
        String name = "";
        int id = 0;
        Person.sexType sexType = null;
        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            if (token.equals("name")) {
                token = stringTokenizer.nextToken();
                name = token;
            }
            if (token.equals("id")) {
                token = stringTokenizer.nextToken();
                id = Integer.parseInt(token);
            }
            if (token.equals("sex")) {
                token = stringTokenizer.nextToken();
                sexType = Person.sexType.valueOf(token);
            }
        }
        result = new PartTimer(id, name, sexType);
        result.setID(id);
        return result;
    }
}
