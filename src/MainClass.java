import person.Student;

public class MainClass {

    public static void main(String[] args) {

        Student[] students = new Student[100];
        for (int i = 0; i < 100; ++i) {
            students[i] = Student.generateStudent();
            StringBuilder newName = new StringBuilder(students[i].getName());
            newName.setCharAt(8, 'A');
            students[i].setName(newName.toString());
            System.out.println(students[i].getName());
        }

        StringBuilder thirdChar = new StringBuilder();
        for (Student student : students) {
            thirdChar.append(student.getName().charAt(10));
        }
        System.out.println(thirdChar);
    }
}
