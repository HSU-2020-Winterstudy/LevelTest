/**
 * Author : Disarmy
 * Created date : 2019-12-24
 */

public class MainClass {
    public static void main(String[] args) {
        /* error
        Person person = new Person(" ", " ");
         */

        Student[] students = new Student[3];
        PartTimer[] partTimers = new PartTimer[3];

        for (int i = 0; i < 3; i++) {
            students[i] = Student.randomGenerator();
            partTimers[i] = PartTimer.randomGenerator();
        }

        //Student test
        for (int i = 0; i < 3; i++) {
            System.out.println("=============");
            System.out.println("Student name: " + students[i].getName());
            System.out.println("Student id: " + students[i].getId());
            System.out.println("Student gender: " + students[i].getGender());
            System.out.println("Student isCorrect: " + students[i].isCorrect(students[i]));
            System.out.println("Student nextId: " + students[i].getNextID());
            System.out.print("Student work: ");
            students[i].work();
            System.out.print("Student eat: ");
            students[i].eat();
            System.out.print("Student workPartTime: ");
            students[i].workPartTime();
        }

        //PartTimer test
        for (int i = 0; i < 3; i++) {
            System.out.println("=============");
            System.out.println("PartTimer name: " + partTimers[i].getName());
            System.out.println("PartTimer id: " + partTimers[i].getId());
            System.out.println("PartTimer gender: " + partTimers[i].getGender());
            System.out.println("PartTimer isCorrect: " + partTimers[i].isCorrect(partTimers[i]));
            System.out.println("PartTimer nextId: " + partTimers[i].getNextID());
            System.out.print("PartTimer work: ");
            partTimers[i].work();
            System.out.print("PartTimer eat: ");
            partTimers[i].eat();
            System.out.print("PartTimer workPartTime: ");
            partTimers[i].workPartTime();
        }

    }
}
