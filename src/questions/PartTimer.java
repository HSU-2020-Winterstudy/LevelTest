package questions;

public class PartTimer extends Person implements PartTimeJob{
    public PartTimer(int ID, String name, String sex) {
        super(ID, name, sex);
    }

    public PartTimer(String name, String sex) {
        super(name, sex);
    }

    @Override
    public void workPartTime() {
        System.out.println("PartTimer workPartTime");
    }

    @Override
    public void work() {
        System.out.println("PartTimer work");
    }

    @Override
    public void eat() {
        System.out.println("PartTimer eat");
    }
}
