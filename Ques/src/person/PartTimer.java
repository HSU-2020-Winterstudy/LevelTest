/**
 * Author : Min-Kay
 * Created date : 2019-12-29
 */


package person;

public abstract class PartTimer extends Person implements PartTimeJob {

	//constructor num 1 with super
	public PartTimer(int Id, String name, String sex) {
		super(Id,name,sex);
	}
	
	public PartTimer(String name, String sex) {
		super(name,sex);
	}
	
	@Override
	public void eat() {
		System.out.println("Parttimer eating");
	}
	
	@Override
	public void work() {
		System.out.println("Parttimer working");
	}
	
	@Override
	public void workPartTime() {
		System.out.println("Parttimer work parttime");
	}
	
	public static boolean checker(PartTimer p) {
		if(p.getID() > -1 && p.getID()<p.getNextId())
			return true;
		else
			return false;
	}
	
	public static PartTimer Maker() {
		PartTimer ranPer;
		String ranSex;

		if((int)(Math.random()*2)== 0)
			ranSex = "male";
		else
			ranSex = "female";
		
		ranPer = new PartTimer(" ",ranSex){};
		
		System.out.println("PartTimer - " + ranPer.HashMaker());
		return ranPer;
	}
	
	public static void main(String[] args) {
		PartTimer a,b,c; 
		a= new PartTimer(1,"김성태","male") {};
		b= new PartTimer(2,"Ronaldo","male") {};
		c= new PartTimer("kim","female") {};
		
		PartTimer[] array = {a,b,c};
		
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i].getID());
			System.out.println(array[i].getName());
			System.out.println(array[i].getSex());
			System.out.println(checker(array[i]));
			array[i].work();
			array[i].eat();
			array[i].workPartTime();
		}
	
	}
}
