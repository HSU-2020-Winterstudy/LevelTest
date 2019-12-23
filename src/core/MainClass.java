package core;

import person.PartTimer;
import person.Student;

public class MainClass {

    public static void main(String[] args) {

        PartTimer[] partTimers = new PartTimer[100];
        for (int i = 0; i < 100; ++i) {
            partTimers[i] = PartTimer.generatePartTimer();
            StringBuilder newName = new StringBuilder(partTimers[i].getName());
            newName.setCharAt(8, 'A');
            partTimers[i].setName(newName.toString());
            System.out.println(partTimers[i].getName());
        }

        StringBuilder thirdChar = new StringBuilder();
        for (PartTimer partTimer : partTimers) {
            thirdChar.append(partTimer.getName().charAt(10));
            System.out.println(partTimer.toString());
        }
    }
}
