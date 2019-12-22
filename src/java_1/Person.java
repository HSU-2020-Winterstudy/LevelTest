package java_1;
/**
 * Person 클래스 입니다.
 * Author : Cwhist 
 * Created : 2019-12-22
 */
public class Person {
	private int ID;
	private String name;
	private String gender;

	/**
	 * Person 클래스의 생성자 메서드입니다. id, 이름, 성별을 입력받아 클래스를 생성합니다.
	 */
	public Person(int ID, String name, String gender) {
		this.ID = ID;
		this.name = name;
		this.gender = gender;
	}

	/**
	 * Person 클래스의 생성자 메서드입니다. 이름, 성별을 입력받고 id를 -1로 초기화하며 클래스를 생성합니다.
	 */
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
		this.ID = -1;
	}

	/**
	 * ID의 getter 메서드입니다. Person의 id값을 리턴합니다.
	 * @return id in Person
	 */
	public int getID() {
		return ID;
	}

	/**
	 * 이름의 getter 메서드입니다. Person의 name값을 리턴합니다.
	 * @return name in Person
	 */
	public String getName() {
		return name;
	}

	/**
	 * 성별의 getter 메서드입니다. Person의 gender값을 리턴합니다.
	 * @return gender in Person
	 */
	public String getGender() {
		return gender;
	}
	
}
