import person.PartTimer;
import person.Person;
import person.Student;

public class MainClass {

    public static void main(String[] args) {

        System.out.println("ID name gender");

        Student[] students = new Student[3];
        for (int i = 0; i < 3; ++i) {
            students[i] = new Student("student " + Integer.toString(i), true);
            System.out.println(students[i].getID() + " " + students[i].getName() + " " + students[i].getGender());
        }

        PartTimer[] partTimers = new PartTimer[3];
        for (int i = 0; i < 3; ++i) {
            partTimers[i] = new PartTimer("partTimer " + Integer.toString(i), true);
            System.out.println(partTimers[i].getID() + " " + partTimers[i].getName() + " " + partTimers[i].getGender());
        }

        /**
         *
         * instantiation of Person - error occurs
         */
//        Person person = new Person(" ", true);
    }
}
