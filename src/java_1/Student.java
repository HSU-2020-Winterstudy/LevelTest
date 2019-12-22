package java_1;

/**
 * Person 클래스를 상속받는 Student 클래스입니다.
 * Author : Cwhist
 * Created : 2019-12-22
 */
public class Student extends Person implements PartTimeJob {
	private int ID;

	/**
	 * Student의 생성자 메서드입니다. ID(학번)를 19로 시작하는 7자리 정수로 초기화 시킵니다.
	 */
	public Student(String name, String gender) {
		super(name, gender);
		this.ID = super.getID() + 1900000;
	}
	
	/**
	 * Person의 getID 메서드를 오버라이드한 메서드입니다. 학번을 리턴시켜줍니다.
	 * @return ID in Student
	 */
	public int getID() {
		return this.ID;
	}
	
	/**
	 * 추상 클래스 Person의 추상메서드 work()을 오버라이드 한 메서드입니다.
	 */
	@Override
	public void work() {
		System.out.println("working...");
	}

	/**
	 * 추상 클래스 Person의 추상메서드 eat()을 오버라이드 한 메서드입니다.
	 */
	@Override
	public void eat() {
		System.out.println("eating...");
	}
	
	/**
	 * 인터페이스 PartTimeJob의 메서드를 오버라이드 한 메서드입니다.
	 */
	@Override
	public void workPartTime() {
		System.out.println("working...(partTime)");
	}

}
