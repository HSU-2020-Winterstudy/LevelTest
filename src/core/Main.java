/**
 * Author : susemeeee
 * Created date : 2019-12-23
 */
package core;

import java.io.IOException;

import person.Student;

public class Main {
	public static void main(String[] args) throws IOException {
		TestManager.classGenerateTest();
		
		TestManager.Student100Test();
		
		CostomArray<Student> students = new CostomArray<>();
		for(int i = 0; i < 100; ++i) { //Á¶Á¤ ¿ä¸Á
			students.add(Student.randomGenerator());
		}
		
		TestManager.fileWriter(students);
	}
}