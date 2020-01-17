package arrlistlearn;

public class Student {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [ĞÕÃû=" + name + ", ÄêÁä=" + age + "]\n";
	}

}
