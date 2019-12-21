/**
 * Author : susemeeee
 * Created date : 2019-12-21
 */
package person;

public class Person {
	private int ID;
	private String name;
	private String gender;
	
	//constructor 1
	public Person(int ID, String name, String gender) {
		this.ID = ID;
		this.name = name;
		this.gender = gender;
	}
	
	//constructor 2
	public Person(String name, String gender) {
		this.ID = -1;
		this.name = name;
		this.gender = gender;
	}
	
	/**
	  * @return ID in person
	  */
	public int getID() {
		return ID;
	}

	/**
	  * @return name in person
	  */
	public String getName() {
		return name;
	}
	
	/**
	  * @return gender in person
	  */
	public String getGender() {
		return gender;
	}
}
