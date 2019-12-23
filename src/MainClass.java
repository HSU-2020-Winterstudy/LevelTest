import person.Student;

public class MainClass {

    public static void main(String[] args) {

        Student[] students = new Student[100];
        for (Student student : students) {
            student = Student.generateStudent();
            StringBuilder newName = new StringBuilder(student.getName());
            newName.setCharAt(0, 'A');
            student.setName(newName.toString());
            System.out.println(student.getName());
        }
    }
}
