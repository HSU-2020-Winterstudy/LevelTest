package question_3;

import question_1.Person;

public class Student extends Person {
    public Student(int ID, String name, String sex) {
        super(ID, name, sex);
    }
    public Student(String name, String sex){
        super(name, sex);
    }
    /**
     * ID's getter in Person class is already return Int
     */
}
