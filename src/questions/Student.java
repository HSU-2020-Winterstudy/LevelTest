package questions;


import java.util.Random;

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

    public static Student autoGenerator(){
        String className;
        String hashCode;
        String sex;
        Random random = new Random(System.currentTimeMillis());
        int randomSex = random.nextInt(2);

        if(randomSex == 1){
            sex = "men";
        }
        else {
            sex = "woman";
        }
        Student student = new Student("",sex);
        Class<?> classInfo = Student.class;
        className = classInfo.getName();
        hashCode = Integer.toHexString(student.hashCode()).toUpperCase();

        student.setName(className+"-"+hashCode);
        return student;
    }

}
