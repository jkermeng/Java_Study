package setarray;

public class People implements Comparable<People> {
	private String name;
	private int age;

	public People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public People() {
		super();
	}

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

	@Override
	public int compareTo(People o) {
		int num = this.name.length() - o.getName().length();
		int num2 = num == 0 ? this.age - o.getAge() : num;
		int num3 = num2 == 0 ? this.name.compareTo(o.name) : num2;
		return num3;
	}

}
