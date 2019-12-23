import com.sun.xml.internal.ws.wsdl.writer.document.Part;
import person.PartTimeJob;
import person.PartTimer;
import person.Person;
import person.Student;

import java.util.ArrayList;
import java.util.List;

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

        // Add instances to the list
        List<PartTimeJob> partTimeJobs = new ArrayList<>();
        for (int i = 0; i < 3; ++i) {
            partTimeJobs.add( (PartTimeJob) students[i] );
        }
        for (int i = 0; i < 3; ++i) {
            partTimeJobs.add( (PartTimeJob) partTimers[i] );
        }

        // for loop
        for (int i = 0; i < 6; ++i) {
            partTimeJobs.get(i).workPartTime();
        }

        // enhanced for loop
        for (PartTimeJob partTimeJob : partTimeJobs) {
            partTimeJob.workPartTime();
        }

        // forEach() method
        partTimeJobs.forEach(PartTimeJob::workPartTime);

    }
}
