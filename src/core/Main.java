/**
 * Author : susemeeee
 * Created date : 2019-12-23
 */
package core;

import java.util.Iterator;

import jdk.internal.org.jline.terminal.spi.Pty;
import person.PartTimeJob;
import person.PartTimer;
//import person.Person;
import person.Student;

public class Main {
	public static void main(String[] args) {
		CostomArray<Student> students = new CostomArray<Student>();
		CostomArray<PartTimer> partTimers = new CostomArray<PartTimer>();
		//Student[] students = new Student[3];
		//PartTimer[] partTimers = new PartTimer[3];
		//Person person = new Person(1, " ", " ");
		
		for(int i = 0; i < 3; ++i) {
			students.add(Student.randomGenerator());
			partTimers.add(PartTimer.randomGenerator());
		}
		
		/**
		  * test Student class
		  */
		for(int i = 0; i < students.size(); ++i) {
			System.out.println("student" + i);
			System.out.println("ID: " + students.get(i).getID());
			System.out.println("name: " + students.get(i).getName());
			System.out.println("gender: " + students.get(i).getGender());
			System.out.println("nextID: " + Student.getNextID());
			System.out.println("inNormal:" + Student.isNormal(students.get(i)));
			students.get(i).work();
			students.get(i).eat();
			students.get(i).workPartTime();
			System.out.println();
		}
		/**
		  * test PartTimer class
		  */
		for(int i = 0; i < partTimers.size(); ++i) {
			System.out.println("partTimer" + i);
			System.out.println("ID: " + partTimers.get(i).getID());
			System.out.println("name: " + partTimers.get(i).getName());
			System.out.println("gender: " + partTimers.get(i).getGender());
			System.out.println("nextID: " + PartTimer.getNextID());
			System.out.println("isNormal: " + PartTimer.isNormal(partTimers.get(i)));
			partTimers.get(i).work();
			partTimers.get(i).eat();
			partTimers.get(i).workPartTime();
			System.out.println();
		}
		
		CostomArray<PartTimeJob> partTimeJobs = new CostomArray<PartTimeJob>();
		
		for(int i = 0; i < students.size(); ++i) {
			partTimeJobs.add(students.get(i));
		}
		for(int i = 0; i < partTimers.size(); ++i) {
			partTimeJobs.add(partTimers.get(i));
		}
		
		/**
		  * circuit 1(for)
		  */
		for(int i = 0; i < partTimeJobs.size(); ++i) {
			partTimeJobs.get(i).workPartTime();
		}
		System.out.println();
		
		/**
		  * circuit 2(while)
		  */
		int i = 0;
		while(i < partTimeJobs.size()) {
			partTimeJobs.get(i).workPartTime();
			++i;
		}
		System.out.println();
		
		/**
		  * circuit 3(do-while)
		  */
		i = 0;
		do {
			partTimeJobs.get(i).workPartTime();
			++i;
		} while (i < partTimeJobs.size());
		
	}
}