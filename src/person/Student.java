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
    public Student(int ID, String name, String gender) {

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
    public Student(String name, String gender) {

        super(name, gender);

        this.ID = nextID++;
    }

    @Override
    public void work() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void workPartTime() {

    }

    /**
     *
     * @return the ID of the student
     */
    @Override
    public int getID() {
        return this.ID;
    }
}
