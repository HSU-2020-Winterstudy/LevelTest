/* Q2.md
 * Author : unnokid
 * created date : 2019-12-21
 */

public class Person
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


}
