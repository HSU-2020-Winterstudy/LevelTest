package questions;


import java.util.Random;

public class Student extends Person implements PartTimeJob{
    public Student(int ID, String name, sexType sex) {
        super(ID, name, sex);
    }
    public Student(String name, sexType sex){
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

    public static Student autoGenerator(){
        String className;
        String hashCode;
        String sex;
        Random random = new Random(System.currentTimeMillis());
        int randomSex = random.nextInt(2);
        Student student;
        if(randomSex != 1){
            student = new Student("", sexType.MALE);
        }
        else {
            student = new Student("", sexType.FEMALE);
        }

        Class<?> classInfo = Student.class;
        className = classInfo.getName();
        hashCode = Integer.toHexString(student.hashCode()).toUpperCase();

        student.setName(className+"-"+hashCode);
        return student;
    }

    @Override
    public String toString() {
        return String.format("Student name %s id %d sex %s", getName(),getID(),getSex());
    }
}
