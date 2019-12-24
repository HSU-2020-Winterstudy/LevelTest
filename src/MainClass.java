/**
 * Author : Disarmy
 * Created date : 2019-12-24
 */

public class MainClass {
    public static void main(String[] args) {
        MyArray<Student> studentArray = new MyArray<Student>();

        for (int i = 0; i < 100; i++) {
            Student student = Student.randomGenerator();
            studentArray.add(student);
            System.out.println(studentArray.get(i).getName());
        }

        MyArray<PartTimer> partTimerArray = new MyArray<PartTimer>();

        for (int i = 0; i < 100; i++) {
            PartTimer partTimer = PartTimer.randomGenerator();
            partTimerArray.add(partTimer);
            System.out.println(partTimerArray.get(i).getName());
        }
    }
}
