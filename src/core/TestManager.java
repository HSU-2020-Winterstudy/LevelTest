/**
 * Author : susemeeee
 * Created date : 2019-12-23
 */
package core;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.FileInputStream;

import person.PartTimeJob;
import person.PartTimer;
//import person.Person;
import person.Student;

public class TestManager {
	/**
	  * Q8 & Q12 test code
	  */
	public static void classGenerateTest() {
		CostomArray<Student> students = new CostomArray<Student>();
		CostomArray<PartTimer> partTimers = new CostomArray<PartTimer>();
		//Person person = new Person(1, " ", " ");
		
		for(int i = 0; i < 3; ++i) {
			students.add(Student.randomGenerator());
			partTimers.add(PartTimer.randomGenerator());
		}
		
		/**
		  * test Student class
		  */
		for(int i = 0; i < students.size(); ++i) {
			System.out.println("student" + i);
			System.out.println("ID: " + students.get(i).getID());
			System.out.println("name: " + students.get(i).getName());
			System.out.println("gender: " + students.get(i).getGender());
			System.out.println("nextID: " + Student.getNextID());
			System.out.println("inNormal:" + Student.isNormal(students.get(i)));
			students.get(i).work();
			students.get(i).eat();
			students.get(i).workPartTime();
			System.out.println();
		}
		/**
		  * test PartTimer class
		  */
		for(int i = 0; i < partTimers.size(); ++i) {
			System.out.println("partTimer" + i);
			System.out.println("ID: " + partTimers.get(i).getID());
			System.out.println("name: " + partTimers.get(i).getName());
			System.out.println("gender: " + partTimers.get(i).getGender());
			System.out.println("nextID: " + PartTimer.getNextID());
			System.out.println("isNormal: " + PartTimer.isNormal(partTimers.get(i)));
			partTimers.get(i).work();
			partTimers.get(i).eat();
			partTimers.get(i).workPartTime();
			System.out.println();
		}
		
		CostomArray<PartTimeJob> partTimeJobs = new CostomArray<PartTimeJob>();
		
		for(int i = 0; i < students.size(); ++i) {
			partTimeJobs.add(students.get(i));
		}
		for(int i = 0; i < partTimers.size(); ++i) {
			partTimeJobs.add(partTimers.get(i));
		}
		
		/**
		  * circuit 1(for)
		  */
		for(int i = 0; i < partTimeJobs.size(); ++i) {
			partTimeJobs.get(i).workPartTime();
		}
		System.out.println();
		
		/**
		  * circuit 2(while)
		  */
		int i = 0;
		while(i < partTimeJobs.size()) {
			partTimeJobs.get(i).workPartTime();
			++i;
		}
		System.out.println();
		
		/**
		  * circuit 3(do-while)
		  */
		i = 0;
		do {
			partTimeJobs.get(i).workPartTime();
			++i;
		} while (i < partTimeJobs.size());
		System.out.println();
	}
	
	/**
	  * Q10 code
	  */
	public static void Student100Test() {
		Student[] students = new Student[100];
		char[] thirdName = new char[students.length];
		
		for(int i = 0; i < students.length; ++i) {
			students[i] = Student.randomGenerator();
			students[i].setName();
			thirdName[i] = students[i].getName().charAt(3);
		}
		
		System.out.println(thirdName);
	}
	
	/**
	  * Q13 code(class data to file) 
	  */
	public static <T> void fileWriter(CostomArray<T> array) throws IOException {
		File classInfoFile = new File("files/out.txt");
		try {
			BufferedWriter fileBuffer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(classInfoFile)));
			StringBuilder fileContentsBuilder = new StringBuilder();
			
			fileContentsBuilder.append(array.size() + "\n");
			
			for(int i = 0; i < array.size(); ++i) {
				fileContentsBuilder.append(array.get(i).toString() + "\n");
			}
			
			fileBuffer.append(fileContentsBuilder);
			fileBuffer.flush();
			fileBuffer.close();
		} catch (FileNotFoundException e) {
			classInfoFile.createNewFile();
			fileWriter(array);
			return;
		}
	}
	
	/**
	  * Q13 code(file to class data)
	  */
	public static CostomArray<?> fileReader() throws IOException {
		File classInfoFile = new File("files/out.txt");
		CostomArray<?> classInfoArray = new CostomArray<>();
		try {
			BufferedReader fileBuffer = new BufferedReader(new InputStreamReader(new FileInputStream(classInfoFile)));
			String fileLine = fileBuffer.readLine();
			
			fileLine = fileBuffer.readLine();
			int classCount = Integer.parseInt(fileLine);
			String[][] splitLine = new String[100][];
			
			for(int i = 0; i < classCount; ++i) {
				fileLine = fileBuffer.readLine();
				splitLine[i] = fileLine.split(":|#");
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		
		return classInfoArray;
	}
}
