package core;


import questions.PartTimer;
import questions.Person;
import questions.Student;

public class Main {
    public static void main(String[] args) {
        Student student_1 = Student.autoGenerator();
        Student student_2 = Student.autoGenerator();
        Student student_3 = Student.autoGenerator();
        PartTimer partTimer_1 = PartTimer.autoGenerator();
        PartTimer partTimer_2 = PartTimer.autoGenerator();
        PartTimer partTimer_3 = PartTimer.autoGenerator();

        /**
         *  Abstract Class can't be instance because that has not initialized methods
         **/
        //Person person_1 = Person.autoGenerator();
//        Person person_2 = Person.autoGenerator();
//        Person person_3 = Person.autoGenerator();
    }
}
