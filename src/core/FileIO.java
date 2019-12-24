package core;

import dynamicarray.MyArray;
import person.PartTimer;
import person.Person;
import person.Student;

import java.io.*;

public class FileIO {

    private static final String PATH = "out.txt";

    /**
     *
     * @param array contains information that should be written to file
     */
    public static void writeFile(MyArray<?> array) {

        File file = new File(PATH);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < array.size(); ++i) {
                bufferedWriter.write(array.get(i).getClass().getSimpleName() + ",");
                bufferedWriter.write(array.get(i).toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @return myArray<Person> that has been read from the file
     */
    public static MyArray<Person> readFile() {
        MyArray<Person> myArray = new MyArray<>();
        File file = new File(PATH);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = bufferedReader.readLine();
            String[] contents = line.split(",");
            if ("PartTimer".equals(contents[0])) {
                myArray.add(new PartTimer(Integer.parseInt(contents[1]), contents[2], Boolean.getBoolean(contents[3])));
            }
            else if ("Student".equals(contents[0])) {
                myArray.add(new Student(Integer.parseInt(contents[1]), contents[2], Boolean.getBoolean(contents[3])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return myArray;
    }

}
