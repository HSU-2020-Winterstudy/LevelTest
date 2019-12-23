package person;

public class PartTimer extends Person implements PartTimeJob {

    /**
     *
     * @param ID
     * @param name
     * @param gender
     */
    public PartTimer(int ID, String name, boolean gender) {

        super(ID, name, gender);
    }

    /**
     *
     * @param name
     * @param gender
     */
    public PartTimer(String name, boolean gender) {

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
