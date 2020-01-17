package entity;

public class User {
	private int id;
	private String name;
	private int age;
	private String password;

	public User(int id, String name, int age, String password) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.password = password;
	}

	public User(String name) {
		super();
		this.name = name;
	}

	public User(int id) {
		super();
		this.id = id;
	}

	public User() {
		super();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPassword() {
		return password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", password=" + password + "]";
	}

}
