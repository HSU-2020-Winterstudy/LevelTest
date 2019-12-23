/**
 * Author : susemeeee
 * Created date : 2019-12-21
 */
package person;

public abstract class Person {
	private int ID;
	private String name;
	private String gender;
	private static int nextID;
	
	//constructor 1
	public Person(int ID, String name, String gender) {
		if(ID != nextID) {
			this.ID = -1;
		}
		else {
			this.ID = ID;
		}
		
		this.name = name;
		this.gender = gender;
	}
	
	//constructor 2
	public Person(String name, String gender) {
		this.ID = nextID++;
		this.name = name;
		this.gender = gender;
	}
	
	/**
	  * @return ID is normal
	  */
	public static boolean isNormal(Person person) {
		return ((person.ID > -1) && (person.ID < nextID));
	}
	
	public abstract void work();
	
	public abstract void eat();
	
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
	
	/**
	  * @return nextID in person
	  */
	public static int getNextID() {
		return nextID;
	}
}
