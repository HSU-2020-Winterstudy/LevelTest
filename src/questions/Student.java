package questions;


public class Student extends Person implements PartTimeJob{
    public Student(int ID, String name, String sex) {
        super(ID, name, sex);
    }
    public Student(String name, String sex){
        super(name, sex);
    }

    @Override
    public void work() {
        System.out.println("I'm studying");
    }

    @Override
    public void eat() {
        System.out.println("kukbab");
    }

    @Override
    public void workPartTime() {
        System.out.println("Student workPartTime");
    }
    /**
     * ID's getter in Person class is already return Int
     */
}
