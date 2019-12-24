package core;

import dynamicarray.MyArray;
import person.PartTimer;

import java.io.IOException;

public class MainClass {

    public static void main(String[] args) {

        MyArray<PartTimer> myArray = new MyArray<>();

        for (int i = 0; i < 200; ++i) {
            myArray.add(PartTimer.generatePartTimer());
        }

        FileIO.writeFile(myArray);
    }
}
