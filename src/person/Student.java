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
    public Student(int ID, String name, Gender gender) {

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
    public Student(String name, Gender gender) {

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
        Student student = new Student(" ", Gender.MALE);

        student.setName();
        student.setGender();

        return student;
    }

    /**
     *
     * @return String of ID, studentID, name, gender
     */
    @Override
    public String toString() {
        return super.getID() + "," + this.getID() + "," + this.getName() + "," + this.getGender();
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
