package java_1;

/**
 * Person 클래스 입니다.
 * Author : Cwhist 
 * Created : 2019-12-22
 */
public abstract class Person {
	private static int ID;
	private static int nextID = 0;
	private String name;
	private String gender;

	/**
	 * Person 클래스의 생성자 메서드입니다. id, 이름, 성별을 입력받아 클래스를 생성합니다.
	 */
	public Person(int ID, String name, String gender) {
		if(ID != this.nextID)
			this.ID = -1;
		else 
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
		this.ID = nextID++;
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
	
	/**
	 * nextID의 getter 메서드입니다. Person의 nextID를 리턴합니다.
	 * @return nextID in Person
	 */
	public static int getNextID() {
		return nextID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 생성된 person 객체가 정상적인 객체인지 확인하는 메서드입니다.
	 * 객체가 정상이면 true, 정상이 아니면 false를 리턴합니다.
	 * @return true or false
	 */
	public static boolean checkPerson() {
		if(ID > -1 && ID < nextID)
			return true;
		else
			return false;
	}
	
	/**
	 * Person의 추상 메서드입니다.
	 */
	public abstract void work();
	public abstract void eat();
	
	/**
	 * Person의 무작위 생성 메서드입니다. 
	 * Person객체를 생성할 수 없어 업캐스팅을 이용하여 객체를 생성했습니다.
	 * 생성된 객체를 리턴해줍니다.
	 * @return PartTimer instance upcating Person
	 */
	public static Person generator() {
		String gender;
		if((int)(Math.random()*2) == 0)
			gender = "남자";
		else
			gender = "여자";
		
		Person data = new PartTimer(" ", gender);
		data.setName("Person-" + Integer.toHexString(data.hashCode()).toUpperCase());
		
		return data;
	}
	
}
