/* Q5.md
 * Author : unnokid
 * created date : 2019-12-24
 */

//PartTimeJob 인터페이스 생성
public interface PartTimeJob
{
	public void workPartTime();
}

//추상클래스
public abstract class Person
{
	private int ID;
	private String name;
	private String gender;
	private static int nextID;
	
	//1번 생성자
	public Person(int ID, String name, String gender)
	{
		
		if(nextID == ID)
		{
			this.ID=ID;
		}
		else
		{
			this.ID=-1;
		}

		this.name=name;
		this.gender=gender;
	}

	//2번 생성자
	public Person(Stirng name, String gender)
	{
		this.name=name;
		this.gender=gender;
		this.ID =nextID;
		nextID++;
	}
	
	//getter 메서드 추가
	public int getID()
	{
		return ID;
	}

	public String getName()
	{
		return name;
	}

	public String getGender()
	{
		return gender;
	}

	public static boolean correct(Person person)
	{
		if(person.ID >-1 && person.ID < next ID)
			return true;
		else
			return false;
	}
	//추상메소드 생성
	public abstract String work();

	public abstract String eat();
}
public class Student extends Person implements PartTimeJob
{
	private int StudentID;
	private static int nextID;
	//Student의 ID는 학번으로 대체
	//생성자 똑같이 호출
	public Student(int ID,String name, String gender)
	{
		super(name,gender);
		this.StudentID = ID;
		if(nextID == ID)
		{
			this.StudentID= ID;
			nextID++;
		}
		else
			this.StudentID= -1;
	}

	public Student(String name,String gender)
	{
		super(name,gender);
		this.StudentID = nextID;
		nextID++;
	}
	//override getID()
	public int getID()
	{

		return this.StudentID;
	}

	public String work()
	{
		return "working";
	}

	public String eat()
	{
		return "eating";
	}

	public void workPartTime()
	{

	}
}
