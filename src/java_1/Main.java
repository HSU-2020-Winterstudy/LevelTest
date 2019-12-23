package java_1;

import java.util.ArrayList;

/**
 * TEST용 Main 클래스입니다.
 * Author : Cwhist
 * Created : 2019-12-23
 */
public class Main {

	/**
	 * test용 main 메서드입니다.
	 * 6번에서 만든 generator() 메서드로 객체를 생성하고 테스트를 실시합니다.
	 * 출력결과가 보기좋도록 약간의 문자열을 추가하였습니다.
	 */
	public static void main(String[] args) {
		Student student1 = null;
		student1 = student1.generator();
		Student student2 = null;
		student2 = student2.generator();
		Student student3 = null;
		student3 = student3.generator();
		
		PartTimer partTimer1 = null;
		partTimer1 = partTimer1.generator();
		PartTimer partTimer2 = null;
		partTimer2 = partTimer2.generator();
		PartTimer partTimer3 = null;
		partTimer3 = partTimer3.generator();
		
		//Person person1 = new Person(" ", " ");
		
		System.out.println(student1.getName());
		System.out.println(student1.getGender());
		System.out.println(student1.getID());
		System.out.println(student1.getNextID());
		student1.eat();
		student1.work();
		student1.workPartTime();
		
		System.out.println(student2.getName());
		System.out.println(student2.getGender());
		System.out.println(student2.getID());
		System.out.println(student2.getNextID());
		student2.eat();
		student2.work();
		student2.workPartTime();
		
		System.out.println(student3.getName());
		System.out.println(student3.getGender());
		System.out.println(student3.getID());
		System.out.println(student3.getNextID());
		student3.eat();
		student3.work();
		student3.workPartTime();
		
		System.out.println(partTimer1.getName());
		System.out.println(partTimer1.getGender());
		System.out.println(partTimer1.getID());
		System.out.println(partTimer1.getNextID());
		partTimer1.eat();
		partTimer1.work();
		partTimer1.workPartTime();
		
		System.out.println(partTimer2.getName());
		System.out.println(partTimer2.getGender());
		System.out.println(partTimer2.getID());
		System.out.println(partTimer2.getNextID());
		partTimer2.eat();
		partTimer2.work();
		partTimer2.workPartTime();
		
		System.out.println(partTimer3.getName());
		System.out.println(partTimer3.getGender());
		System.out.println(partTimer3.getID());
		System.out.println(partTimer3.getNextID());
		partTimer3.eat();
		partTimer3.work();
		partTimer3.workPartTime();
		
		ArrayList<PartTimeJob> arr = new ArrayList<PartTimeJob>();
		arr.add(student1);
		arr.add(student2);
		arr.add(student3);
		arr.add(partTimer1);
		arr.add(partTimer2);
		arr.add(partTimer3);
		
		for(int i=0; i<arr.size(); i++) {
			System.out.print("(arr)for " + i + " ");
			arr.get(i).workPartTime();
		}
		int i=0;
		while(i < arr.size()) {
			System.out.print("(arr)while " + i + " ");
			arr.get(i).workPartTime();
			i++;
		}
		
		i=0;
		for(PartTimeJob data : arr) {
			System.out.print("(arr)for-each " + i + " ");
			data.workPartTime();
			i++;
		}
		
		NewArrayList<PartTimeJob> newArr = new NewArrayList<PartTimeJob>();
		newArr.add(student1);
		newArr.add(student2);
		newArr.add(student3);
		newArr.add(partTimer1);
		newArr.add(partTimer2);
		newArr.add(partTimer3);
		
		for(i=0; i<newArr.size(); i++) {
			System.out.print("(newArr)for " + i + " ");
			newArr.get(i).workPartTime();
		}
		
		i=0;
		while(i < newArr.size()) {
			System.out.print("(newArr)while " + i + " ");
			arr.get(i).workPartTime();
			i++;
		}
		
		i=0;
		for(PartTimeJob data : newArr.getData()) {
			System.out.print("(newArr)for-each " + i + " ");
			data.workPartTime();
			i++;
			if(i >= newArr.size()) break;
		}
		
	}

}
