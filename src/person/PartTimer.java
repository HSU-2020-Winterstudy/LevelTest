package person;

public class PartTimer extends Person implements PartTimeJob {

    /**
     *
     * @param ID
     * @param name
     * @param gender
     */
    public PartTimer(int ID, String name, Gender gender) {

        super(ID, name, gender);
    }

    /**
     *
     * @param name
     * @param gender
     */
    public PartTimer(String name, Gender gender) {

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
        PartTimer partTimer = new PartTimer(" ", Gender.MALE);

        partTimer.setName();
        partTimer.setGender();

        return partTimer;
    }

    @Override
    public String toString() {
        return this.getID() + "," + this.getName() + "," + this.getGender();
    }
}
