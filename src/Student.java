/**
 * Author : Disarmy
 * Created date : 2019-12-22
 */

public class Student extends Person {
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
    public int getID() {
        return this.studentId;
    }
}