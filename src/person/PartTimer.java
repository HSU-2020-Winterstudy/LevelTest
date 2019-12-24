/**
 * Author : susemeeee
 * Created date : 2019-12-23
 */
package person;

import java.util.concurrent.ThreadLocalRandom;

public class PartTimer extends Person implements PartTimeJob {
	public PartTimer(int ID, String name, String gender) {
		super(ID, name, gender);
	}
	
	public PartTimer(String name, String gender) {
		super(name, gender);
	}
	
	/**
	  * @return random PartTimer class;
	  */
	public static PartTimer randomGenerator() {
		String gender;

		if (ThreadLocalRandom.current().nextInt(1, 3) == 1) {
			gender = "male";
		} else {
			gender = "female";
		}

		PartTimer partTimer = new PartTimer(PartTimer.class.getSimpleName() + "-" + Integer.toHexString(PartTimer.class.hashCode()),
				gender);
		
		return partTimer;
	}

	@Override
	public void work() {
		System.out.println("work-parttimer");
	}

	@Override
	public void eat() {
		System.out.println("eat-parttimer");
	}
	
	@Override
	public void workPartTime() {
		System.out.println("workparttime-parttimer");
	}
	
	@Override
	public String toString() {
		String[] classData = new String[4];
		classData[0] = "class:" + this.getClass().getSimpleName() + "#";
		classData[1] = "ID:" + Integer.toString(getID()) + "#";
		classData[2] = "name:" + name + "#";
		classData[3] = "gender:" + getGender() + "#";
		
		String classInfo = "";
		for(int i = 0; i < classData.length; ++i) {
			classInfo += classData[i];
		}
		
		return classInfo;
	}
}
