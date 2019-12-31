
/**
 * Author : Min-Kay
 * Created date : 2019-12-29
 */

package person;

import java.lang.reflect.Array;

public abstract class Student extends Person implements PartTimeJob  {
	
	private int studentId;
	private static int nextSId = 0 ;
	
	//construct num 1 with super
	public Student(int id, String name, String sex) {
		super(name, sex);
		
		if(id == nextSId)
			this.studentId = id;
		else
			this.studentId = -1;
	}
	
	//construct num 2 with super
	public Student(String name, String sex) {
		super(name, sex);
		
		this.studentId = nextSId++;
	}

	/**
	  * @Override getID() & @return nextId in Student 
	  */
	@Override
	public int getID() {
		return studentId;
	}
	
	@Override
	public void eat() {
		System.out.println("Student eating");
	}
	
	@Override
	public void work() {
		System.out.println("Student working");
	}
	
	public static boolean checker(Student p) {
		if(p.getID() >= -1 && p.getID()<nextSId)
			return true;
		else
			return false;
	}
	
	@Override
	public void workPartTime() {
		System.out.println("Do parttime job as a student");
	}
	
	public static Student Maker() {
		Student ranPer;
		String ranSex;

		if((int)(Math.random()*2)== 0)
			ranSex = "male";
		else
			ranSex = "female";
		
		ranPer = new Student(" ",ranSex){
			@Override
			public void eat() {
				System.out.println("Student eating");
			}
			
			@Override
			public void work() {
				System.out.println("Student working");
			}
			
			@Override
			public void workPartTime() {
				System.out.println("Do parttime job as a student");
			}
		};
		
		System.out.println("Student - "+ranPer.HashMaker());
		return ranPer;
	}
	

		public static void main(String[] args) {
			Student e,f,g; 
			e= new Student(1,"±è¼ºÅÂ","male") {};
			f= new Student(2,"Ronaldo","male") {};
			g= new Student("kim","female") {};
			
			Student[] array = {e,f,g};
			
			for(int i = 0; i<array.length; i++) {
				System.out.println(array[i].getID());
				System.out.println(array[i].getName());
				System.out.println(array[i].getSex());
				System.out.println(array[i].getSex());
				System.out.println(checker(array[i]));
				array[i].work();
				array[i].eat();
				array[i].workPartTime();
			}
			
			
		}
}
