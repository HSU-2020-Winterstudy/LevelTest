package questions;

import java.io.*;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class FileManager<T> {

    private static String filePath = "out.txt";
    private FileOutputStream fileOutputStream;
    private ObjectOutputStream objectOutputStream;
    private Class<?> classInformation = Student.class;

    public void fileWriter(NewDynamic<?> datas) {

        try {
            Class<?> classInfo = datas.getClass();
            Method[] methods = classInfo.getDeclaredMethods();
            File file = new File(filePath);
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for(int i=0;i<datas.size();i++){
                objectOutputStream.writeObject(datas.get(i));
            }
            objectOutputStream.flush();

            StringBuilder stringBuilder = new StringBuilder();
            for(Method method : methods){
                System.out.println(method.toString());
                stringBuilder.append(method);
                stringBuilder.append("\r\n");
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Methods.txt"));
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.flush();
            bufferedWriter.close();

            fileOutputStream.close();
            objectOutputStream.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    public NewDynamic<T> fileReader(){
        ArrayList<String> methods = new ArrayList<>();
        NewDynamic<T> objects = new NewDynamic<>();
        try{
            Class<?> classInfo = Student.class;
            FileInputStream fileInputStream = new FileInputStream("out.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            for(int i=0;i<500;i++){
                objects.put((T)objectInputStream.readObject());
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader("Methods.txt"));
            String line;
            while((line = bufferedReader.readLine())!=null){
                System.out.println(line);
                methods.add(line);
            }

        }
        catch (IOException | ClassNotFoundException e1){
            e1.printStackTrace();
        }
        catch (NullPointerException n1){
            System.out.println("Null");
            n1.printStackTrace();
        }
        return objects;
    }
}
