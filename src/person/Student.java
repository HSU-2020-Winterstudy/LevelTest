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
	
	public void setName() {
		String[] splitName = name.split("-");
		String newName = splitName[0] + "-A" + splitName[1].substring(1);
		
		name = newName;
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

		Student student = new Student(Math.abs(ThreadLocalRandom.current().nextInt()), Student.class.getSimpleName() + "-" + Integer.toHexString(Student.class.hashCode()),
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
	
	@Override
	public String toString() {
		String[] classData = new String[4];
		classData[0] = "class:" + this.getClass().getSimpleName() + "#";
		classData[1] = "ID:" + Integer.toString(studentID) + "#";
		classData[2] = "name:" + name + "#";
		classData[3] = "gender:" + getGender() + "#";
		
		String classInfo = "";
		for(int i = 0; i < classData.length; ++i) {
			classInfo += classData[i];
		}
		
		return classInfo;
	}
}