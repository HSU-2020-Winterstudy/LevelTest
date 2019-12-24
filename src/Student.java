/**
 * Author : Disarmy
 * Created date : 2019-12-22
 */

public class Student extends Person implements PartTimeJob {
    private int studentId;
    private static int nextID;

    /*
     * First Constructor */
    public Student(int id, String name, String gender) {
        super(name, gender);

        if (id != nextID)
            this.studentId = -1;
        else
            this.studentId = id;
    }

    /*
     * Second Constructor */
    public Student(String name, String gender) {
        super(name, gender);

        this.studentId = nextID++;
    }

    /*
     * @return Student's id */
    @Override
    public int getId() {
        return this.studentId;
    }

    public static Student randomGenerator() {
        Student student;
        String gender;
        if ((int) (Math.random() * 2) % 2 == 0) {
            gender = "남자";
        } else
            gender = "여자";

        student = new Student(" ", gender);
        student.setHashName();

        return student;
    }

    @Override
    public void work() {
        System.out.println("Student work");
    }

    @Override
    public void eat() {
        System.out.println("Student eat");
    }

    @Override
    public void workPartTime() {
        System.out.println("Student workPartTime");
    }
}