package core;


import questions.*;

public class Main {
    public static void main(String[] args) {
        Student student_1 = Student.autoGenerator();
        Student student_2 = Student.autoGenerator();
        Student student_3 = Student.autoGenerator();
        PartTimer partTimer_1 = PartTimer.autoGenerator();
        PartTimer partTimer_2 = PartTimer.autoGenerator();
        PartTimer partTimer_3 = PartTimer.autoGenerator();


        System.out.println(student_1.toString());
        System.out.println(student_2.toString());
        System.out.println(student_3.toString());
        System.out.println(partTimer_1.toString());
        System.out.println(partTimer_2.toString());
        System.out.println(partTimer_3.toString());

        student_1.work();
        student_1.workPartTime();
        student_1.eat();

        student_2.work();
        student_2.workPartTime();
        student_2.eat();

        student_3.work();
        student_3.workPartTime();
        student_3.eat();

        partTimer_1.work();
        partTimer_1.workPartTime();
        partTimer_1.eat();

        partTimer_2.work();
        partTimer_2.workPartTime();
        partTimer_2.eat();

        partTimer_3.work();
        partTimer_3.workPartTime();
        partTimer_3.eat();

        /**
         *  Abstract Class can't be instance because that has not initialized methods
         **/
        //Person person_1 = Person.autoGenerator();
//        Person person_2 = Person.autoGenerator();
//        Person person_3 = Person.autoGenerator();
    }
}
