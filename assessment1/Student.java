package assessment1;

import java.util.Objects;

public class Student {
	private String rollno;
	private int age;
	
	public Student(String rollno, int age) {
		this.rollno = rollno;
		this.age = age;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (!(object instanceof Student)) {
			return false;
		}
		Student other = (Student) object;
		return age == other.age && Objects.equals(rollno, other.rollno);
	}

}
