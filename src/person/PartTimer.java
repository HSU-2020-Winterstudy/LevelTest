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
        System.out.println("PartTimer works!");
    }

    @Override
    public void work() {
        workPartTime();
    }

    @Override
    public void eat() {
        System.out.println("PartTimer eats!");
    }

    public static PartTimer generatePartTimer() {
        PartTimer partTimer = new PartTimer(" ", true);

        partTimer.setName();
        partTimer.setGender();

        return partTimer;
    }
}
