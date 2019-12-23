package core;

import dynamicarray.MyArray;
import person.PartTimer;

import java.io.IOException;

public class MainClass {

    public static void main(String[] args) {

        MyArray<PartTimer> myArray = new MyArray<>();

        for (int i = 0; i < 100; ++i) {
            myArray.add(PartTimer.generatePartTimer());
        }

        try {
            FileIO.writeFile(myArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
