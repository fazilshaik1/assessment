package assessment1;

import java.util.*;

public class StudentMain {
	private Set<Student> store = new HashSet<>();
	
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
		Student student5 = new Student("s05",24);
		store.add(student5);
		
		System.out.println("***Displaying Students with age above 21***");
		List<Student> list = toList(store);
		
		System.out.println("***Displaying Students with even age***");
		Set<Student> set = toSet(store);
		
		System.out.println("***Displaying Students with odd age***");
		Set<Student> put = toPut(store);
		
		System.out.println("***Displaying all Students***");
		List<Student> list1 = toList1(store);
		
		
	}catch (Exception e) {
		System.out.println("Sudent not found");
	}

}

	public List<Student> toList1(Set<Student> store) {
		List<Student> list = new ArrayList<>();
		for(Student student: store) {
			list.add(student);
			System.out.println("Rollno is "+student.getRollno()+" Age is "+student.getAge());
		}
		return list;
	}

	public Set<Student> toPut(Set<Student> store) {
		Set<Student> put = new HashSet<>();
		for(Student student: store) {
			if(student.getAge()%2 != 0) {
				store.add(student);
				System.out.println("Rollno is "+student.getRollno()+" Age is "+student.getAge());
			}
		}
		return store;
	}

	public Set<Student> toSet(Set<Student> store) {
		Set<Student> set = new HashSet<>();
		for(Student student: store) {
			if(student.getAge()%2 == 0) {
				store.add(student);
				System.out.println("Rollno is "+student.getRollno()+" Age is "+student.getAge());
			}
		}
		return store;
	}

	public List<Student> toList(Set<Student> store) {
		List<Student> list = new ArrayList<>();
		for(Student student: store) {
			if(student.getAge() > 21) {
				list.add(student);
				System.out.println("Rollno is "+student.getRollno()+" Age is "+student.getAge());
			}
		}
		return list;
	}

}

