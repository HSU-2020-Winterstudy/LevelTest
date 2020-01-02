
/**
 * Author : Min-Kay
 * Created date : 2019-12-29
 */

package person;

public abstract class Person {
	private int id;
	private String name;
	private String sex;
	private static int nextId = 0 ;
	
	//constructor num 1
	public Person(int id,String name,String sex){
		if(id == nextId)
			this.id = id;
		else
			this.id = -1;
		this.name = name;
		this.sex = sex;
	}
	
	//constructor num 2
	public Person(String name,String sex){
		this.id = nextId++;
		this.name = name;
		this.sex = sex;
	}
	
	/**
	  * @return id in Person
	  */
	public int getID() {
		return id;
	}
	
	/**
	  * @return name in Person
	  */
	public String getName() {
		return name;
	}
	
	/**
	  * @return sex in Person
	  */
	public String getSex() {
		return sex;
	}
	
	/**
	  * @return nextId in Person
	  */
	public int getNextId() {
		return nextId;
	}
	
	/**
	  * @return boolean about ID's correction
	  */
	public static boolean checker(Person p) {
		if(p.getID() > -1 && p.getID()<nextId)
			return true;
		else
			return false;
	}
	
	/**
	  * @return random person
	  */
	public static Person Maker() {
		Person ranPer;
		String ranSex;

		if((int)(Math.random()*2)== 0)
			ranSex = "male";
		else
			ranSex = "female";
		
		ranPer = new Person(" ",ranSex) {
			
			@Override
			public void work() {
				System.out.println("Person working");
			}
			
			@Override
			public void eat() {
				System.out.println("Person eatting");
			}
			
		};
		
		System.out.println("Person - "+ranPer.HashMaker());
		return ranPer;
	}
	
	/**
	  * @return hashcode about random person's name
	  */
	public String HashMaker() {
		this.name =  Integer.toHexString(name.hashCode()).toUpperCase();
		return name;
	}
	
	public abstract void work();
	
	public abstract void eat();
	
	public static void main(String[] args) {
		//Person a;
		//a = new Person(1,"kim","male");
	}
}
