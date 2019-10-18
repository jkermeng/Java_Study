package dayaseven.quiz;

public class Teacher {
	private String name;
	private String sex;
	private int age;
	private int salary;

	public Teacher() {

	}

	public Teacher(String name, String sex, int age, int salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void addSalary() {
		int addS = 5000;
		addS += this.salary;
		System.out.println("加薪水后的总薪水" + addS);
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", sex=" + sex + ", age=" + age + ", salary=" + salary + "]";
	}

}
