package questions;

import java.io.*;
import java.util.StringTokenizer;

public class FileManager<T> {

    private static String filePath = "out.txt";

    public void fileWriter(NewDynamic<?> datas) {

        try {
            StringBuilder stringBuilder = new StringBuilder();
            for(int i=0;i<datas.size();i++){
                stringBuilder.append(datas.get(i).toString());
                stringBuilder.append("\r\n");
            }

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.flush();
            bufferedWriter.close();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    public NewDynamic<T> fileReader(){
        NewDynamic<T> testArr = new NewDynamic<>();
        NewDynamic<Student> students = new NewDynamic<>();
        NewDynamic<PartTimer> partTimers = new NewDynamic<>();
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("out.txt"));
            String line;
            while((line = bufferedReader.readLine())!=null){
                if(line.charAt(0) == 'S'){
                    testArr.put((T) makeStudent(line));
                }
                else{
                    testArr.put((T)makePartTimer(line));
                }
            }

        }
        catch (IOException e1){
            e1.printStackTrace();
        }
        catch (NullPointerException n1){
            System.out.println("Null");
            n1.printStackTrace();
        }
//        return (NewDynamic<T>) students;
        return testArr;
    }

    public Student makeStudent(String line){
        Student result;
        StringTokenizer stringTokenizer = new StringTokenizer(line, " ");
        String test = stringTokenizer.nextToken();
        String name="";
        int id = 0;
        Person.sexType sexType = null;
        while(stringTokenizer.hasMoreTokens()){
            String token = stringTokenizer.nextToken();
            if(token.equals("name")){
                token = stringTokenizer.nextToken();
                name = token;
            }
            if(token.equals("id")){
                token = stringTokenizer.nextToken();
                id = Integer.parseInt(token);
            }
            if(token.equals("sex")){
                token = stringTokenizer.nextToken();
                sexType = Person.sexType.valueOf(token);
            }
        }
        result = new Student(id, name,sexType);
        result.setID(id);
        return result;
    }

    public PartTimer makePartTimer(String line){
        PartTimer result;
        StringTokenizer stringTokenizer = new StringTokenizer(line, " ");
        String test = stringTokenizer.nextToken();
        String name="";
        int id = 0;
        Person.sexType sexType = null;
        while(stringTokenizer.hasMoreTokens()){
            String token = stringTokenizer.nextToken();
            if(token.equals("name")){
                token = stringTokenizer.nextToken();
                name = token;
            }
            if(token.equals("id")){
                token = stringTokenizer.nextToken();
                id = Integer.parseInt(token);
            }
            if(token.equals("sex")){
                token = stringTokenizer.nextToken();
                sexType = Person.sexType.valueOf(token);
            }
        }
        result = new PartTimer(id, name,sexType);
        result.setID(id);
        return result;
    }
}
