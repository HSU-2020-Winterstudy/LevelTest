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
	 * Generic을 사용하여 변경한 가변길이 배열 NewArrayList에 여러 형식의 데이터를 100개씩 넣습니다.
	 * 데이터 자체나 데이터 내부 함수가 잘 기능하는지 테스트합니다.
	 */
	public static void main(String[] args) {
		NewArrayList<Student> stuArr = new NewArrayList();
		
		for(int i=0; i<100; i++) {
			Student data = null;
			data = data.generator();
			stuArr.add(data);
		}
		
		for(int i=0; i<100; i++) {
			System.out.println(i + " - " + stuArr.get(i).getName());
		}
		
		NewArrayList<Integer> intArr = new NewArrayList();
		
		for(int i=0; i<100; i++) {
			intArr.add(i);
		}
		
		for(int i=0; i<100; i++) {
			System.out.println(i + " - " + intArr.get(i));
		}
		
		NewArrayList<Person> perArr = new NewArrayList();
		
		for(int i=0; i<100; i++) {
			PartTimer data = null;
			data = data.generator();
			perArr.add(data);
		}
		
		for(int i=0; i<100; i++) {
			System.out.print(i + " - ");
			perArr.get(i).work();
		}
		
	}

}
