/**
 * Author : susemeeee
 * Created date : 2019-12-23
 */
package core;

import person.PartTimeJob;
import person.PartTimer;
//import person.Person;
import person.Student;

public class Main {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		PartTimer[] partTimers = new PartTimer[3];
		//Person person = new Person(1, " ", " ");
		
		for(int i = 0; i < students.length; ++i) {
			students[i] = Student.randomGenerator();
			partTimers[i] = PartTimer.randomGenerator();
		}
		
		/**
		  * test Student class
		  */
		for(int i = 0; i < students.length; ++i) {
			System.out.println("student" + i);
			System.out.println("ID: " + students[i].getID());
			System.out.println("name: " + students[i].getName());
			System.out.println("gender: " + students[i].getGender());
			System.out.println("nextID: " + Student.getNextID());
			System.out.println("inNormal:" + Student.isNormal(students[i]));
			students[i].work();
			students[i].eat();
			students[i].workPartTime();
			System.out.println();
		}
		
		/**
		  * test PartTimer class
		  */
		for(int i = 0; i < partTimers.length; ++i) {
			System.out.println("partTimer" + i);
			System.out.println("ID: " + partTimers[i].getID());
			System.out.println("name: " + partTimers[i].getName());
			System.out.println("gender: " + partTimers[i].getGender());
			System.out.println("nextID: " + PartTimer.getNextID());
			System.out.println("isNormal: " + PartTimer.isNormal(partTimers[i]));
			partTimers[i].work();
			partTimers[i].eat();
			partTimers[i].workPartTime();
			System.out.println();
		}
		
		PartTimeJob[] partTimeJobs = new PartTimeJob[6];
		
		for(int i = 0; i < students.length; ++i) {
			partTimeJobs[i] = students[i];
			partTimeJobs[i + 3] = partTimers[i];
		}
				
		/**
		  * circuit 1(for)
		  */
		for(int i = 0; i < partTimeJobs.length; ++i) {
			partTimeJobs[i].workPartTime();
		}
		System.out.println();
		
		/**
		  * circuit 2(while)
		  */
		int i = 0;
		while(i < partTimeJobs.length) {
			partTimeJobs[i].workPartTime();
			++i;
		}
		System.out.println();
		
		/**
		  * circuit 3(for-each)
		  */
		for(PartTimeJob partTimeJob : partTimeJobs) {
			partTimeJob.workPartTime();
		}
		System.out.println();
		
	}
}