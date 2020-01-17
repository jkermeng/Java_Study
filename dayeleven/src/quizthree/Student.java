package quizthree;

public class Student {
	private String name;
	private int age;
	private String degree;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public Student(String name, int age, String degree) {
		super();
		this.name = name;
		this.age = age;
		this.degree = degree;
	}
	public Student() {
		super();
	}

}
