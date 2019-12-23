/**
 * Author : susemeeee
 * Created date : 2019-12-23
 */
package person;

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