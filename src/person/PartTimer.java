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

		PartTimer partTimer = new PartTimer(Math.abs(ThreadLocalRandom.current().nextInt()), PartTimer.class.getName() + "-" + Integer.toHexString(PartTimer.class.hashCode()),
				gender);
		
		return partTimer;
	}

	@Override
	public void work() {

	}

	@Override
	public void eat() {

	}
	
	@Override
	public void workPartTime() {
		
	}
}
