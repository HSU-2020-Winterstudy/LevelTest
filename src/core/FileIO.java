package core;

import dynamicarray.MyArray;
import person.Person;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

    public static void writeFile(MyArray<?> array) throws IOException {

        File file = new File("out.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        for (int i = 0; i < array.size(); ++i) {
             bufferedWriter.write(array.get(i).toString());
             bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }

}
