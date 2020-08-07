package assessment1;

import java.util.ArrayList;
import java.util.*;

public class StudentMain {
	private Set<Student> store = new HashSet<>();
	private List<Student> list = new ArrayList<>();
	
	public static void main(String args[]) {
		StudentMain demo = new StudentMain();
		demo.runApp();
	}

	public void runApp() {
		try {
		Student student1 = new Student("s01", 23);
	    store.add(student1);
		Student student2 = new Student("s02",21);
		store.add(student2);
		Student student3 = new Student("s03",22);
		store.add(student3);
		Student student4 = new Student("s04",25);
		store.add(student4);

		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		
		System.out.println("***Displaying Students with age above 21");
		displayStudent();
		
	}catch (Exception e) {
		System.out.println("Sudent not found");
	}

}

	public void displayStudent() {
		for(int i=0; i<list.size();i++) {
			Student student = list.get(i);
			int age = student.getAge();
			if(age>21) {
			System.out.println("Roll no is "+student.getRollno()+" age is "+student.getAge());
		}
		}

	}
}

