package assessment1;

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
	

}