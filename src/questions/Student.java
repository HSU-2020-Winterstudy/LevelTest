package questions;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
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

    @Override
    public String toString() {
        Class<?> classInfo = Student.class;
        Method[] methods = classInfo.getDeclaredMethods();
        Field[] fields = new Field[100];
        int count = 0;
        for(Field field : this.getClass().getDeclaredFields()){
            field.setAccessible(true);
            fields[count] = field;
        }
//        return "Student Name : "+getName()+" ID : "+getID()+" Sex : "+getSex()+" ClassName : "+ Arrays.toString(methods) + Arrays.toString(fields);
        return Arrays.toString(methods)+Arrays.toString(fields);
    }
}
