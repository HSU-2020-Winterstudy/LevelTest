/**
 * Author : Disarmy
 * Created date : 2019-12-24
 */

public class MainClass {
    public static void main(String[] args) {
        Student[] students = new Student[100];

        for (int i = 0; i < 100; i++) {
            students[i] = Student.randomGenerator();
            StringBuilder insertA = new StringBuilder(students[i].getName());
            insertA.setCharAt(8, 'A');
            students[i].setName(insertA.toString());

            System.out.println(students[i].getName());
        }

        StringBuilder third = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            third.append(students[i].getName().charAt(10));
        }
        System.out.println(third.toString());
    }
}
