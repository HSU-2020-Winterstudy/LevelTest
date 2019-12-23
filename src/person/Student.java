/**
 * Author : susemeeee
 * Created date : 2019-12-23
 */
package person;

import java.util.concurrent.ThreadLocalRandom;

public class Student extends Person implements PartTimeJob {
	private int studentID;
	
	public Student(int ID, String name, String gender) {
		super(name, gender);
		studentID = ID;
	}
	
	/**
	  * @return studentID;
	  */
	@Override
	public int getID() {
		return studentID;
	}
	
	/**
	  * @return random Student class;
	  */
	public static Student randomGenerator() {
		String gender;

		if (ThreadLocalRandom.current().nextInt(1, 3) == 1) {
			gender = "male";
		} else {
			gender = "female";
		}

		Student student = new Student(Math.abs(ThreadLocalRandom.current().nextInt()), Student.class.getName() + "-" + Integer.toHexString(Student.class.hashCode()),
				gender);
		
		return student;
	}

	@Override
	public void work() {
		System.out.println("work-student");
	}

	@Override
	public void eat() {
		System.out.println("eat-student");
	}

	@Override
	public void workPartTime() {
		System.out.println("workparttime-student");
	}
}