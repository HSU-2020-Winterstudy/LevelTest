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
	 * 6번에서 만든 generator() 메서드로 객체를 100개 생성합니다.
	 * Person.setFirstName() 메서드를 사용하여 생성된 객체들의 첫글자를 A로 변경합니다.
	 * StringBuilder를 사용해 Student들의 이름에서 3번째 글자를 추출해 append합니다.
	 */
	public static void main(String[] args) {
		ArrayList<Student> studentArr = new ArrayList();
		
	      for(int i=0; i<100; i++) {
	         Student student = null;
	         student = student.generator();
	         studentArr.add(student);
	      }
	      
	      for(int i=0; i<100; i++) {
	         studentArr.get(i).setFirstName('A');
	      }
	      
	      StringBuilder thirdCharsBuilder = new StringBuilder();
	      System.out.print("3번째 글자들 - ");
	      for(int i=0; i<100; i++) {
	    	  thirdCharsBuilder.append(Character.toString(studentArr.get(i).getName().charAt(2)));
	    	  System.out.print(studentArr.get(i).getName().charAt(2));
	      }
	      System.out.println();
	      
	      String thirdChars = new String(thirdCharsBuilder.toString());
	      System.out.println("생성된 문자열 - " + thirdChars);
	}

}
