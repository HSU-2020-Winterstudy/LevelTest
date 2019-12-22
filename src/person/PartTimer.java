package person;

public class PartTimer extends Person implements PartTimeJob {

    /**
     *
     * @param ID
     * @param name
     * @param gender
     */
    public PartTimer(int ID, String name, String gender) {

        super(ID, name, gender);
    }

    /**
     *
     * @param name
     * @param gender
     */
    public PartTimer(String name, String gender) {

        super(name, gender);
    }

    @Override
    public void workPartTime() {

    }

    @Override
    public void work() {
        workPartTime();
    }

    @Override
    public void eat() {

    }
}
