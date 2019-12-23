package person;

/**
 *
 * Author: pllapallpal
 * Created date: 2019-12-21
 */
public class Student extends Person implements PartTimeJob {

    // variables ID and nextID are hiding the member variables ID and nextID of Student's superclass
    private int ID;
    private static int nextID;

    /**
     *
     * @param ID
     * @param name
     * @param gender
     */
    public Student(int ID, String name, boolean gender) {

        super(name, gender);

        this.ID = ID;
        if (nextID == ID) {
            this.ID = nextID++;
        }
        else {
            this.ID = -1;
        }
    }

    /**
     *
     * @param name
     * @param gender
     */
    public Student(String name, boolean gender) {

        super(name, gender);

        this.ID = nextID++;
    }

    @Override
    public void work() {
        System.out.println("student works!");
    }

    @Override
    public void eat() {
        System.out.println("student eats!");
    }

    @Override
    public void workPartTime() {
        System.out.println("student does part time job!");
    }

    public static Student generateStudent() {
        Student student = new Student(" ", true);

        student.setName();
        student.setGender();

        return student;
    }

    @Override
    public String toString() {
        return "Student {" +
                " ID = " + super.getID() +
                ", studentID = " + this.getID() +
                ", name = " + this.getName() +
                ", gender = " + this.getGender() + " }";
    }

    /**
     *
     * @return the ID of the student
     */
    @Override
    public int getID() {
        return this.ID;
    }

    public void setName(String name) {
        super.setName(name);
    }
}
