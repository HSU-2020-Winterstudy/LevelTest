package java_1;

/**
 * Person을 상속받고 PartTimeJob을 implements하는 PartTimer 클래스입니다.
 * Author : Cwhist
 * Created : 2019-12-22
 */
public class PartTimer extends Person implements PartTimeJob {

	/**
	 * PartTimer의 생성자 메서드입니다.
	 */
	public PartTimer(int ID, String name, String gender) {
		super(ID, name, gender);
	}
	
	public PartTimer(String name, String gender) {
		super(name, gender);
	}

	/**
	 * Person의 work() 메서드를 오버라이드 한 메서드입니다.
	 */
	@Override
	public void work() {
		workPartTime();
	}

	/**
	 * Person의 eat() 메서드를 오버라이드 한 메서드입니다.
	 */
	@Override
	public void eat() {
		System.out.println("eating...");
	}

	/**
	 * PartTimeJob의 workPartTime() 메서드를 오버라이드 한 메서드입니다.
	 */
	@Override
	public void workPartTime() {
		System.out.println("working...(partTime)");
	}
}
